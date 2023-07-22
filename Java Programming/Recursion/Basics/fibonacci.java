import java.util.*;
public class fibonacci{
    public static int printfibonacci(int n){
        if(n==0 || n==1){
            return 0;
        }
        return printfibonacci(n-1)+printfibonacci(n-2);

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=s.nextInt();
        for(int i=0;i<=n;i++){
        System.out.println(printfibonacci(i));}
    }
}