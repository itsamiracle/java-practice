package basic;

import java.util.List;

public class BinaryArrayToNumber {

  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    String result = "";
    for (Integer i : binary){
      result += i;
    }
    /*  We can specify the radix(base). There's an overload of Integer#parseInt() which allows you to.
     *  String hex = "FF";
     *  Integer.parseInt(hex, 16);    will returns an int : 255
     *  Integer.parseInt("1111", 2);  will returns an int : 15
     *  Integer.parseInt("11111111", 2);   returns 255
     */
    return Integer.parseInt(result,2);
  }
}