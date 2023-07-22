import java.util.*;
public class toggleallcharacters {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder sb= new StringBuilder();

        // toggle

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                sb.append(Character.toLowerCase(ch));
            }
            else{
                sb.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);

    }
}

 
