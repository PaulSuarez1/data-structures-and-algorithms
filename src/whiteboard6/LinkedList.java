package whiteboard6;

public class LinkedList {

    ListNode root;

    public LinkedList() {
        this.root = null;
    }

    public void prepend(int data) {
        ListNode nn = new ListNode(data);
        nn.next = this.root;
        this.root = nn;
    }

    public void append(int data) {
        ListNode nn = new ListNode(data);

    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        int total = 0;

        ListNode current = this.root;

        while (current != null) {
            total++;
            current = current.next;
        }

        return total;
    }

    public int get(int length) {
        int loop = 0;
        ListNode current = this.root;

        while (loop < length) {

            current = current.next;
            System.out.println(current);
            loop++;
        }
        return current.data;
    }

    public ListNode printList(int length) {
        int loop = 0;
        ListNode current = this.root;

        while (loop < length) {
            if (current != null) {
                System.out.println("the entire, raw ll: " + current.data);
            }

            current = current.next;
            loop++;
        }

        return current;
    }

}
