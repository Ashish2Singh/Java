import java.util.*;
public class operators{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first number:");

        int a= s.nextInt();
        System.out.println("Enter the second number:");
        int b= s.nextInt();
        // Arithmetic Operators
        System.out.println("Addition of two number is: "+ (a+b));
        System.out.println("Subtraction of two number is: "+ (a-b));
        System.out.println("Muyltiplicatrion of two number is: "+ (a*b));
        System.out.println("Division of two number is: "+ (a/b));
        System.out.println("Modulo of two number is: "+ (a%b));
        // Unary Operators
        
        /* Pre increment (++a) i.e. first the value will change(i.e. it will incremented by 1) then value will use
        Post increment(a++) i.e. first the value will use then it will change
        Pre  decremnet(--a) i.e. first the value will change(i.e. it will decremneted by 1) then value will use
        Post decremnet(a--) i.e. first the value will use then it will change
        */
       
        int c=++a;
        System.out.println(a);
        System.out.println(c);
      
        int d=a++;
         System.out.println(a);
        System.out.println(d);

        //Relational Operator

        /* equal to (==)
        not equal to(!=)
        greater than(a>b)
        lesser than(a<b)
        greater than equal to(>=)  
        lesser than equal to(<=)
        */

        //Logical Operators
        /*
        Logical AND(&&)
        Logical OR(||)
        Logical NOT(!) 
        */

        //Assignment Operators
        /* 
        =
        +=
        -=
        *=
        /=
        
        */



    }
}