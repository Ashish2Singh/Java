import java.util.*;

public class returnalltheindices{
    public static void findallindices(int [] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            System.out.print(index+" ");
        }
        findallindices(arr,target,index+1);
    }

   // through 2nd process,  here we are returning the values not printing
static ArrayList<Integer> allIndices(int []arr,int target,int index){
     if(index==arr.length){
            return new ArrayList<Integer>(); // return empty list
        }
        ArrayList<Integer>ans=new ArrayList<>();
         if(arr[index]==target){
            ans.add(index);
        }
        ArrayList<Integer> smallAns=allIndices(arr,target,index+1);
        ans.addAll(smallAns);
        return ans;
   }

    public static void main(String[] args){
        int[] arr={1,2,4,6,3,2,5,2,5};
        int target=2;
        int index=0;
      ArrayList<Integer> ans=allIndices(arr,target,index);
      for(Integer i:ans){
        System.out.print(i+" ");
      }
    }
}
