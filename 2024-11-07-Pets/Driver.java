//When we called the getName for the animal we were given the original name given
// but when we called the Bird we would get the newly updated getName() instead
// of the original name since we overrid it.
public class Driver{
  public static void main(String[]args){
    Animal Jimmeth = new Animal ("ahhhh", 9, "Jimmeth");
    //Jimmeth.speak();
    Bird jimmeth2 = new Bird("arg", 7, "static",1515151.64, "yellow");
    //jimmeth2.speak();
    System.out.println(Jimmeth.getName());
    System.out.println(jimmeth2.getName());
  }
}
