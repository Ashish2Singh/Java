public class binomial {
    public static int factorialof(int n){
        int fact=1;
       
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int binomialof(int n,int r){
       int n_fact=factorialof(n);
       int r_fact=factorialof(r);
       int n_r_fact=factorialof(n-r);
       int result=n_fact/((r_fact)*(n_r_fact));
       return result;
    }
    public static void main(String args[]){
        int n=5;
        int r=2;
        System.out.println("The binomial coefficent of n is :"+ binomialof(n,r));
    }
}
