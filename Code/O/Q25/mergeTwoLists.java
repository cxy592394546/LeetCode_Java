package O.Q25;

public class mergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }
            else if(l1.val > l2.val){
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        if(l1 == null) cur.next = l2;
        else if (l2 == null) cur.next = l1;
        return head.next;
    }

//    递归
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if(l1 == null){
//            return l2;
//        }
//        else if(l2 == null){
//            return l1;
//        }
//
//        if(l1.val <= l2.val){
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        }
//        else{
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }
}
