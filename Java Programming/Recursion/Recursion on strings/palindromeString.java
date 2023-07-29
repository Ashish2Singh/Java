import java.util.*;
public class palindromeString{
    public static String reverse(String str,int index){
        if(index==str.length())
        {
            return "";
        }
        String smallAns= reverse(str,index+1);
        char currChar=str.charAt(index);
        return smallAns+currChar;
    }
    //method 2
    static boolean isPalindrome(String s,int l, int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1));
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        // String rev=reverse(str,0);
        // if(rev.equals(str)){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }

        System.out.println(isPalindrome(str,0,str.length()-1));


    }
}
