package DSA.LinkedListAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListAssignmentTwo {
    public static ListNode removeElements(ListNode head, int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (set.contains(current.next.val)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }

    public static ListNode constructLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        List<String> result = new ArrayList<>();
        while (current != null) {
            result.add(String.valueOf(current.val));
            current = current.next;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] linkedList1 = {1, 2, 3, 4, 5};
        ListNode head1 = constructLinkedList(linkedList1);
        head1 = removeElements(head1, array1);
        printLinkedList(head1);

        int[] array2 = {5};
        int[] linkedList2 = {1, 2, 3, 4};
        ListNode head2 = constructLinkedList(linkedList2);
        head2 = removeElements(head2, array2);
        printLinkedList(head2);
    }
}
