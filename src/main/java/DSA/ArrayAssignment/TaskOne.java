package DSA.ArrayAssignment;

public class TaskOne {
    public static void main(String[] args) {
        solve(5);
    }
    public static int[][] solve(int A) {
        if (A < 1 || A > 30) {
            throw new IllegalArgumentException("A must be between 1 and 30");
        }

        int[][] triangle = new int[A][];

        for (int i = 0; i < A; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }
}
