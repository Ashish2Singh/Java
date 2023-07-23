public class binarytodecimal{
    public static int binaryDecimal(int n){
        int sum=0;
        int pow=0;
        while(n>0){
            int lastdigit=n % 10;
            sum+= (lastdigit *((int)Math.pow(2,pow)));
            n/=10;
            pow++;
        // for(int i=0;n>0;i++){
        //     int Lastdigit=n%10;
        //     sum=sum+lastDigit*pow(2,i);
        //     n/=10;
        // }  .....it can also be done in this way
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(binaryDecimal(1101));
    }
}