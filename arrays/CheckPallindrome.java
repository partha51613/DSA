/**
 * https://www.codingninjas.com/studio/problems/check-palindrome-recursive_624386
 */

public class CheckPallindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here
        int size = str.length() - 1;
        int i = 0;
        int j = size;
        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = new String("caac");
        System.out.println(isPalindrome(str));
    }
}
