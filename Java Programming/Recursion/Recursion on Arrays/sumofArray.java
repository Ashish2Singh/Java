public class sumofArray{
    public static int sum(int []arr, int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int smallAns=sum(arr,index+1);
        return arr[index]+smallAns;
    }
    public static void main(String args[]){
        int [] arr={2,3,5,20,1};
        int index=0;
        System.out.println(sum(arr,index));

    }
}