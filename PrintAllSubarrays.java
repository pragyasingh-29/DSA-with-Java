public class PrintAllSubarrays {

    public static void maxSubArraySum(int arr[]){
        int sum =0;
        int maxSum = Integer.MIN_VALUE;

         for(int i=0; i< arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                
                for(int k=i;k<j;k++){
                    sum += arr[k];
                }
                System.out.println(sum);
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
         }
         System.out.print(maxSum);
    }
    public static void main(String[]args){
        int arr[] = {2,4,6,8,10};
        maxSubArraySum(arr);
    }
}
