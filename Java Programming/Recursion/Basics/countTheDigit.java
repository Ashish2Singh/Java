import java.util.*;
public class countTheDigit{
    public static int count(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return count(n/10)+1;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=s.nextInt();
        System.out.println(count(n));
    }
}