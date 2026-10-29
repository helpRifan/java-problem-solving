// Practice - Check whether a number is prime (Easy)
// Idea: test divisors only up to sqrt(n).
public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(29)); // true
        System.out.println(isPrime(30)); // false
    }
}
