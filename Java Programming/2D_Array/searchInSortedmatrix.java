public class searchInSortedmatrix{
    public static boolean Search(int matrix[][],int key){
        // int row=0;
        // int col=matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     // first logic
        //     if(matrix[row][col]==key){
        //         System.out.println("found key at (" + row + ","+ col +")");
        //         return true;
        //     }
        //     else if(key<matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //             row++;
        //         }
            
        // }
        // 2nd logic
        int row=matrix.length-1;
        int col=0;
        while(row>=0 && col<matrix[0].length){
        if(matrix[row][col]==key){
              System.out.println("found key at (" + row + ","+ col +")");
              return true;
        }
        else if(key<matrix[row][col]){
            row--;
        }
        else{
            col++;
        }
        }
        System.out.println("key not found!");
        return false;
    
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=90;
        Search(matrix,key);
    }
}