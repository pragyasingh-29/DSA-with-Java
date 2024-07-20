public class SumElemOfSecondRow {

    public static int sumElements(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix[0].length; i++){
            sum += matrix[1][i];
        }
        return sum;
    }
    public static void main(String[]args){
        int matrix[][] ={
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };

        System.out.println(sumElements(matrix));
    }
}
