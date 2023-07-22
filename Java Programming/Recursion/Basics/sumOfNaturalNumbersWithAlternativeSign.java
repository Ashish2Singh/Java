public class sumOfNaturalNumbersWithAlternativeSign{
    public static int printSum(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return printSum(n-1)-n;
        }
        else{
            return printSum(n-1)+n;
        }
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(printSum(n));
    }
}