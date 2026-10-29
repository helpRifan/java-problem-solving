// Practice - Binary search on a sorted array (Easy)
// Idea: repeatedly halve the search range by comparing with the middle element.
public class BinarySearch {
    public static int search(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 3, 5, 7, 9, 11}, 7)); // 3
    }
}
