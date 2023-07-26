import java.util.*;
public class sortanarraylist {
    public static void main(String[] args) {
        
            ArrayList<Integer> list= new ArrayList<>();
            list.add(0);
            list.add(10);
            list.add(3);
            list.add(5);
            list.add(22);
            list.add(10);
            System.out.println("Original list: "+ list);
            
            Collections.sort(list); // it's a inbuilt function to sort
            System.out.println("Sorted List(Ascending Order): "+list);
            Collections.sort(list,Collections.reverseOrder());
            System.out.println("Sorted List(Descending Order): "+list);
    }
}
