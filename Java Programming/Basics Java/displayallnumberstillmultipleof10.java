import java.util.*;
public class displayallnumberstillmultipleof10{
    public static void main(String args[]){
         Scanner s=new Scanner(System.in);
        do{
            System.out.print("Enter the number:");
            int n=s.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
        
    }
}