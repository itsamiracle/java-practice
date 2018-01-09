import java.util.Arrays;

public class Maskify {
  private static String maskify(String str) {
    int stringLength = str.length();
    if (stringLength < 5) {
      return str;
    }
    char[] charArray = new char[stringLength - 4];
    Arrays.fill(charArray, '#');
    String fill = new String(charArray);
    return fill + str.substring(stringLength - 4, stringLength);
  }

  public static void main(String[] args) {
    String myString = "05123001502018";
    System.out.println(Maskify.maskify(myString));
  }
}
