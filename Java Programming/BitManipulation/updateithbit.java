public class updateithbit{
    public static int setithBit(int n,int i){
        int bitMask =(1<<i);
        return n | bitMask; 
    }
    public static int clearithBit(int n,int i){
        int bitMask =~(1<<i);
        return n & bitMask; 
    }
    public static int updateithBit(int n,int i,int newBit){
        // if(newBit==0){
        //     return clearithbit(n,i);
        // }
        // else{
        //     return setithbit(n,i);
        // }
        n=clearithBit(n,i);
        int Bitmask=newBit<<i;
        return n| Bitmask;
    }
    public static void main(String args[]){
        
        System.out.println(updateithBit(10,2,1));
        
    }
}