import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main(String[] args){
    System.out.println(isTrig(new int[] {1,11,1312}));
    System.out.println(isTrig(new int[] {5,11,13}));
  }

  public static int countTrianglesA(String filename){
    int[] sides = new int[3];
    File fille = new File(filename);
    Scanner file = new Scanner(fille);
    int count = 0;
    while(file.hasNextLine()){
      int index = 0;
      while(file.hasNextInt()){
        sides[index] = file.nextInt();
        index ++;
        }
      if(isTrig(sides)){
        count ++;
      }
      sides = new int[3];
    }
  }

  public static boolean isTrig (int[] sides){
    int max = 0;
    int second = 0;
    int min = 0;
    for(int i =0; i < 3; i++){
      if(sides[i] > max){
        second = max;
        max = sides[i];
      }
      else if (sides[i] > second){
        min = second;
        second = sides[i];
      }
      else{
        min = sides[i];
      }
    }
    return (sides[1] + sides[2] > sides[0]);
  }
}
