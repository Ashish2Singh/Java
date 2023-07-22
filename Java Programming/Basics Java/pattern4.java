import java.util.*;
public class pattern4{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
        int rows= s.nextInt();
        int i,j;
        char ch='A';
        for(i=0;i<rows;i++){
            for(j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}