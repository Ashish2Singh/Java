import java.util.*;
public class incometax{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the income");
        int income=s.nextInt();
        int tax;
        if(income<500000){
            tax=0;
            //System.out.println("The tax amount is :"+ tax);
        }
        else if(income>=500000 && income<1000000){
            tax=(int)(income*0.2);
            //System.out.println("The tax amount is :"+ tax);
        }
        else{
            tax=(int)(income*0.3);
            //System.out.println("The tax amount is :"+ tax);
        }
        //instead of writing repeatitively print statement we can also do the below
        System.out.println("The tax amount is:"+ tax);
    }
}