import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D01_ArrayReverseTest {
    @Test
    public void testEmpty() throws Exception {
        int[] numbers = {};
        D01_ArrayReverse.doubler(numbers);

        int[] expected = {};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testDoubler() throws Exception {
        int[] numbers = {1, 2, 3, 4, 5};
        D01_ArrayReverse.doubler(numbers);

        int[] expected = {2, 4, 6, 8, 10};
        assertArrayEquals(expected, numbers);
    }
}