import java.util.*;
public class returnspiralmatrix{
    public static int[][] printSpiral(int n){
        int matrix[][]=new int[n][n];
        int count=1;
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            // top 
            for(int j=startCol;j<=endCol;j++){
                matrix[startRow][j]=count++;
            }
            // right
            for(int i=startRow+1;i<=endRow;i++ ){
                matrix[i][endCol]=count++;
            }
             
            // bottom
            for(int j=endCol-1;j>=startCol;j--){
                 if(startRow==endRow){
                    break;
                }
               
                matrix[endRow][j]=count++;
            }
            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                 if(startCol==endCol){
                    break;
                }
                matrix[i][startCol]=count++;
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return matrix;
       
    }
    static void printMatrix(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=printSpiral(n);
        printMatrix(matrix);
    }
}