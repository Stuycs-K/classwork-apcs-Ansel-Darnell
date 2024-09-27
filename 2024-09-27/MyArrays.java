public class MyArrays{
  public static void main (String[] args){
    /*
    int[] l = {1,2,3,4,5};
    System.out.println(arrayToString(l));
    l = new int[4];
    System.out.println(arrayToString(l));
    l = new int[] {1};
    System.out.println(arrayToString(l));
    l = new int[1];
    System.out.println(arrayToString(l));
    */
  }
  public static String arrayToString( int[] arr){
    String returnn = "{";
    for (int i = 0; i < arr.length - 1; i++){
      returnn += arr[i] + ", ";
    }
    return returnn += arr[arr.length - 1] + "}";
  }
}
