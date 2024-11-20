import java.io.*;
import java.util.*;

public class Day6{
  public static void main(String[] args) {
    System.out.println(answer("input.txt"));
  }

  public static String answer(String filename){
    try{
      File fille = new File(filename);
      Scanner file = new Scanner(fille);
      String text = "";
      while(file.hasNextLine()){
        text += file.nextLine() + "\n";
      }
      String[] sentMessages = text.split("\n");
      String output = "";
      for(int i = 0; i < 8; i ++){
        HashMap<Character, Integer> chars = new HashMap<>();
        for (String group : sentMessages) {
          chars.put(group.charAt(i), chars.getOrDefault(group.charAt(i), 0) + 1);
        }
        List<Map.Entry<Character, Integer> > sortedEntries = new ArrayList<>(chars.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        output += sortedEntries.get(0).getKey();
      }
      return output;
    }catch(Exception e){
      System.out.println("file not found");
      return "hi";
    }
  }
}
