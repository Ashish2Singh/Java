public class numberPowerof2{
    public static boolean numberPowerOf2(int n){
        return (n & (n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(numberPowerOf2(15));
    }
}