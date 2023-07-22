import java.util.*;
public class diagonalsum{
    // Brute force (Time Complexity(n2)
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         /*jb humlog traverse krenge tb overllaping wala ek hi bar 
        //         add hoga  ..jaisa ki ek ek element krke humlog traverse kr rhe 
        //         hai isliye wo pehle i==j check krega aur 5 mai i==j hai
        //         isliye wo add hojayega..aur wo else if wala condition mai nhi jayega
            
        //         */
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
            
        //         else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        //optimised approach (time Complexity (n))
        for(int i=0;i<matrix.length;i++){
            // PRIMARY DIAGONAL
            sum+=matrix[i][i];
            // secondary diagonal
            if(i!=matrix.length-1-i){
           
            sum+=matrix[i][matrix.length-i-1]; //i+j=n-1 therefore j=n-1-i
          }
        }

        return sum;
    }
    public static void main(String args[]){
       int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int result=diagonalsum(matrix);
        System.out.println(result);
    }
}

