package DSA.StackAndQueueAssignment;

import java.util.Stack;

public class AssignmentTwO {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void enqueue(int x) {
        stack1.push(x);
    }

    public static int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty() ? -1 : stack2.pop();
    }

    // Front operation
    public static int front() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty() ? -1 : stack2.peek();
    }

    public static void processOperations(int[][] operations) {
        for (int[] op : operations) {
            if (op[0] == 1) {
                enqueue(op[1]);
            } else if (op[0] == 2) {
                System.out.println(dequeue());
            } else if (op[0] == 3) {
                System.out.println(front());
            }
        }
    }

    public static void main(String[] args) {
        int[][] operations = {
                {1, 10},
                {1, 20},
                {3},
                {2},
                {3},
                {2}
        };

        processOperations(operations);
    }
//    Task 2: Implement a Queue using Two Stacks
//    Implement a queue using two stacks such that the following operations work efficiently:
//    Enqueue(x) – Inserts an element x at the end of the queue.
//    Dequeue() – Removes and returns the front element of the queue. If the queue is empty, return -1.
//    Input Format:
//    The first line contains an integer q (1 ≤ q ≤ 10^⁵), the number of operations.
//    The next q lines contain one of the following commands:
//            "1 x" → Enqueue x into the queue (1 ≤ x ≤ 10^⁹).
//            "2" → Dequeue and print the front element. If the queue is empty, print -1.
//            "3" → Print the front element without removing it. If the queue is empty, print -1.
//    Output Format:
//    For each dequeue (2) or front query (3) operation, print the required value.
//    Example 1:
//    input:
//            6
//            1 10
//            1 20
//            3
//            2
//            3
//            2
//    output:
//            10
//            10
//            20
//            20
//    Explanation:
//    Enqueue(10) → [10]
//    Enqueue(20) → [10, 20]
//    Front() → 10
//    Dequeue() → Removes 10, queue = [20]
//    Front() → 20
//    Dequeue() → Removes 20, queue = []
}
