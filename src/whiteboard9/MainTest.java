package whiteboard9;

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


//    @Test
//    void prependTest() {
//        LinkedList test1 = new LinkedList();
//
//        ListNode result = test1.prepend(5);
//        int expected = 5;
//        assertEquals(expected, result.data);
//    }

    @Test
    void mergeTest() {
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();

        ll2.prepend(6);
        ll2.prepend(4);
        ll2.prepend(2);

        ll1.prepend(5);
        ll1.prepend(3);
        ll1.prepend(1);

        LinkedList result = (LinkedList.Merge(ll1, ll2));
        result.printList(6);

        LinkedList expected = new LinkedList();

        expected.prepend(6);
        expected.prepend(5);
        expected.prepend(4);
        expected.prepend(3);
        expected.prepend(2);
        expected.prepend(1);





        expected.printList(expected.size());
        result.printList(expected.size());

        assertEquals(expected.toString(), result.toString());

    }

    @Test
        void hasLoop() {


        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2; // point n5 back to n2 to create the loop

        LinkedList ll = new LinkedList();
        ll.root = n1; // attach n1 as the root manually.

        assertEquals(true, ll.hasLoop());

    }

}