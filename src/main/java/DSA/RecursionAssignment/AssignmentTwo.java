package DSA.RecursionAssignment;

public class AssignmentTwo {
    public static char findKthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            StringBuilder generated = new StringBuilder();
            for (char ch : word.toString().toCharArray()) {
                char nextChar = (ch == 'z') ? 'a' : (char) (ch + 1);
                generated.append(nextChar);
            }
            word.append(generated);
        }

        return word.charAt(k - 1);
    }

    public static void main(String[] args) {
        System.out.println(findKthCharacter(5));
        System.out.println(findKthCharacter(10));
    }
}
