public class Maker extends Adventurer{
  private String SpecialName;
  private int Special;
  private int SpecialMax = 25;

  public Maker(String n, int hp){
    super(n, hp);
  }
  public Maker(String n, int x, String spec, int j){
    super(n, x);
    SpecialName = spec;
    Special = j;
  }

  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName()
  {
    return SpecialName;
  }
  //accessor methods
  public int getSpecial()
  {
    return Special;
  }

  public void setSpecial(int n)
  {
    Special = Special +n > SpecialMax? SpecialMax: Special + n;
  }
  public int getSpecialMax()
  {
    return SpecialMax;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other)
  {
    other.applyDamage(17);
    return other.getName();
  }

  //heall or buff the target adventurer
  public String support(Adventurer other)
  {
    other.applyDamage(-15);
    return other.getName();
  }

  //heall or buff self
  public String support()
  {
    applyDamage(-15);
    return super.getName();

  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other)
  {
    other.applyDamage(17 * getSpecial());
    return other.getName();
  }

}
