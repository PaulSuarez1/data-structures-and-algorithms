package whiteboard6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void prepend() {
        LinkedList test1 = new LinkedList();

        int result = test1.prepend(5);
        int expected = 5;
        assertEquals(expected, result);
    }

}