import java.util.*;
public class print1to10{
    public static void main(String args[]){
        int i=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print:");
        int n=s.nextInt();
        // using while loop
        // while(i<=10){
        //     System.out.print(i+" ");
        //     i++;
        // }
        //print 1 to n
         while(i<=n){
            System.out.print(i+" ");
            i++;
        }

    }
}