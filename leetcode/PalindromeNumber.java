// LeetCode 9 - Palindrome Number (Easy)
// Idea: reverse the number and compare with the original.
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x, rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(-121)); // false
    }
}
