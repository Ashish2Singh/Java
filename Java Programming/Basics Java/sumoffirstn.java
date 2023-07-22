import java.util.*;
public class sumoffirstn{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to sum :");
        int num=s.nextInt();
        int sum=0;
        int counter=1;
        while(counter<=num){
            sum=sum+counter;
            counter++;
        }
        System.out.println("The sum of the number upto "+ num + " is "+ sum);
    }
}