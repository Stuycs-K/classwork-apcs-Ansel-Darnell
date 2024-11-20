/*


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/*import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;



public class Day4{
  public static void main(String[] args){
    System.out.println(answer("input.txt"));
  }

  public static int answer(String filename){
    try{
      int count = 0;
      File fille = new File(filename);
      Scanner file = new Scanner(fille);
      while(file.hasNextLine()){
        String key = file.nextLine().substring(file.nextLine().length() - 6, file.nextLine().length() - 1); //key part
        String[] input = file.nextLine().substring(0, (file.nextLine().length() - 11)).split("-"); // excludes key part
        HashMap<char, int> chars = new HashtMap<>();
        for(String group : input){
          for(int a = 0; a < group.length; a ++){
            chars.put(group.charAt(a), chars.getOrDefault(group.charAt(a), 0) + 1);
            }
        }
        Collections.sort(chars, new Comparator<String>() {
          public int compare(int i1, int i2) {
            return Integer.compareTo(i1, i2);
          }
        });
        String output = "";
        String keys = chars.keySet().iterator();
        for(int i = 1; i < 5; i ++){
          String temp = keys.next();
          String temp2 = keys.next();
          if(chars.get(temp) == chars.get(temp2) ){ //check for tie
            if(temp < temp2){//alphabetically ahead
              output += temp;
            }
          }
          else{
            output += temp;
          }
        }
        if(output.equals(key)){
          count ++;
        }
      }
    }catch (FileNotFoundException e){
      System.out.println("file not found");
      return "hi";
    }
  }
}
/*    public static boolean check( chars, String code, String check){
      for(int i = 0; i < 5; i ++){
        if(chars.keySet().iterator().next() ){ //check for tie
          cchars.keySet().iterator().next()
        }
      }
    }

*/


/*
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

                // Split the line into two parts: before and after the '-'
                int indexOfBrackets = line.indexOf('['); // Find the position of '['
                String key = line.substring(indexOfBrackets + 1, indexOfBrackets + 6); // Extract key part inside the brackets
                String input = line.substring(0, indexOfBrackets - 4); // Everything before the '[' and '-'

                // Split the part before the brackets into groups
                String[] inputGroups = input.split("-");

                HashMap<Character, Integer> chars = new HashMap<>();

                // Count the frequency of each character in inputGroups
                for (String group : inputGroups) {
                    for (int a = 0; a < group.length(); a++) {
                        chars.put(group.charAt(a), chars.getOrDefault(group.charAt(a), 0) + 1);
                    }
                }

                // Sort the characters by frequency (descending) and alphabetically for ties
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
                for (int i = 0; i < 4; i++) {
                    if (keys.hasNext()) {
                        Map.Entry<Character, Integer> temp = keys.next();
                        output.append(temp.getKey());
                    }
                }

                // Check if the first 5 characters match the key
                if (output.toString().equals(key)) {
                    count++;
                }
            }
            return count;
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return 14;
        }
    }
}

*/

/*
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

                // Split the line into two parts: before and after the '-'
                int indexOfBrackets = line.indexOf('['); // Find the position of '['
                String key = line.substring(indexOfBrackets + 1, indexOfBrackets + 6); // Extract key part inside the brackets

                // Extract the part before the brackets, excluding the numeric part at the end
                String input = line.substring(0, indexOfBrackets - 7); // Exclude the trailing 3 digits and '-'

                // Split the part before the brackets into groups
                String[] inputGroups = input.split("-");

                HashMap<Character, Integer> chars = new HashMap<>();

                // Count the frequency of each character in inputGroups
                for (String group : inputGroups) {
                    for (int a = 0; a < group.length(); a++) {
                        chars.put(group.charAt(a), chars.getOrDefault(group.charAt(a), 0) + 1);
                    }
                }

                // Sort the characters by frequency (descending) and alphabetically for ties
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
                for (int i = 0; i < 5; i++) { // Match the top 5 characters
                    if (keys.hasNext()) {
                        Map.Entry<Character, Integer> temp = keys.next();
                        output.append(temp.getKey());
                    }
                }

                // Check if the output matches the key
                if (output.toString().equals(key)) {
                    count++;
                }
            }
            return count;
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return 0; // Return 0 if file is not found
        }
    }
}

*/

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

                // Split the line into two parts: before and after the '-'
                int indexOfBrackets = line.indexOf('['); // Find the position of '['
                String key = line.substring(indexOfBrackets + 1, indexOfBrackets + 6); // Extract key part inside the brackets
                Integer numbers = Integer.parseInt(line.substring(indexOfBrackets - 3, indexOfBrackets));
                // Extract the part before the brackets, excluding the numeric part at the end
                String input = line.substring(0, indexOfBrackets - 4); // Exclude the trailing 3 digits and '-'

                // Split the part before the brackets into groups
                String[] inputGroups = input.split("-");

                HashMap<Character, Integer> chars = new HashMap<>();

                // Count the frequency of each character in inputGroups
                for (String group : inputGroups) {
                    for (int a = 0; a < group.length(); a++) {
                        chars.put(group.charAt(a), chars.getOrDefault(group.charAt(a), 0) + 1);
                    }
                }

                // Sort the characters by frequency (descending) and alphabetically for ties
                List<Map.Entry<Character, Integer>> sortedChars = new ArrayList<>(chars.entrySet());
                sortedChars.sort((entry1, entry2) -> {
                    int comparison = entry2.getValue().compareTo(entry1.getValue());
                    if (comparison == 0) {
                        return entry1.getKey().compareTo(entry2.getKey());
                    }
                    return comparison;
                });

                // Debugging output: print the sorted characters and the key
                //System.out.println("Key: " + key);
                //System.out.println("Sorted characters: " + sortedChars);

                // Build the output string from the top 5 characters
                StringBuilder output = new StringBuilder();
                Iterator<Map.Entry<Character, Integer>> keys = sortedChars.iterator();
                for (int i = 0; i < 5; i++) { // Match the top 5 characters
                    if (keys.hasNext()) {
                        Map.Entry<Character, Integer> temp = keys.next();
                        output.append(temp.getKey());
                    }
                }

                // Debugging output: print the output string
              //  System.out.println("Output: " + output.toString());

                // Check if the output matches the key
                if (output.toString().equals(key)) {
                    count += numbers;
                  //  System.out.println("ADDED -----------------------------------------------------------------------------");
                }
            }
            return count;
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return 0; // Return 0 if file is not found
        }
    }
}
