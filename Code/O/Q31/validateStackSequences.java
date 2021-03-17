package O.Q31;

import java.util.Stack;

public class validateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length == 0) return true;
        Stack<Integer> stack = new Stack<Integer>();
        int counter = 0, i = 0;
        while(counter != pushed.length){
            stack.push(pushed[counter]);
            while(!stack.empty() && popped[i] == stack.peek()){
                if(i == pushed.length - 1){
                    return true;
                }
                i++;
                stack.pop();
            }
            counter++;
        }
        return false;
    }
}
