public class DiagonalSum{

    public static int diagonalSum(int matrix[][]){
        int leftDiagonalSum = 0 ;
        int rightDiagonalSum = 0 ;
        //left Diagonal

        for(int i=0; i<matrix.length;i++){
            leftDiagonalSum = leftDiagonalSum +  matrix[i][i];
            if(i != matrix[i][matrix.length-1-i]){
                rightDiagonalSum = rightDiagonalSum + matrix[i][matrix.length-i-1];
            }
        }

       int totalSum =  rightDiagonalSum + leftDiagonalSum;
       return totalSum;
    }
    public static void main(String[]args){
        int matrix[][] =   {{1,2,3},
                            {5,6,7},
                            {9,10,11}
                            };

                            System.out.print(diagonalSum(matrix));
    }
}