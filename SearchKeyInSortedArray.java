public class SearchKeyInSortedArray {
    public static boolean searchInSortedArray(int matrix[][], int key){
           int row = 0, col = matrix[0].length-1;
           while(row<matrix.length && col >0){
              if(matrix[row][col] == key){
                System.out.print("Matrix found at:" + "(" + row + ","+ col + ")");
                return true;
              }
              else if(key < matrix[row][col]){
                col--; //move left
              }else{
                row++; //move downwards
              }
           }
           System.out.println("Key not found");
           return false;

    }
    public static void main(String[]args){
     int arr[][] = {{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
     int key = 37;
     searchInSortedArray(arr, key);
    }

    //time complexity is O(n+m)
}
