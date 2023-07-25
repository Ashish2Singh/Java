import java.util.Scanner;

public class matrixmultiplication {
    static void matrixMultiplication(int matrix1[][],int matrix2[][],int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication not possible_wrong dimension");
            return;
        }
        int mult[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mult[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 matrix");
        printMatrix(mult);
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
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix1: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int matrix1[][]=new int[r1][c1];
        System.out.println("Enter the elemets of matrix 1:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of matrix2: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int matrix2[][]=new int[r2][c2];
        System.out.println("Enter the elemets of matrix 2:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix1:");
        printMatrix(matrix1);
        System.out.println("Matrix2:");
        printMatrix(matrix2);
        System.out.println("After Multiplication");
        matrixMultiplication(matrix1, matrix2, r1, c1, r2, c2);

    }
}
