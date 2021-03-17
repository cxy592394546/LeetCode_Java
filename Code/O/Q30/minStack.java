package O.Q30;

public class minStack {
    private class Node{
        int val, min;
        Node next;

        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    public Node cur;
    /** initialize your data structure here. */
    public void MinStack() {

    }

    public void push(int x) {
        if(cur == null) cur = new Node(x, x, null);
        else{
            Node node = new Node(x, Math.min(cur.min, x), cur);
            cur = node;
        }
    }

    public void pop() {
        cur = cur.next;
    }

    public int top() {
        return cur.val;
    }

    public int min() {
        return cur.min;
    }
}
