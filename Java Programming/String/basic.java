public class basic{
    public static void main(String args[]){
        // char arr[]={'a','b','c','d'};
        // // how to declare string (two ways are given below)
        // String str="abcd";
        // String str2= new String("xyz");

        // // Strings are IMMUTABLE

        // Scanner sc=new Scanner(System.in);
        // String name;
        // // name=sc.next(); // it takes only the single word
        // name =sc.nextLine(); // it takes one or more than one word

        // String fullname="Ashish Singh";
        // System.out.println(fullName.length());// it gives the length of the string including space
        // // concatenation

        String firstname="Ashish";
        String lastname="Singh";

        String fullname = firstname + " " + lastname; //concatenation

        System.out.println(fullname);

        System.out.println(fullname.charAt(0)); // it will return A as the 0th number letter is A
        

    }
}