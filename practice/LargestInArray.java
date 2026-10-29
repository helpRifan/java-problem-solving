// Practice - Find the largest element in an array (Easy)
// Idea: keep a running maximum while scanning once.
public class LargestInArray {
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largest(new int[]{3, 9, 2, 14, 7})); // 14
    }
}
