package DSA.StackAndQueueAssignment;

import java.util.Stack;

public class AssignmentOne {

    public static int[] findNextSmallerElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = findNextSmallerElements(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

//    Task 1: Next Smaller Element (NSE) Detection
//    Given an array of n integers, find the next smaller element for each element in the array. The next smaller element for an element x is the first smaller element on the right side of x. If there is no smaller element, return -1.
//    Input:
//    An integer n (1 ≤ n ≤ 10^⁵) represents the size of the array.
//    An array of n integers (-10^⁹ ≤ arr[i] ≤ 10^⁹).
//    Output:
//    Print n space-separated integers where the ith integer represents the next smaller element of arr[i]. If no smaller element exists, print -1.
//    Example 1:
//    Input:
//            5
//            4 5 2 10 8
//    Output:
//            2 2 -1 8 -1
//    Example 2:
//    Input:
//            6
//            1 3 4 2 5 1
//    Output:
//            -1 2 2 1 1 -1
}
