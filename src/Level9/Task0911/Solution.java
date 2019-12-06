package Level9.Task0911;
import java.util.HashMap;

/*
Исключение при работе с коллекциями Map
*/

public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код

    HashMap<String, String> map = new HashMap<String, String>(null);
    map.put(null, null);
    map.remove(null);

    //напишите тут ваш код
  }
}
