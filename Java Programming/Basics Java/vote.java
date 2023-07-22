import java.util.*;
public class vote{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=s.nextInt();
        if(age>=18){
            System.out.println("He/She is adult and he/she can vote,drive,drink");
        }
        else{
            System.out.println("He/She cannot vote,drive and drink");
        }
    }
}