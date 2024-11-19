import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2P1{
  public static void main(String[] args){
    System.out.println(answer("input.txt"));
  }

  public static String answer(String filename){
    try{
      File fille = new File(filename);
      Scanner file = new Scanner(fille);
      String output = "";
      int[] keypad = { 1,2,3, 4,5,6, 7,8,9 };
      while(file.hasNextLine()){
        output += "" + move(keypad, file.nextLine());
      }
      return output;
    }catch (FileNotFoundException e){
      System.out.println("file not found");
      return "hi";
    }
  }

  /*
  if((input.charAt(i) == 'U'){
    if(pos >= 4){
      pos -= 3;
    }
    else{
      return pos;
    }
  }
  */

  public static int move(int[] array, String input){
    int pos = 5;
    for(int i = 0; i < input.length(); i ++){
      if((input.charAt(i) == 'U') && (pos >= 4)){
        pos -= 3;
      }
      else if((input.charAt(i) == 'D') && (pos <= 6)){
        pos += 3;
      }
      else if((input.charAt(i) == 'L') && !((pos == 1) || (pos == 4) || (pos==7))){
        pos -= 1;
      }
      else if((input.charAt(i) == 'R') && !((pos == 3) || (pos == 6) || (pos==9))){
        pos += 1;
      }
    }
    return pos;
  }

}
