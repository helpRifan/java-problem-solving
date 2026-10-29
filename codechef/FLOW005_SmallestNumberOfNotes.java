import java.util.*;

// CodeChef FLOW005 - Smallest Numbers of Notes (Easy)
// Idea: greedy - use the largest note first (100, 50, 10, 5, 2, 1).
// When submitting on CodeChef, rename the class to Main.
public class FLOW005_SmallestNumberOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = {100, 50, 10, 5, 2, 1};
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), count = 0;
            for (int note : notes) {
                count += n / note;
                n %= note;
            }
            System.out.println(count);
        }
    }
}
