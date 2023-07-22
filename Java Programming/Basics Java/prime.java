import java.util.*;
public class prime{
   
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=s.nextInt();
        boolean isPrime=true;
        if(num==2)
        {
             System.out.print("Number is  prime!!!!");
        }
        else{
        for(int i=2;i<=Math.sqrt(num);i++){ // we can also run the loop to square root n
            if(num%i==0){ // n is a multiple of i 
                isPrime=false;
            }
         }
        if(isPrime==true)
            {
                 System.out.print("Number is prime!!!!");
            }
        else{
                 System.out.print("Number is not prime!!!!");
            }
        }
    }
}