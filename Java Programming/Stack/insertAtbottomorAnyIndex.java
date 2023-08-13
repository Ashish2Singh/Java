import java.util.*;
public class insertAtbottomorAnyIndex {
    public static void insertElementinStack(Stack<Integer> st,int index,int x){
        Stack<Integer> rt=new Stack<>();
        while(st.size()>index){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("After inserting the element at the index: ");
        System.out.println(st);
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
        insertElementinStack(st,2,7);  
        insertElementinStack(st,3,9);
    }
}
