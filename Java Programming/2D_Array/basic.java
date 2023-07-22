import java.util.*;
public class basic{
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        Scanner s= new Scanner(System.in);
        /* to know the size of row, int n=matrix.length and 
        for column int m=matrix[0].length */
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=s.nextInt();

            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print( matrix[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}