import java.util.*;
public class factorial{
    public static int printFactorial(int n){
        if(n==0){
            return 1;
        }
       
        return n*printFactorial(n-1);

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=s.nextInt();
        System.out.println(printFactorial(n));
    }
}