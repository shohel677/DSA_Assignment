package DSA.SortingAssignment;

public class AssignmentTwo {
    public static void processQueries(int n, int m, int[] likes, int[][] queries) {
        for (int i = 0; i < m; i++) {
            int postNo = queries[i][0] - 1;
            int likeIncrease = queries[i][1];

            likes[postNo] += likeIncrease;

            int maxLikes = likes[0];
            int postIndex = 0;

            for (int j = 1; j < n; j++) {
                if (likes[j] > maxLikes) {
                    maxLikes = likes[j];
                    postIndex = j;
                }
            }

            System.out.println((postIndex + 1) + " " + maxLikes);
        }
    }

    public static void main(String[] args) {

        int n = 5;
        int m = 3;
        int[] likes = {10, 20, 30, 40, 50};
        int[][] queries = {
                {3, 25},
                {2, 35},
                {5, 10}
        };

        processQueries(n, m, likes, queries);
    }
}
