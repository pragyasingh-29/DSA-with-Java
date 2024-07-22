public class CheckPrime {
    public static int checkPrime(int n){
        if(n == 2){
            System.out.println("The given input is prime");
            return 1;
        }else{
            for(int i=2; i<n; i++){
                 if((n % i) == 0){
                      System.out.println("The given input is not prime");
                      System.out.print("The smallest possible divisor is:");

                      return i;
                 }
            }

        }
        System.out.println("The number is prime");
        return 1;
    }
    public static void main(String args[]){
        System.out.println(checkPrime(2));
    }
}
