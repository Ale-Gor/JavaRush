package Level6.Task0611;


public class StringHelper {
  public static String multiply(String s) {
    String result = "";
    multiply(s,5);
    return result;
  }

  public static String multiply(String s, int count) {
    String result = "";
    for (int i = 0; i < count ; i++) {
      result = s + result;
    }
    return result;
  }

  public static void main(String[] args) {

  }
}
