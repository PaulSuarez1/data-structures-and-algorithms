package whiteboard11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithStacksTest {
    @Test
    void dequeue() {
        QueueWithStacks<Integer> test = new QueueWithStacks<>();

        test.queue(1);
        test.queue(2);
        test.queue(3);

        int result = test.dequeue();
        int expected = 1;

        assertEquals(expected, result);

        result = test.dequeue();
        expected = 2;

        assertEquals(expected, result);

        result = test.dequeue();
        expected = 3;

        assertEquals(expected, result);
    }

    @Test
    void dequeue2() {
        QueueWithStacks<Integer> test = new QueueWithStacks<>();


        test.queue(2);




        int result = test.dequeue();
        int expected = 2;

        assertEquals(expected, result);



    }

    @Test
    void dequeue3() {
        QueueWithStacks<Integer> test = new QueueWithStacks<>();


        test.queue(3);




        int result = test.dequeue();
        int expected = 3;

        assertEquals(expected, result);

    }

}