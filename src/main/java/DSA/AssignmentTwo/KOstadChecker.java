package DSA.AssignmentTwo;

import java.util.HashMap;
import java.util.Map;

public class KOstadChecker {
    public static String areKOstad(String str1, String str2, int k) {
        // Create frequency maps
        Map<Character, Integer> freq1 = getFrequencyMap(str1);
        Map<Character, Integer> freq2 = getFrequencyMap(str2);

        int modifications = 0;

        // Calculate modifications required
        for (char c : freq1.keySet()) {
            int diff = freq1.getOrDefault(c, 0) - freq2.getOrDefault(c, 0);
            if (diff > 0) modifications += diff;
        }
        for (char c : freq2.keySet()) {
            int diff = freq2.getOrDefault(c, 0) - freq1.getOrDefault(c, 0);
            if (diff > 0) modifications += diff;
        }

        return (modifications / 2) <= k ? "Yes" : "No";
    }

    private static Map<Character, Integer> getFrequencyMap(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }

    public static void main(String[] args) {
        System.out.println(areKOstad("anagram", "grammar", 3)); // Output: Yes
        System.out.println(areKOstad("ostad", "boss", 1)); // Output: No
    }
}
