import java.util.*;
public class reverseastring{
    public static String reverse(String str,int index){
        if(index==str.length())
        {
            return "";
        }
        String smallAns= reverse(str,index+1);
        char currChar=str.charAt(index);
        return smallAns+currChar;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(reverse(str,0));
    }
}
