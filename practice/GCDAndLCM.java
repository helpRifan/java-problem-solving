// Practice - GCD and LCM of two numbers (Easy)
// Idea: Euclid's algorithm for GCD; LCM = a * b / GCD.
public class GCDAndLCM {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        int g = gcd(a, b);
        System.out.println("GCD = " + g);            // 6
        System.out.println("LCM = " + (a / g * b));  // 36
    }
}
