import java.util.Scanner;
class Game{
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport" + "/" + "quit");
    //Read one line of user input
    String choice = userInput.nextLine();
    Maker p1 = new Maker("SuperMan", 675, "oil", 2);
    Maker p2 = new Maker("enemy", 675, "corn", 1);
    int what;
    //Do something with the input
    while(!choice.equals("quit") && p1.getHP() > 0 && p2.getHP() > 0)
    {
      what = (int) (Math.random() * 3);
      System.out.println(what);
      if(choice.equals("a"))
      {
        System.out.println(p1.attack(p2));
        if(what == 2)
        {
          System.out.println(p2.attack(p1));
        }
        else if(what == 1)
        {
          System.out.println(p2.support(p1));
        }
        else if(what == 0)
        {
          System.out.println(p2.specialAttack(p1));
        }

        System.out.println("P1 HP:" + p1.getHP());
        System.out.println("P2 HP:" + p2.getHP());
      }
      else if(choice.equals("sp"))
      {
        System.out.println(p1.specialAttack(p2));
        if(what == 2)
        {
          System.out.println(p2.attack(p1));
        }
        else if(what == 1)
        {
          System.out.println(p2.support(p1));
        }
        else if(what == 0)
        {
          System.out.println(p2.specialAttack(p1));
        }

        System.out.println("P1 HP:" + p1.getHP());
        System.out.println("P2 HP:" + p2.getHP());
      }
      else if(choice.equals("su"))
      {
        System.out.println(p1.support(p1));
        if(what == 2)
        {
          System.out.println(p2.attack(p1));
        }
        else if(what == 1)
        {
          System.out.println(p2.support(p1));
        }
        else if(what == 0)
        {
          System.out.println(p2.specialAttack(p1));
        }

        System.out.println("P1 HP:" + p1.getHP());
        System.out.println("P2 HP:" + p2.getHP());
      }
      else
      {
        System.out.println("Enter Valid Input");
      }
      choice = userInput.nextLine();
    }
  }
}
