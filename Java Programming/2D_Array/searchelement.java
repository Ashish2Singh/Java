import java.util.*;
public class searchelement{
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("element fount at cell (" + i +"," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element is not found!");
        return false;
    }
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
        int key;
        System.out.println("Enter the key:");
        key=s.nextInt();
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print( matrix[i][j]+" ");
                
            }
            System.out.println();
        }
        search(matrix,key);
        
    }
}