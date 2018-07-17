package whiteboard6;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.prepend(5);
        ll.prepend(1);
        ll.prepend(22);
        ll.prepend(33);
        ll.prepend(4);
        ll.prepend(56);
        ll.prepend(30);

        if (ll.isEmpty()) {
            System.out.println("empty foo");
        }

        System.out.println("ll: " + ll.size());

        ll.printList(ll.size());

    }

}
