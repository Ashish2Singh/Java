
public class factorial{
    public static int factorialof(int n){
        int fact=1;
       
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n=0;
        int result=factorialof(n);
        System.out.println("Factorial of n is : "+ result);


    }
}
