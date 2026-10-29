// LeetCode 21 - Merge Two Sorted Lists (Easy)
// Idea: walk both lists with a dummy head, always attach the smaller node.
public class MergeTwoSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0), tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) { tail.next = a; a = a.next; }
            else { tail.next = b; b = b.next; }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    static ListNode build(int... vals) {
        ListNode dummy = new ListNode(0), t = dummy;
        for (int v : vals) { t.next = new ListNode(v); t = t.next; }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode r = mergeTwoLists(build(1, 2, 4), build(1, 3, 4));
        StringBuilder sb = new StringBuilder();
        for (; r != null; r = r.next) sb.append(r.val).append(' ');
        System.out.println(sb.toString().trim()); // 1 1 2 3 4 4
    }
}
