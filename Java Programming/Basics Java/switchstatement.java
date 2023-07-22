import java.util.*;
public class switchstatement{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.println("Enter the operation you want to perform:");
        char ch=s.next().charAt(0);
        switch(ch){
            case '+': System.out.println("Addition of two number is:"+ (num1+num2));
            break;
             case '-': System.out.println("Subtraction of two number is:"+ (num1-num2));
            break;
             case '*': System.out.println("Multiplication of two number is:"+ (num1*num2));
            break;
             case '/': System.out.println("Division of two number is:"+ (num1/num2));
            break;
             case '%': System.out.println("Modulo of two number is:"+ (num1%num2));
            break;
            default:
            System.out.println("Enter a valid operation!");
            

        }

        
    }
}