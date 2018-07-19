package whiteboard8;

public class LinkedList {

    public ListNode root;

    public LinkedList() {
        this.root = null;
    }
///////////////////////////////////////////////////
    public String toString() {

        if (this.root == null) {
            return "[]";

        }
        String result = "";

        ListNode current = this.root;
        while (current != null) {
            result += current.data;

            current = current.next;
        }

        return "[" + result + "]";
    }
///////////////////////////////////////////////////

// no loop required. prepends new node as the root
    public int prepend(int data) {
        ListNode prependNode = new ListNode(data);
        prependNode.next = this.root;
        this.root = prependNode;
//        return data;
        return data;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    // this method to that loops through the linked list nodes and ++'s the total variable with each count.
    public int size() {
        int total = 0;

        ListNode current = this.root;

        while (current != null) {
            total++;
            current = current.next;
        }

        return total;
    }

    // this grabs the specific index and returns the value of the index that's been passed in as an argument.
    public int get(int index) {
        int loop = 0;
        ListNode current = this.root;

        while (loop < index) {

            current = current.next;
//
            loop++;
        }
        return current.data;
    }

    // created this method to see what the fuck was going on in my LinkedLast
    public ListNode printList(int length) {
        int loop = 0;
        ListNode current = this.root;

        while (loop < length) {
            if (current != null) {
                System.out.print("node value: " + current.data + " -> Next ");
            }
            current = current.next;
            loop++;
        }
        return current;
    }

    // this method appends data nodes to the end of the LinkedList
    public int append(int data) {

        ListNode appendNode = new ListNode(data);
        ListNode current = this.root;

        while (null != current.next) {
            current = current.next;
        }
        current.next = appendNode;
//        return data;
        return data;
    }
// this method finds the requested value and inserts a new one before it without dropping the list
    public void insertBefore(int value, int newValue) {
        ListNode insertBefore = new ListNode(newValue);
        ListNode current = this.root;

        if (this.root.data == value) {
            insertBefore.next = this.root;
            this.root = insertBefore;
            return;
            // or just this.prepend(newValue);
        }

        while (current.next.data != value) {
            current = current.next;
        }
        insertBefore.next = current.next;
        current.next = insertBefore;
    }
// this method finds the requested value and inserts a new one after it without dropping the list

    public void insertAfter(int value, int newValue) {
        ListNode insertAfter = new ListNode(newValue);
        ListNode current = this.root;

        while (current.data != value) {
            current = current.next;
        }
        insertAfter.next = current.next;
        current.next = insertAfter;

    }
// WHITEBOARD 7 ASSIGNMENT
    public ListNode kthElement(int k) {
//        ListNode node = new ListNode(k);
        ListNode current = this.root;
        int length = this.size();
        int index = (length - k) - 1;
        this.get(index);
        return current;
    }












// MERGE two instances of the linkedlist constructor into a single linkedlist.

    public LinkedList Merge(LinkedList list1, LinkedList list2) {
        LinkedList temp = new LinkedList();

        ListNode current1 = list1.root;
        ListNode current2 = list2.root;

        temp.root = current1;
        temp.append(current2.data);

        while (current1 != null && current2 != null) {
            temp.append(current1.next.data);
            current1 = current1.next;

            temp.append(current2.next.data);
            current2 = current2.next;
        }

        if (current1.next != null && current2.next != null) {
            while (current1.next != null) {
                temp.append(current1.next.data);
            }
            while (current2.next != null) {
                temp.append(current2.next.data);
            }
        }

        return temp;
    }



}



























