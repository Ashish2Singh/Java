public class GCD{
    public static int Gcd(int x,int y){
        //Brute Force Approach

        // for(int i=y;i>=0;i--){
        //     if(x%i==0 && y%i==0){
        //         return i;
        //     }
        // }
        // return 1;

        //Long division approach

        // while(x%y!=0){
        //     int rem=x%y;
        //     x=y;
        //     y=rem;
        // }
        // return y;


        //Euclideans approach using recursion

        if(y==0){
            return x;
        }
        return Gcd(y,x%y);

    }
    public static void main(String args[]){
        
        int x=15;
        int y=24;
        int gcd=Gcd(x,y);
        int lcm=(x*y)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}