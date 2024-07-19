public class TotalPairsInArray {

    public static void totalPairs(int arr[]){
        int n = arr.length;
        int totalPairs = (n*(n-1))/2;
        System.out.println("The total Number of Pairs in Array are:" + totalPairs);
    }
    public static void main(String[]args){
        int arr[] = {2,4,6,8,10};
        totalPairs(arr);
    }
}
