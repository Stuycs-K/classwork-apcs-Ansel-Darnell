public class Driver{
  //MODIFIERS
  public static final int BRIGHT = 1;
  public static final int DARK = 2;
  public static final int ITALICS = 3;
  //COLORS
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;
  //CONTROLS
  public static final String CLEAR_SCREEN =  "\033[2J";
  public static final String HIDE_CURSOR =  "\033[?25l";
  public static final String SHOW_CURSOR =  "\033[?25h";


  public static void main(String[] args) {
    border()
  }

  public void MakeBorder(){
    for(int i = 0; i < 80; i++){
      Text.go(i, 0);
      Text.color(GREEN, Text.background(RED),);

    }
  }

}
