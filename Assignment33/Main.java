package Assignment33;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String test = "test";
        char highestFreqChar = findHighestFrequencyCharacter(test);
        int highestFreq = getCharacterFrequency(test, highestFreqChar);
        System.out.println("The character '" + highestFreqChar + "' has the highest frequency of " + highestFreq + " in the string.");
    }

    public static char findHighestFrequencyCharacter(String test) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

      
        for (char c : test.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

       
        char highestFreqChar = '\0';
        int highestFreq = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char c = entry.getKey();
            int freq = entry.getValue();

            if (freq > highestFreq) {
                highestFreq = freq;
                highestFreqChar = c;
            }
        }

        return highestFreqChar;
    }

    public static int getCharacterFrequency(String str, char c) {
        int frequency = 0;

        for (char chr : str.toCharArray()) {
            if (chr == c) {
                frequency++;
            }
        }

        return frequency;
    }
}