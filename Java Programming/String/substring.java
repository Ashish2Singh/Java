public class substring{
    public static String substring(String str,int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="Hello World";

       // System.out.println(substring(str,0,7));

      // using function
      System.out.println(str.substring(0,5));

    }
}