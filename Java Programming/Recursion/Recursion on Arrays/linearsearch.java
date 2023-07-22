public class linearsearch{
    public static boolean linearSearch(int []arr,int target,int index){
        //base case
        if(index==arr.length){
            return false;
        }
        // self work

        if(arr[index]==target){
            return true;
        }
        return linearSearch(arr,target,index+1);
    }
    public static void main(String[] args){
        int[] arr={1,2,4,6};
        int target=5;
        int index=0;
        if(linearSearch(arr,target,index)){
            System.out.println("yes");

        }
        else{
            System.out.println("no");
        }
    }
}