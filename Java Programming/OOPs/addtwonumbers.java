class Algebra{
    int add(int a, int b){
        int ans=a+b;
        return ans;
    }
    
}
public class addtwonumbers{
public static void main(String args[]){
    Algebra obj= new Algebra();
    System.out.println("Sum of the two numbers is: ");
    int ans= obj.add(5,10);
    System.out.println(ans);
}
}