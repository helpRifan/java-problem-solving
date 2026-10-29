import java.util.*;

// CodeChef FLOW001 - Add Two Numbers (Easy)
// Idea: read T test cases, print A + B for each.
// When submitting on CodeChef, rename the class to Main.
public class FLOW001_AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.println(a + b);
        }
    }
}
