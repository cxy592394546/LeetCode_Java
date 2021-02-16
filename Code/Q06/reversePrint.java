package Q06;

public class reversePrint {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int counter = 0;
        while(node != null){
            counter++;
            node = node.next;
        }
        int[] res = new int[counter];
        node = head;
        for(int i = 0; i < counter; i++){
            res[counter - i - 1] = node.val;
            node = node.next;
        }
        return res;
    }
}