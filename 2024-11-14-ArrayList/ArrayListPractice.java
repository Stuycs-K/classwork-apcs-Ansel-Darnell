import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String>createRandomArray (int size) {
    ArrayList<String> arr = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int temp = (int)(11 * Math.random());
      if (temp == 0) {
        arr.add("");
      }
      else {
        arr.add("" + temp);
      }
    }
    return arr;
  }

  public static void replaceEmpty( ArrayList<String> original){
    //Modify the ArrayList such that it has all of the empty strings are
      for(int i = 0; i < original.size(); i ++){
      if(original.get(i) == ""){
        original.set(i,"Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  ArrayList<String> temp = new ArrayList<String>(original.size());
    for (int i = 1; i < original.size() + 1; i++) {
      temp.add(original.get(original.size() - i));
    }
    return temp;
  }
  /*
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  }
  */
}
