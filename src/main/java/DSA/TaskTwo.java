package DSA;

import java.util.Arrays;

public class TaskTwo {

    public static void main(String[] args) {
        int [] arr = {3,6,9,1};
        System.out.println(maximumGap(arr));
    }

    public static int maximumGap(final int[] A) {
        int n = A.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(A);
        int maxGap = 0;
        for(int i = n-1; i > 0; i--){
            int gap = A[i] - A[i-1];
            maxGap = Math.max(maxGap, gap);
        }
        return maxGap;
    }
}
