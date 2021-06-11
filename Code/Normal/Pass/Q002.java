package Normal.Pass;

public class Q002 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        int bit = 0;
        while (l1 != null || l2 != null || bit != 0) {
            int sum = bit;
            sum = l1 != null ? l1.val + sum : sum;
            sum = l2 != null ? l2.val + sum : sum;

            if (sum > 9) {
                bit = 1;
                sum -= 10;
            } else bit = 0;
            cur.next = new ListNode(sum);
            cur = cur.next;

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        return head.next;

    }
}
