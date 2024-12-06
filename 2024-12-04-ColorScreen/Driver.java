import java.util.Random;

public class Driver {
    // MODIFIERS
    public static final int BRIGHT = 1;
    public static final int DEFAULT = 0;
    // COLORS
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int WHITE = 37;
    public static final int BLUE = 34;

    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);
        MakeBorder();
        DisplayRandomNumbers();
        System.out.print(Text.SHOW_CURSOR);
        System.out.print(Text.RESET);
        Text.go(31, 1);
    }

    public static void MakeBorder() {
        for (int col = 1; col <= 80; col++) {
            Text.go(1, col);
            Text.color(BLUE, Text.background(BLUE), BRIGHT);
            System.out.print(" ");
            Text.go(30, col);
            System.out.print(" ");
        }
        for (int row = 2; row <= 29; row++) {
            Text.go(row, 1);
            System.out.print(" ");
            Text.go(row, 80);
            System.out.print(" ");
        }
        for (int row = 2; row <= 29; row++) {
            for (int col = 2; col <= 79; col++) {
                Text.go(row, col);
                Text.color(DEFAULT, Text.background(Text.BLACK));
                System.out.print(" ");
            }
        }
    }

    public static void DisplayRandomNumbers() {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        int spacing = 20;
        int startCol = 10;
        for (int i = 0; i < numbers.length; i++) {
            Text.go(2, startCol + i * spacing);
            if (numbers[i] < 25) {
                Text.color(RED, Text.background(Text.BLACK), BRIGHT);
            } else if (numbers[i] > 75) {
                Text.color(GREEN, Text.background(Text.BLACK), BRIGHT);
            } else {
                Text.color(WHITE, Text.background(Text.BLACK));
            }
            System.out.printf("%02d", numbers[i]);
        }
        Text.color(BLUE, Text.background(Text.BLACK), BRIGHT);
        for (int col = 2; col <= 79; col++) {
            Text.go(3, col);
            System.out.print("-");
        }
    }

/*    public static void ExtraDraw(){
      int height = 0;
      print(RED);
      for(int i = 4; i <= 9; i ++){
        for(int a = 0; i < 2; i ++){
          Text.go(i, 40 + a);
          print("|");
        }
      }

      for(int i = 0 ; i <= 15; i ++){
        for(int a  = 0; a < 2; a ++){
          if(height < 40){
            Text.go(5 + i, 40 + a)
            print();
          }
          else{
            Text.go(5 + i, 40 + a)
            print()
          }
        }
      }

      for(int i = 0; i < 6; i ++){
        for(int a = 0; i < 2; i ++){
          Text.go(24 + i, 40 + a);
          print("|");
        }
      }

    }
    */
}
