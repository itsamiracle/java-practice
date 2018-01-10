package basic;

// Simple Encryption #1 - Alternating Split

public class Encryption {

  public static String encrypt(final String text, final int n) {
    if (text ==  null || text.equals("") || n <= 0){
      return text;
    }
    StringBuilder input = new StringBuilder(text);
    for (int i = 0; i < n ; i++){
      StringBuilder result = new StringBuilder("");
      for (int j = 1; j < input.length(); j += 1) {
        result.append(input.charAt(j));
        input.deleteCharAt(j);
      }
      result.append(input);
      input = result;
    }
    return input.toString();
  }

  public static String decrypt(final String encryptedText, final int n) {
    if (encryptedText ==  null || encryptedText.equals("") || n <= 0){
      return encryptedText;
    }
    int textLength = encryptedText.length();
    System.out.println(textLength/2);
    StringBuilder input = new StringBuilder(encryptedText);
    StringBuilder result = new StringBuilder("");

    for (int i = 0; i < n; i++){
      for (;;textLength++){

      }
    }

    return null;
  }

  public static void main(String[] args) {
    String kata = "This kata is very interesting!123456789012345678";
    int i = 0;
    int end = 80;
    System.out.println("length of kata : " + kata.length() );
    while (i < end) {
      String result = encrypt(kata,i);
      if (result.equals(kata)){
        System.out.println(result + " " + i); // alkSğı
      }
      i++;
    }
  }
  // 30-31 : +5
  // 32-33 : +10
  // 34-35 : +12
  // 36-37 : +36
  // 38-39 : +12
  // 40-41 : +10
}
