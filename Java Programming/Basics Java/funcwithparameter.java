/*  Syntax:
returnType name(type param1,type param2){
    //body
    return statement;
}
*/

import java.util.*;
public class funcwithparameter{
    public static void calculateSum(int num1,int num2){ // parameters or formal parameters
        int sum=num1+num2;
        System.out.println("the sum is:"+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        calculateSum(num1,num2); // arguments or actual parameters
    }
}