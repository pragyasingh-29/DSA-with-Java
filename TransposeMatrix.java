public class TransposeMatrix {
     public static void transposeMatrix(int matrix[][]){
            int row = matrix.length;
            int col = matrix[0].length;

            int [][] transpose = new int[col][row];

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                  transpose[j][i] = matrix[i][j];
            }
     }

     int n = transpose.length;
     int m = transpose[0].length;

     //print

     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){

       System.out.print(transpose[i][j]+ " ");

    }
    System.out.println();
 }
}

     public static void main(String[]args){g
        int matrix[][] = {
             {1,2,3},
             {4,5,6}
        };
        transposeMatrix(matrix);
     }
}
