package basic;

import java.util.List;

public class BinaryArrayToNumber {

  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    String result = "";
    for (Integer i : binary){
      result += i;
    }
    return Integer.parseInt(result,2);
  }
}