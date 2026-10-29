import java.util.*;

// CodeChef FLOW013 - Valid Triangles (Easy)
// Idea: three angles form a triangle if they sum to 180 and each is positive.
// When submitting on CodeChef, rename the class to Main.
public class FLOW013_ValidTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            boolean valid = a > 0 && b > 0 && c > 0 && a + b + c == 180;
            System.out.println(valid ? "YES" : "NO");
        }
    }
}
