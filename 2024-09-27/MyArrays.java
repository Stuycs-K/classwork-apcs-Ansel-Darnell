// I tried to push with terminal but for somereason it didn't seem to push so I am using the website to get it done

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

    // /*
    //Test cases for returnCopy:
    int[] a = {1,2,3,4,5};
    System.out.println("Original Address: " + a + " :::: New Address: " + returnCopy(a));
    System.out.println("Original Array: " + arrayToString(a) + ":::: Copied Array: " + arrayToString(returnCopy(a)));
    a = new int[]{1};
    System.out.println("Original Address: " + a + " :::: New Address: " + returnCopy(a));
    System.out.println("Original Array: " + arrayToString(a) + ":::: Copied Array: " + arrayToString(returnCopy(a)));
    a = new int[]{};
    System.out.println("Original Address: " + a + " :::: New Address: " + returnCopy(a));
    System.out.println("Original Array: " + arrayToString(a) + ":::: Copied Array: " + arrayToString(returnCopy(a)));
    a = new int[]{1,-2,3,-4,5};
    System.out.println("Original Address: " + a + " :::: New Address: " + returnCopy(a));
    System.out.println("Original Array: " + arrayToString(a) + ":::: Copied Array: " + arrayToString(returnCopy(a)));
    // */

    // /*
    //Test cases for concatArray:
    int[] b = {1,2,3,4,5};
    int[] c = {1,2,3,4,5};
    System.out.println("Array 1: " + arrayToString(b) + " :::: Array 2: " + arrayToString(c));
    System.out.println("New Array: " + arrayToString(concatArray(b, c)));
    b = new int[]{1};
    c = new int[]{1, 3};
    System.out.println("Array 1: " + arrayToString(b) + " :::: Array 2: " + arrayToString(c));
    System.out.println("New Array: " + arrayToString(concatArray(b, c)));
    b = new int[]{};
    c = new int[]{1};
    System.out.println("Array 1: " + arrayToString(b) + " :::: Array 2: " + arrayToString(c));
    System.out.println("New Array: " + arrayToString(concatArray(b, c)));
    b = new int[]{1,-2,3,-4,5};
    c = new int[]{1};
    System.out.println("Array 1: " + arrayToString(b) + " :::: Array 2: " + arrayToString(c));
    System.out.println("New Array: " + arrayToString(concatArray(b, c)));
    b = new int[]{1,-2,3,-4,5};
    c = new int[]{};
    System.out.println("Array 1: " + arrayToString(b) + " :::: Array 2: " + arrayToString(c));
    System.out.println("New Array: " + arrayToString(concatArray(b, c)));
    // */
  }

  public static int[] returnCopy(int[] nums){
    int[] returnn = new int[nums.length];
    if (nums == null){
      return returnn;
    }
    for(int i = 0; i < nums.length; i++)
    {
      returnn[i] = nums[i];
    }
    return returnn;
  }

  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] returnn = new int[ary1.length + ary2.length];
    for(int i = 0; i < ary1.length; i++)
    {
      returnn[i] = ary1[i];
    }
    for(int i = ary1.length; i < ary1.length + ary2.length; i++)
    {
      returnn[i] = ary2[i - ary1.length];
    }
    return returnn;
  }

  public static String arrayToString( int[] arr){
    String returnn = "{";
    if(arr.length == 0){
      return returnn += "}";
    }
    for (int i = 0; i < arr.length - 1; i++){
      returnn += arr[i] + ", ";
    }
    return returnn += arr[arr.length - 1] + "}";
  }
}
