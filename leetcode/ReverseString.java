import java.util.*;

// LeetCode 344 - Reverse String (Easy)
// Idea: two pointers swap characters from both ends moving inward.
public class ReverseString {
    public static void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (l < r) {
            char tmp = s[l];
            s[l++] = s[r];
            s[r--] = tmp;
        }
    }

    public static void main(String[] args) {
        char[] s = "hello".toCharArray();
        reverseString(s);
        System.out.println(Arrays.toString(s)); // [o, l, l, e, h]
    }
}
