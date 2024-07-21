public class GetithBit {

    public static void getithBit(int n, int i){
        int bitwise = 1<<i;
        if((n & bitwise) == 0){
            System.out.println("ith bit is :" + 0);
        }else{
            System.out.println("ith bit is :" + 1);
        }
    }
    public static void main(String[]args){
        int n=10, i=3;
        getithBit(n, i);
    }
}
