public class print_k_Multiples{
    public static void printKmultiples(int num,int k){
        if(k==1){ // if(k==0) return; 
            System.out.print(num+" ");
            return;
        }
        printKmultiples(num,k-1);
        System.out.print(num*k+" ");
    }
    public static void main(String args[]){
        int num=3;
        int k=8;
        printKmultiples(num,k);
    }
}