package whiteboard14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    @Test
    void maxTest1() {
// test with highest value in the middle
    MaxStack test1 = new MaxStack();

        test1.push(1);
        test1.push(2);
        test1.push(3);
        test1.push(4);
        test1.push(16);
        test1.push(15);
        test1.push(7);

        int expected = 16;
        int result;
        result = MaxStack.max(test1);

        assertEquals(expected, result);


    }

    @Test
    void maxTest2() {
// test with highest value on the end.
        MaxStack test2 = new MaxStack();

        test2.push(1);
        test2.push(2);
        test2.push(3);
        test2.push(4);


        int expected = 4;
        int result;
        result = MaxStack.max(test2);

        assertEquals(expected, result);


    }

    @Test
    void maxTest3() {
// test with highest value at the beginning.
        MaxStack test3 = new MaxStack();

        test3.push(18);
        test3.push(2);
        test3.push(3);



        int expected = 18;
        int result;
        result = MaxStack.max(test3);

        assertEquals(expected, result);


    }
}