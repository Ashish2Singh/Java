public class palindrome{
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("No it's a palindrome!");
                return false;

            }
            
        }
        System.out.println("Yes it's a palindrome!");
        return true;
    }
    public static void main(String args[]){
        String str= "racecar";
        isPalindrome(str);
    }
}