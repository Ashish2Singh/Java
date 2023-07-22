import java.util.*;
public class largestof3{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int num1=s.nextInt();
         int num2=s.nextInt();
          int num3=s.nextInt();
          int largest;
          if(num1>=num2 && num1>=num3){
            largest=num1;
          }
          else if(num2>=num1 && num2>=num3){
            largest=num2;
          }
          else{
            largest=num3;
          }
          System.out.println("Largest number is : "+ largest);
    }
}