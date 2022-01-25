package amazon;

public class IsSudokuValid {
	static int isValid(int mat[][]){
        
         for(int a=0;a<9;a++)
       {
            for(int b=0;b<9;b++)
           {
               if(mat[a][b]!=0&&!isSafe(mat,a,b))
               {
                   return 0;
               }
           } 
       }
       return 1;
   }
   static boolean isSafe(int mat[][],int rowIndex,int colIndex)
   {
       for(int i=0;i<9;i++)
       {
           if(mat[rowIndex][colIndex]==mat[rowIndex][i]&&colIndex!=i)
           {
               return false;
           }
           if(mat[rowIndex][colIndex]==mat[i][colIndex]&&rowIndex!=i)
           {
               return false;
           }
       }
       int row=rowIndex-rowIndex%3;
       int col=colIndex-colIndex%3;
       for( int i=0;i< 3;i++)
       {
            for(int j=0;j<3;j++)
           {
               if(mat[rowIndex][colIndex]==mat[row+i][col+j]&&rowIndex!=row+i&&colIndex!=col+j)
               {
                   return false;
               }
           } 
       }
       return true;
   }
}
