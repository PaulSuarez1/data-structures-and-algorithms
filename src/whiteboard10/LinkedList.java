package whiteboard10;

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

    public static LinkedList Merge(LinkedList list1, LinkedList list2) {
        LinkedList temp = new LinkedList();

        ListNode current1 = list1.root;
        ListNode current2 = list2.root;

        temp.root = new ListNode(current1.data);
//        temp.append(current2.data);
        temp.root.next = new ListNode(current2.data);


        while (current1.next != null && current2.next != null) {

            temp.append(current1.next.data);
            temp.append(current2.next.data);

            current1 = current1.next;
            current2 = current2.next;

        }

        if (current1.next != null) {
            while (current1.next != null) {
                temp.append(current1.next.data);
            }

        } else {
            while (current2.next != null) {
                temp.append(current2.next.data);
            }
        }

        return temp;
    }



    ////// check if linked list has a loop

    public boolean hasLoop() {

        boolean loopieboi;
        if (this.root != null) {

            //  create two nodes
            ListNode current1 = this.root;
            ListNode current2 = this.root;

            loopieboi = true;


            while (current1 != null || current2 != null) {
                current1 = current1.next;
                current2 = current2.next.next;

                if (current1 == current2) {
                    loopieboi = true;
                    break;

                } else if (current1 == null || current2 == null || current1.next == null || current2.next.next == null) {
                    loopieboi = false;
                    break;
                }
            }

        } else {
            loopieboi = false;

        }

        return loopieboi;
    }

    // reversing linked list:
    public LinkedList ReverseList (LinkedList listy) {
        LinkedList reverse = new LinkedList();


        return reverse;

    }



}



























