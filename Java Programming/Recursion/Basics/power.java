import java.util.*;
public class power{
    public static int poweroftwonumbers(int p,int q){
        if(q==0){
            return 1;
        }
        // return p * poweroftwonumbers(p,q-1);
       // Alternative Approach
        int smallpow=poweroftwonumbers(p,q/2);
        if(q%2==0){
            return smallpow*smallpow;
        }
        else{
            
            return p*smallpow*smallpow;
        }
    }
    public static void main(String args[]){
        int p=5;
        int q=4;
        System.out.println(poweroftwonumbers(p,q));
    }
}