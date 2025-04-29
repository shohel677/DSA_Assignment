package DSA.GreedyAssignment;

import java.util.*;

public class AssignmentTwo {

    public static int minCoins(int[] coins, int amount) {

        Arrays.sort(coins);
        int coinCount = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                int count = amount / coins[i];
                coinCount += count; // Add count to total coin count
                amount -= count * coins[i]; // Reduce the remaining amount

                if (amount == 0) {
                    break;
                }
            }
        }

        if (amount > 0) {
            return -1; // Return -1 if it's not possible to make the amount
        }

        return coinCount; // Return the total number of coins used
    }

    public static void main(String[] args) {
        // Testcase input
        int[] coins = {1, 5, 10};
        int amount = 12;

        int result = minCoins(coins, amount);
        if (result == -1) {
            System.out.println("Not possible to make the amount with given denominations.");
        } else {
            System.out.println("Minimum number of coins required: " + result);
        }
    }
}
