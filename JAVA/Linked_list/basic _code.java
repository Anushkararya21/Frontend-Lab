
package JAVA.Linked_list;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class basic_code {

    Node head = null;

    // 1. Insert at beginning
    void addFirst(int d) {
        Node newNode = new Node(d);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at end
    void addLast(int d) {
        Node newNode = new Node(d);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 3. Insert at specific position
    void addAtPosition(int d, int pos) {
        if (pos < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            addFirst(d);
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(d);

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Delete first node
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // 5. Delete last node
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // 6. Delete at specific position
    void deleteAtPosition(int pos) {
        if (pos < 0 || head == null) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            deleteFirst();
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        temp.next = temp.next.next;
    }

    // 7. Display linked list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // 8. Search an element
    boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // 9. Count nodes
    int size() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // 10. Get element at position
    int get(int pos) {
        if (pos < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;

        for (int i = 0; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException();
        }

        return temp.data;
    }

    // 11. Update element
    void update(int pos, int value) {
        if (pos < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        temp.data = value;
    }

    // 12. Reverse linked list
    void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        head = prev;
    }

    // 13. Find middle element
    int findMiddle() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // 14. Find maximum element
    int findMax() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        int max = head.data;
        Node temp = head;

        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }

            temp = temp.next;
        }

        return max;
    }

    // 15. Find minimum element
    int findMin() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        int min = head.data;
        Node temp = head;

        while (temp != null) {
            if (temp.data < min) {
                min = temp.data;
            }

            temp = temp.next;
        }

        return min;
    }

    // 16. Remove element by value
    void remove(int value) {
        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // 17. Check if list is empty
    boolean isEmpty() {
        return head == null;
    }

    // Main method
    public static void main(String[] args) {

        basic_code list = new basic_code();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Original Linked List:");
        list.display();

        list.addAtPosition(25, 2);
        System.out.println("After insertion:");
        list.display();

        list.deleteFirst();
        System.out.println("After deleting first:");
        list.display();

        list.deleteLast();
        System.out.println("After deleting last:");
        list.display();

        list.deleteAtPosition(1);
        System.out.println("After deleting position 1:");
        list.display();

        System.out.println("Search 30: " + list.search(30));

        System.out.println("Size: " + list.size());

        System.out.println("Element at index 1: " + list.get(1));

        list.update(1, 100);
        System.out.println("After updating:");
        list.display();

        System.out.println("Middle element: " + list.findMiddle());

        System.out.println("Maximum: " + list.findMax());

        System.out.println("Minimum: " + list.findMin());

        list.reverse();
        System.out.println("After reversing:");
        list.display();

        list.remove(30);
        System.out.println("After removing 30:");
        list.display();

        System.out.println("Is Empty: " + list.isEmpty());
    }
}
