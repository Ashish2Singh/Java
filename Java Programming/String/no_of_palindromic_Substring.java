import java.util.*;
public class no_of_palindromic_Substring {

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
    public static void main(String args[]){
        // Scanner sc= new Scanner(System.in);
        // String str= sc.nextLine();

        // check whether a string is palindrome or not
       /*  StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        String s= sb+""; // we cannot convert StringBuilder to s6tring so we ad an empty string to stringbuilder to convert it to the string . It's normally a hack
        if(str.equals(s)){
            System.out.println("Palindromiuc String");
        }
        else{
            System.out.println("Non Palindromic String!");
        }
        */

        // 2nd process
        // the both process ar for the palindrome not for counting the palindromicsubstring
        
       /*  int i=0;
        int j= str.length()-1;
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
            
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome!");
        }
        */
        // counting the number of palindromic substring

        String str="abbd";
        int count=0;

        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Total number of palindromic substring is :" + count);


    }
}
