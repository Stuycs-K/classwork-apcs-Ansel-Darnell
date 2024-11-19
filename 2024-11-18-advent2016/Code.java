import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code{
  public static void main(String[] args){
    System.out.println(distance("input.txt"));
  }
  public static int distance(String filename){
    try{
      File fille = new File(filename);
      Scanner file = new Scanner(fille);
      String[] text = file.nextLine().split(",");
      int horizontalDistance=0;
      int verticalDistance=0;
      int[] directions = {1,1,-1,-1};
      int pos = 0;
      for(int i = 0; i < text.length; i ++){
        if(text[i].charAt(0) == 'R'){
          pos = turn("right", pos);
        }
        else{         //(text[i].charAt(0) == "L"){
          pos = turn("left", pos);
        }
        if ((pos == 0) || (pos == 2)){
          verticalDistance += Integer.parseInt(text[i].substring(0)) * directions[pos];
        }
        else{
          horizontalDistance += Integer.parseInt(text[i].substring(0)) * directions[pos];
        }

      }
      return horizontalDistance + verticalDistance;
    }
    catch (FileNotFoundException e){
      System.out.println("file not found");
      return -1;
    }
}

  public static int turn(String direction, int pos){
    if(direction.equals("right")){
      if(pos == 3){
        pos = 0;
      }
      else{
        pos += 1;
      }
    }
    else{
      if(pos == 0){
        pos = 3;
      }
      else{
        pos -= 1;
      }
    }
    return pos;
  }
}
