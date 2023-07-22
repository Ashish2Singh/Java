public class printnto1{
    public static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printIncreasing(n-1);
        
    }
    public static void main(String args[]){
        int n=7;
        printIncreasing(n);
    }
}