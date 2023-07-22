import java.util.*;
public class squarepattern{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows=s.nextInt();
        int counter=0;
        while(counter<rows){
            System.out.println("* * * *");
            counter++;
        }
    }
}