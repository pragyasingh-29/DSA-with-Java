import java.util.*;

public class anagrams {
    public static boolean anagram(String str1, String str2){
            String normalized1 = str1.replaceAll("\\s+", "").toLowerCase();
            String normalized2 = str2.replaceAll("\\s+", "").toLowerCase();

            if(normalized1.length() != normalized2.length()){
                System.out.println("The two strings are not anagrams");
                return false;
            }else{
                char[] arr1 = normalized1.toCharArray();
                char[] arr2 = normalized2.toCharArray();

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                return Arrays.equals(arr1,arr2);

            }

    }
    public static void main(String[]args){
        String str1 = "racer";
        String str2 = "care";
        System.out.println(anagram(str1,str2));
    }
}
