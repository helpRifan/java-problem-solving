import java.util.*;

// CodeChef FLOW006 - Sum of Digits (Easy)
// Idea: repeatedly add n % 10 and divide n by 10.
// When submitting on CodeChef, rename the class to Main.
public class FLOW006_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}
