public class OddEven{
    public static void oddorEven(int n){
        int bitMask =1;
        if((n & bitMask)==0){
            //even number
            System.out.println(n+" is even number");
        }
        else{
            //odd number
            System.out.println(n+" is odd number");
        }
    }
    public static void main(String args[]){
        oddorEven(3);
        oddorEven(4);
    }
}