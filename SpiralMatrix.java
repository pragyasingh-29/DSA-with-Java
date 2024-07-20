public class SpiralMatrix{

    public static void spiralMatrix(int matrix[][]){

           int startRow = 0;
           int startCol= 0;
           int endRow=matrix.length-1;
           int endCol = matrix[0].length-1;

           while(startRow <= endRow && startCol <= endCol){

           //Print Top Row

            for(int i=startCol ; i<=endCol ; i++){
                System.out.print(matrix[startRow][i] +" ");
           }

           //Print right Row

           for(int i=startRow+1 ; i<=endRow ; i++){
            System.out.print(matrix[i][endCol]+" ");
          }

            //Print bottom Row

            for(int i=endCol-1 ; i>=startCol ; i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+ " ");
            }

             //Print left Row

             for(int i=endRow-1 ; i>=startRow+1; i--){
                if(endCol == startCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            
            startCol++;
            startRow++;
            endRow--;
            endCol--;
           }
           System.out.println();

    }

    public static  void main (String[] args){
       int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
       spiralMatrix(matrix);
    }
}