// Practice - Print the first n Fibonacci numbers (Easy)
// Idea: each term is the sum of the previous two.
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // 0 1 1 2 3 5 8 13 21 34
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
