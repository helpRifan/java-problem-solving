import java.util.*;

// CodeChef TEST - Life, the Universe, and Everything (Easy)
// Idea: print numbers as they come, stop when 42 is read (do not print 42).
// When submitting on CodeChef, rename the class to Main.
public class TEST_LifeTheUniverseAndEverything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 42) break;
            System.out.println(n);
        }
    }
}
