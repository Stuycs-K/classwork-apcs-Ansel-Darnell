//1. Write both your names + emails at the top of the document as a comment.
//Seth Fenton, sfenton50@stuy.edu, Ansel Darnell, Adarnell60@stuy.edu
//2. Copy your arrToString method from before.
public class ArrayMethods {
public static String convertArrayInt(int[] convertString) {
String returnString = "[";
for (int i = 0; i < convertString.length; i++) {
  if (i < convertString.length - 1) {
    returnString += convertString[i] + ", ";
  }
  else  {
    returnString += convertString[i];
  }
}
return(returnString + "]");
}

public static String convertArrayString(String[] convertString) {
String returnString = "[";
for (int i = 0; i < convertString.length; i++) {
  if (i < convertString.length - 1) {
    returnString += convertString[i] + ", ";
  }
  else  {
    returnString += convertString[i];
  }
}
return(returnString + "]");
}

/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/

public static String arrToString(int[]ary){
  String returnString = "[";
  for (int i = 0; i < ary.length; i++) {
    if (i < ary.length - 1) {
      returnString += ary[i] + ", ";
    }
    else  {
      returnString += ary[i];
    }
  }
  return(returnString + "]");
}

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  String returnn = "[";
  for(int i = 0; i < ary.length-1; i++){
    returnn += arrToString(ary[i]) + ", ";
  }
  return (returnn + arrToString(ary[ary.length - 1]) + "]");
}

/*Return the sum of all of the values in the 2D array */

public static int arr2DSum(int[][]nums){
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int k = 0; k < nums[i].length; k++) {
      sum += nums[i][k];
    }
  }
  return sum;//place holder return value so it compiles.
}

//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){
  for(int i = 0; i < vals.length; i++){
    for(int k = 0; k < vals[i].length; k++){
      if(vals[i][k] < 0){
         if(i == k){
           vals[i][k] = 1;
         }
         else{
           vals[i][k] = 0;
         }
      }
    }
  }
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[][] copy(int[][] nums) {
    int[][] result = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
        result[i] = new int[nums[i].length];
        for (int k = 0; k < nums[i].length; k++) {
            result[i][k] = nums[i][k];
        }
    }
    return result;
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][] nums) {
      int rows = nums.length;
      int cols = nums[0].length;
      int[][] swapped = new int[cols][rows];

      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              swapped[j][i] = nums[i][j];
          }
      }
      return swapped;
  }


public static void main (String[] args) {
  /* int[] testCase = {2,3,4,9};
  System.out.println(arrToString(testCase));
  */


  int[][] testCase1 = new int[][] {{2,3,4,9}, {2,3,4,9}, {2,3,4,9}};
  System.out.println("Should return [[2, 3, 4, 9], [2, 3, 4, 9], [2, 3, 4, 9]] ;;;;;;;" + "returns " + arrToString(testCase1));
  System.out.println("Should return 54" + ";;;;;;;; returns " + arr2DSum(testCase1));
  System.out.println("Adresses should be different + should print [[2, 2, 2], [3, 3, 3], [4, 4, 4], [9, 9, 9]]");
  System.out.println(testCase1);
  testCase1 = swapRC(testCase1);
  System.out.println(testCase1);
  System.out.println("Prints: " + arrToString(testCase1));

  testCase1 = new int[][] {{11}, {21}, {31}};
  System.out.println("Should return [[11], [21], [31]] ;;;;;;;  " + "returns " + arrToString(testCase1));
  System.out.println("Should return 63" + ";;;;;;;; returns " + arr2DSum(testCase1));
  System.out.println("Adresses should be different + should print [[11, 21, 31]]");
  System.out.println(testCase1);
  testCase1 = swapRC(testCase1);
  System.out.println(testCase1);
  System.out.println("Prints: " + arrToString(testCase1));

  testCase1 = new int[][] {{11}, {}, {31,32,33,34}};
  System.out.println("Should return [[11], [], [31, 32, 33, 34]] ;;;;;;;  " + "returns " + arrToString(testCase1));
  System.out.println("Should return 141" + ";;;;;;;; returns " + arr2DSum(testCase1));

  testCase1 = new int[][] {{11,-12,13,-14}, {-21,-22,23,-24}, {-31,32,33,34}};
  replaceNegative(testCase1);
  System.out.println("Should return: [[11, 0, 13, 0], [0, 1, 23, 0], [0, 32, 33, 34] ] :::::::::: Returned: " + arrToString(testCase1));

  testCase1 = new int[][] {{1,2,3,4,5}, {1,2}, {}};
  System.out.println("Adresses should be different:");
  System.out.println(testCase1);
  System.out.println(copy(testCase1));
  System.out.println("Should return [[1, 2, 3, 4, 5], [1,2] []]:::::: returns: " + arrToString(copy(testCase1)));
  testCase1 = new int[][] {{1,-2,3,-4,5}, {}, {1,1,1}};
  System.out.println("Adresses should be different:");
  System.out.println(testCase1);
  System.out.println(copy(testCase1));
  System.out.println("Should return [[1, -2, 3, -4, 5], [] [1, 1, 1]]:::::: returns: " + arrToString(copy(testCase1)));
  testCase1 = new int[][] {{}};
  System.out.println("Adresses should be different:");
  System.out.println(testCase1);
  System.out.println(copy(testCase1));
  System.out.println("Should return [[]]:::::: returns: " + arrToString(copy(testCase1)));
}

}
