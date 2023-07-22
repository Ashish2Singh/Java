import java.util.*;
public class keepenetringnumberstillamultipleof10{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        do{
            System.out.print("enter the number:");
            int n=s.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
    
}