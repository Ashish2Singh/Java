// copy contents of one stack to another in same order
import java.util.*;
public class copystack {
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
        // copy the va;lue of stack into another but in reverse order
        Stack<Integer> s=new Stack<>();
        while(st.size()>0){
            s.push(st.pop());
        }
        System.out.println("Reverse Stck is: ");
        System.out.println(s);
        Stack<Integer> gt=new Stack<>();
        while(s.size()>0){
            gt.push(s.pop());
        }
        System.out.println("Copied Stck is: ");
        System.out.println(gt);
    }
}
