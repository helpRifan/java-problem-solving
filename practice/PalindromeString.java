// Practice - Check whether a string is a palindrome (Easy)
// Idea: compare characters from both ends moving inward, ignoring case.
public class PalindromeString {
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam"));  // true
        System.out.println(isPalindrome("Hello"));  // false
    }
}
