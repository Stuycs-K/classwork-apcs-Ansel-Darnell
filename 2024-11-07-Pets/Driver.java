//When we called the getName for the animal we were given the original name given
// but when we called the Bird we would get the newly updated getName() instead
// of the original name since we overrid it.

//Step 8:In Driver.java answer: What is the difference before and after you override this method?
//What does this tell us about methods that are overridden?
//When Birds call getName() it uses the bird getName NOT the getName from animal.
public class Driver{
  public static void main(String[]args){
    //Animal Jimmeth = new Animal ("ahhhh", 9, "Jimmeth");
    //Jimmeth.speak();
    //Bird jimmeth2 = new Bird("arg", 7, "static",1515151.64, "yellow");
    //jimmeth2.speak();
    //System.out.println(Jimmeth.getName());
    //System.out.println(jimmeth2.getName());
    //Jimmeth.speak();
/*    Animal a1 = new Animal("speak1", 1, "name1");

    a1.speak();
    System.out.println(a1.getName());
    System.out.println(a1.getNoise());
    System.out.println(a1.getAge());
*/
    Bird b1 = new Bird("name2", 2, "speak2",2, "c1");

    b1.speak();
    System.out.println(b1.getName());
    System.out.println(b1.getNoise());
    System.out.println(b1.getAge());
    System.out.println(b1.getColor());
    System.out.println(b1.getHeight());

    //Bird b2 = new Animal("speak3", 3, "name3");
/*
    b2.speak()
    System.out.println(b2.getName());
    System.out.println(b2.getNoise());
    System.out.println(b2.getAge());
    System.out.println(b2.getColor());
    System.out.println(b2.getHeight());
*/
    Animal a2 = new Bird("name3", 4, "speak4",10, "c2");

    a2.speak();
    System.out.println(a2.getName());
    System.out.println(a2.getNoise());
    System.out.println(a2.getAge());
    //System.out.println(a2.getColor());
    //System.out.println(a2.getHeight());

  }
}
