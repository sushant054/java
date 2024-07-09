import java.util.HashMap;
import java.util.Map;

public class MaxCharOccurrences {
    public static void main(String[] args) {
        String input = "Hello world";

        // Call the function to find the maximum occurrences
        findMaxOccurrences(input);
    }

    public static void findMaxOccurrences(String input) {
        // Create a map to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Count the occurrences of each character
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Find the maximum occurrence
        int maxCount = 0;
        for (int count : charCountMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Find all characters with the maximum occurrence
        System.out.println("Characters with maximum occurrences (" + maxCount + " times):");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey());
            }
        }
    }
}
