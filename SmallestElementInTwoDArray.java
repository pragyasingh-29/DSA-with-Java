public class SmallestElementInTwoDArray{
    public static  void main (String[] args){
       int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int smallest = Integer.MAX_VALUE; //infinity
        
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
          
         }
         System.out.print("Smallest Element is:" + smallest);

    }
}