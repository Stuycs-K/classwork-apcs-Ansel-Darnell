
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day4 {
    public static void main(String[] args) {
        System.out.println(answer("input.txt"));
    }

    public static int answer(String filename) {
        try {
            int count = 0;
            File fille = new File(filename);
            Scanner file = new Scanner(fille);
            while (file.hasNextLine()) {
                String line = file.nextLine();
                int indexOfBrackets = line.indexOf('[');
                String key = line.substring(indexOfBrackets + 1, indexOfBrackets + 6);
                Integer numbers = Integer.parseInt(line.substring(indexOfBrackets - 3, indexOfBrackets));
                String input = line.substring(0, indexOfBrackets - 4);
                String[] inputGroups = input.split("-");
                HashMap<Character, Integer> chars = new HashMap<>();
                for (String group : inputGroups) {
                    for (int a = 0; a < group.length(); a++) {
                        chars.put(group.charAt(a), chars.getOrDefault(group.charAt(a), 0) + 1);
                    }
                }
                List<Map.Entry<Character, Integer>> sortedChars = new ArrayList<>(chars.entrySet());
                sortedChars.sort((entry1, entry2) -> {
                    int comparison = entry2.getValue().compareTo(entry1.getValue());
                    if (comparison == 0) {
                        return entry1.getKey().compareTo(entry2.getKey());
                    }
                    return comparison;
                });
                StringBuilder output = new StringBuilder();
                Iterator<Map.Entry<Character, Integer>> keys = sortedChars.iterator();
                for (int i = 0; i < 5; i++) {
                    if (keys.hasNext()) {
                        Map.Entry<Character, Integer> temp = keys.next();
                        output.append(temp.getKey());
                    }
                }
                if (output.toString().equals(key)) {
                    count += numbers;
                }
            }
            return count;
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return 0;
        }
    }
}
