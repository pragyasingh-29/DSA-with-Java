public class AppearsTwice{

    public static boolean checkAppearance(int arr[]){
        for(int i=0; i< arr.length; i++){
             for(int j=i+1; j< arr.length; j++){
                  if(arr[i] == arr[j]){
                    return true;
                  }
             }
        }
        return false;
    }
    public static void main(String[] args){
        // int arr[] = {2,4,6,8,10,4,8,8,6};
        int arr[] = {2,4,6,8,10};

       System.out.println(checkAppearance(arr));
    }
}