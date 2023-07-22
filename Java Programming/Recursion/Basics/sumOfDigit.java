import java.util.*;
public class sumOfDigit{
    public static int sum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return sum(n/10)+n%10;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=s.nextInt();
        System.out.println(sum(n));
    }
}