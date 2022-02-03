package Intuit;
import java.util.*;

public class QuadTree {
 public static void main(String[] args) {
     int[][] grid = {{0,1},{1,0}};

     construct(grid);

 }

 private static void construct(int[][] grid) {
     if (grid == null || grid.length == 0) {
         return;
     }

     construct(grid, 0, grid.length - 1, 0, grid.length - 1);
     System.out.println("Quad Tree Created");
 }

 private static Node construct(int[][] grid, int startX, int endX, int startY, int endY) {
     if (startX == endX) {
         return new Node(grid[startX][startY] == 1, true);
     }

     int midX = (startX + endX) / 2;
     int midY = (startY + endY) / 2;
     Node node = new Node();

     Node topLeft = construct(grid, startX, midX, startY, midY);
     Node bottomLeft = construct(grid, midX + 1, endX, startY, midY);
     Node topRight = construct(grid, startX, midX, midY + 1, endY);
     Node bottomRight = construct(grid, midX + 1, endX, midY + 1, endY);

     if (topLeft.isLeaf && bottomLeft.isLeaf && topRight.isLeaf && bottomRight.isLeaf
             && topLeft.val == bottomLeft.val && topLeft.val == topRight.val && topLeft.val == bottomRight.val) {
         node.val = topLeft.val;
         node.isLeaf = true;
     } else {
         node.topLeft = topLeft;
         node.bottomLeft = bottomLeft;
         node.topRight = topRight;
         node.bottomRight = bottomRight;
     }
     return node;
 }

 private static class  Node {
     public boolean val;
     public boolean isLeaf;
     public Node topLeft;
     public Node topRight;
     public Node bottomLeft;
     public Node bottomRight;


     public Node() {
         this.val = false;
         this.isLeaf = false;
         this.topLeft = null;
         this.topRight = null;
         this.bottomLeft = null;
         this.bottomRight = null;
     }

     public Node(boolean val, boolean isLeaf) {
         this.val = val;
         this.isLeaf = isLeaf;
         this.topLeft = null;
         this.topRight = null;
         this.bottomLeft = null;
         this.bottomRight = null;
     }
 }
}

//https://leetcode.com/problems/construct-quad-tree/