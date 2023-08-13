import java.util.Scanner;
import java.util.Stack;

public class revstackRecursively {
    public static void pushAtBottom(Stack<Integer>st, int x){
        if(st.size()==0){ 
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    public static void reverse(Stack<Integer>st){
        if(st.size()==1) return;
        int top=st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.print("Enter the no. of elements: ");
        n= sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Original Stck is: ");
        System.out.println(st);
        reverse(st);
        System.out.println("New Reverse stack is: ");
        System.out.println(st);
    }
}
