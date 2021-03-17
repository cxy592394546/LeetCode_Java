package O.Q18;

public class deleteNode {
      public class ListNode {
          int val;
          ListNode next;

          ListNode(int x) {
              val = x;
          }
      }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = head;
        ListNode cur = head;
        if(head.val == val){
            return head.next;
        }
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                return head;
            }
            else{
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
