public class clearithbit{
    public static int clearithBit(int n,int i){
        int bitMask =~(1<<i);
        return n & bitMask; 
    }
    public static void main(String args[]){
        int result=clearithBit(3,2);
        System.out.println(result);
        result=clearithBit(4,2);
        System.out.println(result);
        result=clearithBit(10,1);
        System.out.println(result);
    }
}