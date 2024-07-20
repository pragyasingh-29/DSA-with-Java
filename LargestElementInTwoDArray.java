public class LargestElementInTwoDArray{
    public static  void main (String[] args){
       int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int largest = Integer.MIN_VALUE; //infinity
        
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
          
         }
         System.out.print("Largest Element is:" + largest);

    }
}