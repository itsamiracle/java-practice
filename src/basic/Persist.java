package basic;

public class Persist {

/* Double and floats have a .0 at their end, so keep that in mind before casting it to a String
 * because 25.0 will be cast as "25.0"
 *  1. Create a StringBuilder from the given number so that we can access each character (digit) in the string
 *  2. If its only one char (digit) return
 *  3. Multiply each char in our string using Character.getNumericValue(char c)
 *  4. Look if the result string lenght is 1 (meaning only one digit)
 *  5. If not then do it again.
 */
  public static int persistence(long n) {

    StringBuilder input = new StringBuilder(Long.toString(n));
    if (input.length() == 1){
      return 0;
    }
    int result = 1;
    int numOfTimes = 0;

    while (true){
      for(int i = 0; i < input.length(); i++){
        result *= Character.getNumericValue(input.charAt(i));
      }
      input = new StringBuilder(Integer.toString(result));
      result = 1;
      numOfTimes++;
      if (input.length() == 1){
        return numOfTimes;
      }
    }
  }
}
