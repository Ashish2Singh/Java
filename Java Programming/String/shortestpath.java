public class shortestpath{
    public static float displacement(String str){
         int x=0, y=0;
         for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            // South
            if(dir=='S'){
                y--;
            }
            // north
            else if(dir=='N'){
                y++;
            }
            // West
            else if(dir=='W'){
                x--;
            }
            // east
            else{
                x++;
            }
         }
         int x_square=x*x;
         int y_square=y*y;
         return (float)Math.sqrt(x_square + y_square);
    }
    public static void main(String args[]){
        String str="WNEENESENNNN";
        System.out.println(displacement(str));
    }
}