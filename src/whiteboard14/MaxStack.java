package whiteboard14;

import java.util.Stack;

public class MaxStack extends Stack {
    // i thought I was going to have to use two stacks in this method but then I realized i just need a temp one to hold the data before fliping it back over from the test stack.
    // method only uses one and test provides the other.
    public static int max(Stack<Integer> inputStack) {
        Stack<Integer> stackTemp = new Stack();
        int big = 0;
        while (!inputStack.empty()) {
            int marker = inputStack.pop();
            if (marker > big) {
                big = marker;
            }
            stackTemp.push(marker);
        }

        while (!stackTemp.isEmpty()){
            inputStack.push(stackTemp.pop());
        }

        return big;
    }



}
