public class primeinrange{
       public static boolean isPrime(int n){
        boolean isPrime= true;
        if(n==2){
            return true;
        }

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                // or return false instead of isPrime =false;
                break;
            }
        }
        return isPrime; //// or return false instead of isPrime i.e. return true;
    }

    public static void primeInRange(int n){
        
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


 public static void main(String args[]){
        primeInRange(100);
    }
}