package O.Q24;

public class reverseList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = null;
        while(head.next != null){
            ListNode next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        head.next = temp;
        return head;
    }
}
