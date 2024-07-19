public class invertedPattern{
    public static int binarySearch(int arr[], int key){
         int start = 0;
         int end = arr.length-1;
       while(start <= end){
         int midNum = (start+end)/2;
         if(arr[midNum] == key){
           return midNum;
         }
         if(midNum > key){
              end = midNum-1;
         }else{
            start = midNum+1;
         }
       }
       return -1;
      }
   public static void main(String[] args){
        int arr[] = {2,4,6,8,12,14};
        int key = 6;
        System.out.println(binarySearch(arr,key));
    }
}