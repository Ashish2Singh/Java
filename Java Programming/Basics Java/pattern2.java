import java.util.*;
public class pattern2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows= s.nextInt();
        // int i,j;
        // for(i=0;i<rows;i++){
        //     for(j=rows-i;j>0;j--){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
         int i,j;
        for(i=1;i<=rows;i++){
            for(j=1;j<=rows-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}