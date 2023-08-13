import java.util.*;
public class basics {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(98);
        st.push(5);
        //size
        System.out.println("size is : "+st.size());
        // peek
        System.out.println(st.peek());
        System.out.println(st);
        //pop
        st.pop();
        System.out.println(st);
        System.out.println("size is : "+st.size());
    }
}
