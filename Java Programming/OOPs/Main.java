// Example 1

// public class Person{
//     int age=20;
//     public static void main(String args[]){
//         Person Rohan =new Person();
//         System.out.println(Rohan.age);
//     }
// }
// Example 2

// Note : There should be only one public class but there may be many classes

class Student{
    int roll;
    String studentName;
}
public class Main{

public static void main(String args[]){
        Student obj1= new Student();
        Student obj2= new Student();
        obj1.roll=18;
        obj1.studentName="Ashish Singh";
        obj2.roll=19;
        obj2.studentName="Ashish";
        System.out.println(obj1.roll);
        System.out.println(obj1.studentName);
         System.out.println(obj2.roll);
        System.out.println(obj2.studentName);

        
    }
}
