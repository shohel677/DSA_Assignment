package DSA.LinkedListAssignment;

class Node {
    char value;
    Node next;
    Node prev;

    Node(char value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    void append(char value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    String display() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.value);
            if (current.next != null) {
                result.append(" <-> ");
            }
            current = current.next;
        }
        return result.toString();
    }
}

public class LinkedListAssignmentOne {
    public static DoublyLinkedList integerToLinkedList(int n) {
        DoublyLinkedList dll = new DoublyLinkedList();
        String numStr = Integer.toString(n);
        for (char ch : numStr.toCharArray()) {
            dll.append(ch);
        }
        return dll;
    }

    public static int linkedListToInteger(DoublyLinkedList dll) {
        StringBuilder numStr = new StringBuilder();
        Node current = dll.head;
        while (current != null) {
            numStr.append(current.value);
            current = current.next;
        }
        return Integer.parseInt(numStr.toString());
    }

    public static void main(String[] args) {
        int n1 = 25;
        DoublyLinkedList dll1 = integerToLinkedList(n1);
        System.out.println("First function: " + dll1.display());
        System.out.println("Second function: " + linkedListToInteger(dll1));

        int n2 = -4;
        DoublyLinkedList dll2 = integerToLinkedList(n2);
        System.out.println("First function: " + dll2.display());
        System.out.println("Second function: " + linkedListToInteger(dll2));
    }
}
