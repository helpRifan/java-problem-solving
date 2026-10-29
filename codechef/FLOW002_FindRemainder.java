import java.util.*;

// CodeChef FLOW002 - Find Remainder (Easy)
// Idea: print A % B for each test case.
// When submitting on CodeChef, rename the class to Main.
public class FLOW002_FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.println(a % b);
        }
    }
}
