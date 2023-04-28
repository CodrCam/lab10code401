package datastructures;


import datastrucures.Queue;
import datastrucures.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataStructureTests {

    @Test
    public void testStackPush() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    public void testStackPushMultiple() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());
    }

    @Test
    public void testStackPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.peek());
    }

    @Test
    public void testStackEmpty() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackInstantiateEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackPopPeekEmpty() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    public void testQueueEnqueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testQueueEnqueueMultiple() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testQueueDequeue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.peek());
    }

    @Test
    public void testQueuePeek() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testQueueEmpty() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testQueueInstantiateEmpty() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testQueueDequeuePeekEmpty() {
        Queue queue = new Queue();
        assertThrows(IllegalStateException.class, queue::dequeue);
        assertThrows(IllegalStateException.class, queue::peek);
    }
}

