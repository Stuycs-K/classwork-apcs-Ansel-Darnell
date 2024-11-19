import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day2{
  public static void main(String[] args){
    System.out.println(distance("input.txt"));
  }
  public static int distance(String filename){
    try{
      File fille = new File(filename);
      Scanner file = new Scanner(fille);
      String[] text = file.nextLine().split(", ");
      int horizontalDistance=0;
      int verticalDistance=0;
      int[] directions = {1,1,-1,-1};
      int pos = 0;
      ArrayList<int[]> been = new ArrayList<int[]>();
      for(int i = 0; i < text.length; i ++){
        //System.out.println(pos);
        pos = turn(text[i].charAt(0), pos);
        //System.out.println(pos);
        if ((pos == 0) || (pos == 2)){
          verticalDistance += Integer.parseInt(text[i].substring(1)) * directions[pos];
        }
        else{
          horizontalDistance += Integer.parseInt(text[i].substring(1)) * directions[pos];
        }
        //System.out.println("Vert: " + verticalDistance + "----- Horiz" + horizontalDistance);
        for({x , y} : been{
          if ((verticalDistance == y) && (horizontalDistance == x)){
            return Math.abs(horizontalDistance) + Math.abs(verticalDistance);
          }
        }
        been.add({horizontalDistance, verticalDistance});
      }
      return Math.abs(horizontalDistance) + Math.abs(verticalDistance);
    }
    catch (FileNotFoundException e){
      System.out.println("file not found");
      return -1;
    }
}

  public static int turn(char direction, int pos){
    if(direction == 'R'){
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
