package Q22;

public class getKthFromEnd {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) { // 二次遍历
        if (head == null) return head;
        ListNode node = head;
        int count = 1;
        while (node.next != null) {
            node = node.next;
            count++;
        }
        node = head;
        for (int i = 0; i < count - k; i++) {
            node = node.next;
        }
        return node;
    }

//     快慢指针
//    public ListNode getKthFromEnd(ListNode head, int k) {
//        ListNode first = head;
//        while(first != null){
//            first = first.next;
//            if(k > 0) k--;
//            else head = head.next;
//        }
//        return head;
//    }
}
