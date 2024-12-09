
public class Driver{
  public static void main(String[] args) {
    Maker p1 = new Maker("Ziggy",1000000);
    Maker p2 = new Maker("Jerry", 10, "Oil", 17);
    System.out.println(p2.attack(p1));
    System.out.println(p2.getSpecialName());
    p2.setSpecial(3);
    System.out.println(p2.getSpecial());
    System.out.println(p2.getSpecialMax());
    System.out.println(p2.support(p1));
    System.out.println(p2.specialAttack(p1));


  }
  public static void print(String print){
    if (true)
    {
      System.out.println(print);
    }


  }
}
