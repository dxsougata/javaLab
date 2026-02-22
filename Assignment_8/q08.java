import java.util.HashMap;
import java.util.Map;

public class q08 {
    public static void main(String[] args) {
        String input = "successes";
        //String input  = "";
        findFrequency(input);
        System.out.println("Sougata Kundu , 24155737");
    }

    public static void findFrequency(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty.");
            return;
        }


        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }


        System.out.println("Character Frequencies: " + freqMap);

        char maxChar = ' ';
        int maxFreq = -1;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Character with max frequency: '" + maxChar + "' appearing " + maxFreq + " times.");
    }
}
