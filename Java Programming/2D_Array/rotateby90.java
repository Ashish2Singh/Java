import java.util.*;
public class rotateby90 {
    static void transpose(int matrix[][],int r,int c){
        int trans[][]=new int[r][c];
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
    }
    
    static void reverseArray(int matrix[]){
        int i=0;
        int j=matrix.length-1;
        while(i<j){
            int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int matrix[][],int r,int c){
        transpose(matrix,r,c);
        for(int i=0;i<r;i++){
            reverseArray(matrix[i]);
        }
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


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("Enter the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix");
        printMatrix(matrix);
        rotate(matrix,r,c);
        System.out.println("Rotated Matrix");
        printMatrix(matrix);

    }
}
