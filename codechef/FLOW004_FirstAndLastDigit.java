import java.util.*;

// CodeChef FLOW004 - First and Last Digit (Easy)
// Idea: last digit = n % 10; strip digits until one is left for the first digit.
// When submitting on CodeChef, rename the class to Main.
public class FLOW004_FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int last = n % 10;
            while (n >= 10) n /= 10;
            System.out.println(n + last);
        }
    }
}
