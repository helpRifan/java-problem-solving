import java.util.*;

// LeetCode 13 - Roman to Integer (Easy)
// Idea: if a symbol is smaller than the next one, subtract it; otherwise add it.
public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> v = new HashMap<>();
        v.put('I', 1); v.put('V', 5); v.put('X', 10); v.put('L', 50);
        v.put('C', 100); v.put('D', 500); v.put('M', 1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = v.get(s.charAt(i));
            if (i + 1 < s.length() && cur < v.get(s.charAt(i + 1))) total -= cur;
            else total += cur;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }
}
