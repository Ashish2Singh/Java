import java.util.*;
public class removealloccurenecesofA{
    public static String removeoccurence(String str,int index){
        if(index==str.length())
        {
            return "";
        }
        String smallAns= removeoccurence(str,index+1);
        char currChar=str.charAt(index);
        if(currChar!='a'){
            return currChar+smallAns;
        }
        else{
            return smallAns;
        }
    }
    //Method 2

    static String method2(String s){
        if(s.length()==0){
            return "";
        }
        String smallAns=method2(s.substring(1));
        char currChar=s.charAt(0);
        if(currChar!='a'){
            return currChar+smallAns;
        }
        else{
            return smallAns;
        }

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(method2(str));
    }
}