import java.util.*;
public class largestof2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=s.nextInt();
        System.out.println("Enter the second the number:");
        int num2=s.nextInt();
        if(num1>num2){
            System.out.println("First number is greater than second");
        }
        else if(num1==num2){
            System.out.println("Both are equal!");
        }
        else{
            System.out.println("Second is greater than first!");
        }
    }
}