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

    public int get(int index) {
        int n = 0;
        ListNode current = this.root;

        while (n < index) {
            n++;
            current = current.next;
            System.out.println(current);
        }
        return current.data;
    }

    public String printList(int index) {
        int n = 0;
        ListNode current = this.root;

        while (n < index) {
            if (current != null) {
                System.out.println("the entire, raw ll: " + current);


            }

            current = current.next;
            n++;
        }

        return printList(1);
    }

}
