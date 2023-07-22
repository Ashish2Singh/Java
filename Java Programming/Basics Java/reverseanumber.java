import java.util.*;
public class reverseanumber{
    public static void main(String args[]){
        System.out.print("Enter the number:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int num1=num;
        int result=0;
        while(num!=0){
            int lastdigit = num%10;
            result=result*10+lastdigit;
            num/=10;
        }
        System.out.println("The reverse number of the number "+num1 +" is " + result);
    }
}