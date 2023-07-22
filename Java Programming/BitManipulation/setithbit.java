public class setithbit{
    public static int setithBit(int n,int i){
        int bitMask =(1<<i);
        return n | bitMask; 
    }
    public static void main(String args[]){
        int result=setithBit(3,2);
        System.out.println(result);
        result=setithBit(4,2);
        System.out.println(result);
    }
}