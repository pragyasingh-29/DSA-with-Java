public class PalindromeString {
    public static boolean checkPalindrome(String str){
        int n =str.length();
            for(int i=0 ; i< str.length()/2;i++){
                if(str.charAt(i) != str.charAt(n-i-1)){
                    System.out.print("Not Palindrome");
                    return false;
                }
            }
            System.out.print("Palindrome Number");
            return true;
            }
       
    public static void main(String[]args){
        String str = "pragya";
        checkPalindrome(str);
    }
}

//time complexity O(n)