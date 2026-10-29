// Practice - Count vowels in a string (Easy)
// Idea: lowercase the string and count characters that are a, e, i, o, u.
public class CountVowels {
    public static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Programming")); // 3
    }
}
