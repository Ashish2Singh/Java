
//  Wrapper class: A class whose object contains or wraps primitive data type(PDT)
// A object of wrapper class contains a firld which stores PDT.

// ArrayList Class= Syntax: List<AnyClass> list= new ArrayList<AnyClass>();
import java.util.*;
public class Basics{
    public static void main(String args[]){
        //wrapper classes
        Integer in= Integer.valueOf(4);
        System.out.println(in);
        Float f=Float.valueOf(4.5f);
        System.out.println(f);

        // array list
        ArrayList<Integer>l1=new ArrayList<>();
        // add new element
        l1.add(5); //5  //it will add the element in the array list at the end
        l1.add(6); // 5 6
        l1.add(7); // 5 6 7
        l1.add(8);
        // get an element at index i;
        System.out.println(l1.get(1));

        // print with for loop
        
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        // printing the array list directly
        System.out.println(l1); //[5,6,7,8]
        // adding an element at index some index i 
        l1.add(1,100);
        System.out.println(l1); // [5, 100, 6, 7, 8]

        // modifying element at index i
        l1.set(1,10);
        System.out.println(l1); // [5,10,6,7,8]
        // removing an element at index 1
        l1.remove(1);
        System.out.println(l1); // 5,6,7,8

        // removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1); // 5,6,8

        // checking if an element exists
        boolean ans=l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // if you don't specify class, you can put anything inside l

        ArrayList l = new ArrayList();
        l.add("Ashish");
        l.add(1);
        l.add(true);
        System.out.println(l);


    }
}