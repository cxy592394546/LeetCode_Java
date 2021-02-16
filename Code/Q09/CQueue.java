package Q09;

import java.util.Stack;

public class CQueue {
    public Stack stack1;
    public Stack stack2;

    public CQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }

        if(stack2.empty())
            return -1;
        else
            return (int)stack2.pop();
    }

}
