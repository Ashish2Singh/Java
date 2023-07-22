// java always calls by value i.e it gives the copy not the original value

public class callbyvalue {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+ a);
        System.out.println("b="+ b);
    }
    public static void main(String args[]){
        int a=10;
        int b=20;
        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.println("a="+ a);
        // System.out.println("b="+ b);
        swap(a,b);
    }
    
}
