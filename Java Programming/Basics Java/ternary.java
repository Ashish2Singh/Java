import java.util.*;
public class ternary{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        // syntax:  variable=condition?statement 1: statement2;
        //if condition is true then statement 1 will be executed otherwise i.e if condition is false
        // then statemnet 2 will be executed and result will be stored in the variable. : means nhi to
        System.out.println("Enter the number:");
        int num=s.nextInt();
        String type=((num%2)==0)?"even":"odd";
        System.out.println("Number is "+ type);
    }
}