package whiteboard8;

import whiteboard8.LinkedList;
import whiteboard8.ListNode;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    public LinkedList empty;
    public LinkedList l1;
    public LinkedList l2;
    public LinkedList l5;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        empty = new LinkedList();

        l1 = new LinkedList();
        l1.prepend(12);


        l2 = new LinkedList();
        l2.prepend(12);
        l2.prepend(14);

        l5 = new LinkedList();
    }

//    @Test
//    void toStringEmptyList() {
//        assertEquals("[]", empty.toString());
//    }
//
//    @Test
//    void toStringEmptyList() {
//        assertEquals("[12]", l1.toString());
//    }
//
//    @Test
//    void toStringEmptyList() {
//        assertEquals("[12, 14]", l2.toString());
//    }
//
//    @Test
//    void toStringEmptyList() {
//        assertEquals("[12, 14, 23, 45, 64]", l5.toString());
//    }


    @Test
    void prependTest() {
        LinkedList test1 = new LinkedList();

        ListNode result = test1.prepend(5);
        int expected = 5;
        assertEquals(expected, result.data);
    }

}