package DSA.AssignmentTwo;

public class EncryptDecrypt {

    public static String encrypt(String s) {
        StringBuilder transformed = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; ) {
            char currentChar = s.charAt(i);
            int count = 1;

            while (i + 1 < n && s.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            transformed.append(currentChar).append(count);
            i++;
        }

        return transformed.reverse().toString();
    }

    // Method to decrypt the string
    public static String decrypt(String encrypted) {
        StringBuilder reversed = new StringBuilder(encrypted).reverse();
        StringBuilder original = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            char currentChar = reversed.charAt(i);
            i++;
            StringBuilder countStr = new StringBuilder();

            while (i < reversed.length() && Character.isDigit(reversed.charAt(i))) {
                countStr.append(reversed.charAt(i));
                i++;
            }

            int count = Integer.parseInt(countStr.toString());
            for (int j = 0; j < count; j++) {
                original.append(currentChar);
            }
            i--; // Adjust index after reading number
        }

        return original.toString();
    }

    public static void main(String[] args) {
        String input1 = "aaaaaaaaaaa";
        String input2 = "ostad";

        String encrypted1 = encrypt(input1);
        String encrypted2 = encrypt(input2);

        System.out.println("Encrypted: " + encrypted1);
        System.out.println("Decrypted: " + decrypt(encrypted1));

        System.out.println("Encrypted: " + encrypted2);
        System.out.println("Decrypted: " + decrypt(encrypted2));
    }
}
