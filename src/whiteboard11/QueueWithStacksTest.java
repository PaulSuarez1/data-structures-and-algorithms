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

}