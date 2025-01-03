public class makeWord
{
  public static void main(String[] args) {
    makeWords(Integer.parseInt(args[0]), args[1], args[2]);
  }
  public static void makeWords(int remainingLetters, String result, String alphabet)
  {
    if(remainingLetters == 0)
    {
      System.out.println(result);
    }
    else
    {
      for(char letter : alphabet.toCharArray())
      {
        makeWords(remainingLetters - 1, result + letter, alphabet);
      }
    }
  }
}
