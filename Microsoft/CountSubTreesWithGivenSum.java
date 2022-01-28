package Microsoft;

public class CountSubTreesWithGivenSum {
	class Tree
	{
	    int count;
	    int subTreeSum(Node root,int X)
	    {
	        if(root==null) return 0;
	int l =	subTreeSum(root.left,X);
	int r =	subTreeSum(root.right,X);

	int sum=root.data+l+r;
	if(sum==X) count++;
	return sum;
	}
	    int countSubtreesWithSumX(Node root, int X)
	    {
	 count=0;
		subTreeSum(root,X);
	    return count;
	    }
	}
}
