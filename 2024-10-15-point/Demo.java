public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.pow(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2), 0.5);
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point test = new Point (p1);
    Point test1 = new Point (p2);
    System.out.println(test);
    System.out.println(test1);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println( distance(p1,p3));
    System.out.println( Point.distance(p1,p3));
    System.out.println( p1.distanceTo(p3));
    p1 = new Point(11,17);
    p2 = new Point(-11,-1.3);
    p3 = new Point(31,40.2);
    test = new Point (p1);
    test1 = new Point (p2);
    System.out.println(test);
    System.out.println(test1);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println( distance(p1,p3));
    System.out.println( Point.distance(p1,p3));
    System.out.println( p1.distanceTo(p3));
  }
}
