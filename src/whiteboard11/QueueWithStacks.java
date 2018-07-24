package whiteboard11;

import java.util.Stack;



public class QueueWithStacks<E> {
    public Stack<E> stack1 = new Stack<E>();
    public Stack<E> stack2 = new Stack<E>();


    public void queue(E data) {
        stack1.push(data);
    }

    public E dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        E result = stack2.pop();
        System.out.println(result);
        return result;
    }

}
