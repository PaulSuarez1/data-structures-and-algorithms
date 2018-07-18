package whiteboard8;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.prepend(5);
        ll.prepend(1);
        ll.prepend(22);

        ll.append(99);
        ll.append(100);
        ll.append(101);

        ll.insertBefore(99, 10000);

        ll.insertAfter(1, 8888);




        if (ll.isEmpty()) {
            System.out.println("empty foo");
        }

        System.out.println("ll: " + ll.size());

        ll.printList(ll.size());


        ListNode result = ll.kthElement(2);
        System.out.println("kthElement: " + result.data);



//        System.out.println("Input index in get. Output value: " + ll.get(2));




    }

}
