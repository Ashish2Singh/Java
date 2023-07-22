/* Creating an array 
  dataType arrayName[]= new dataType[size];
  example:
  int marks= new int[50];
  int numbers[]={1,2,3};
  int moreNumbers[]={4,5,6};
  String fruits[]={"apple","mango","orange"};

*/

import java.util.*;
public class basic{
    public static void main(String args[]){
        int marks[]=new int[50];
        // how to take input in array
        Scanner sc= new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy: "+marks[0]);
        System.out.println("chm: "+marks[1]);
        System.out.println("math: "+marks[2]);
        
        // how to calculate the length of the array;

        System.out.println("Array Length: "+ marks.length);


    }
}