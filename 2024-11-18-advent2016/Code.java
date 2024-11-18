import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code{
  public static void distance(Filename){
    File fille = new File(filename);
    Scanner file = new Scanner(fille);
    String[] text = file.nextLine().split(",")
    int horizontalDistance;
    int verticalDistance;
    int[] directions = {1,1,-1,-1};
    int pos = 0;
    for(int i = 0; i < text.length; i ++){
      if(text[i].charAt(0) == "R"){
        turn("right", pos)
      }
    }

}

  public static int turn(String direction, int pos){
    if(direction.equals("right")){
      if(pos == 3){
        pos = 0;
      }
      else{
        pos += 1
      }
    }
    else{
      if(pos == 0){
        pos == 3;
      }
      else{
        pos -= 1;
      }
    }
  }
