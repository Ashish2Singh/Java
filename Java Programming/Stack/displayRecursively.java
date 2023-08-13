import java.util.Scanner;
import java.util.Stack;

public class displayRecursively {
    public static void displayRevRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top= st.pop();
        System.out.println(top+" ");
        displayRevRec(st);
        st.push(top);
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
        displayRevRec(st);
    }
}
