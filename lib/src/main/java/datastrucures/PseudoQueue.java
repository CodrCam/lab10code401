package datastrucures;

import stackandqueue.Stack;

public class PseudoQueue {
    private Stack inStack;
    private Stack outStack;

    public PseudoQueue() {
        inStack = new Stack();
        outStack = new Stack();
    }

    public void enqueue(int value) {
        inStack.push(value);
    }

    public int dequeue() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        if (outStack.isEmpty()) {
            throw new IllegalStateException("PseudoQueue is empty");
        }
        return outStack.pop();
    }
}
