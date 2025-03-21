import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
/*/
public class Main {
    public static void main(String[] args) {
        String input = "umesh works in state street umesh"; // Given input

        // Use TreeMap to store characters in sorted order
        Map<Character, Integer> map = new TreeMap<>();

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Sorted Frequency Map: " + map); // Print sorted frequency map

        // Find the first non-repeating character (from the original order)
        for (char ch : input.toCharArray()) {
            if (ch != ' ' && map.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}