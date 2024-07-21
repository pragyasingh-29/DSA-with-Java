public class EvenOrOddBitwise{

    public static void EvenOrOdd(int n){
        int bitwise = 0;

        if((n & bitwise) == 0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
    public static void main(String[]args){
        int n = 6;
        EvenOrOdd(n);
    }
}