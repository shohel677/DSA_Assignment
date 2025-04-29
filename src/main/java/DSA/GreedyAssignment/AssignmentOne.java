package DSA.GreedyAssignment;

import java.util.*;

public class AssignmentOne {

    public static int jobScheduling(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);

        int totalProfit = 0;
        int lastEndTime = -1;  // To keep track of the end time of the last selected job

        for (int[] job : jobs) {
            if (job[0] >= lastEndTime) {
                totalProfit += job[2];  // Add the job's profit (job[2])
                lastEndTime = job[1];   // Update the last job's end time
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        int[][] jobs = {
                {1, 3, 50},
                {2, 5, 20},
                {3, 6, 70},
                {5, 8, 60}
        };

        System.out.println("Maximum Profit: " + jobScheduling(jobs));
    }
}

