import java.util.*;

// CodeChef FLOW007 - Reverse The Number (Easy)
// Idea: build the reversed number digit by digit; this also drops leading zeros.
// When submitting on CodeChef, rename the class to Main.
public class FLOW007_ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), rev = 0;
            while (n > 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            System.out.println(rev);
        }
    }
}
