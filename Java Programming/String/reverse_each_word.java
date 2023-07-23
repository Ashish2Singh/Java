import java.util.*;
public class reverse_each_word {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder sb= new StringBuilder();
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" "; // adding the space 
                sb= new StringBuilder(""); // enpty the stringbuilder

            }
        }
        sb.reverse(); //here we are reversing the last word of string
        ans+=sb;
        System.out.println(ans);

    }
}
