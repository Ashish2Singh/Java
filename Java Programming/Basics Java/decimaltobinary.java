public class decimaltobinary {
    public static int DecimaltoBinary(int n){
        int sum=0;
        int power=0;
        while(n>0){
            int rem=n%2;
            sum+= rem*((int)Math.pow(10,power));
            power++;
            
            n/=2;

        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(DecimaltoBinary(15));
    }
}
