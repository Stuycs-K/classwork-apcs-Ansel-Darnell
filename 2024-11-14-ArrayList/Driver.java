import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    ArrayList<String> test = ArrayListPractice.createRandomArray(20);
    ArrayListPractice.replaceEmpty(test);
    System.out.println(test);
    System.out.println(ArrayListPractice.makeReversedList(test));
  }
}
