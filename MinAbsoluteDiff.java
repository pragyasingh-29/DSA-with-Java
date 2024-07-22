import java.util.*;

public class MinAbsoluteDiff {

    public static void minAbsoluteDiff(int arr[]){
        int minAbsDiff = 0;
        int minValue = Integer.MAX_VALUE;
        List<int[]> pairs = new ArrayList<>();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=1 ; i<arr.length;i++){
            
                minAbsDiff = arr[i] - arr[i-1];
                if(minAbsDiff < minValue){
                    minValue = minAbsDiff;
                    pairs.clear();
                    pairs.add(new int[]{arr[i-1],arr[i]});
            }else if(minAbsDiff == minValue){
                pairs.add(new int[]{arr[i-1],arr[i]});
            }
        }

        for(int[]pair : pairs){
            System.out.println("(" + pair[0] + "," + pair[1] + ")");

        }
       
        System.out.println(minValue);
    }
    public static void main(String[]args){
        int arr[] = {4,2,1,3};
        minAbsoluteDiff(arr);
    }
}
