public class stringBuilder{
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb);
        
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        // setCharAt(idx,ch) function

        sb.setCharAt(0,'D');
        System.out.println(sb);

        //insert(idx,ch) and deleteCharAt(idx)
        sb.insert(2,'p');
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        // reverse() and delete(i,j)

        StringBuilder sb1= new StringBuilder("Physics");
        sb1.reverse();
        System.out.println(sb1);

        sb1.delete(1,4);
        System.out.println(sb1);


    }
}