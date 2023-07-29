import java.util.*;
public class returnsubsequence{
    static  ArrayList<String> getSSQ(String s){
        ArrayList<String> ans= new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String> smallAns= getSSQ(s.substring(1)); //["bc","b","c",""]
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String args[]){
        String ans="abc";
        System.out.print(getSSQ(ans));

    }
}
