// Multiple functions with the same name but different parameters.

// functional overlading only depends on the parameter not on the return type(like float ,int etc.).

public class functionoverloading{
    public static int sum(int a, int b){
        return a+b;
    }
    //  public static float sum(int a, int b) , it will throw an error bcoz paramters are same inspite of different return type.
    
    
    //  public static float sum(float a, float b){
    //     return (a+b);
    //  }  //  .................................... it doesn't throw error because parameters are different.
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(3,5));
        // System.out.println(sum(3.2f,5f));
        System.out.println(sum(5,2,3));
    }
}