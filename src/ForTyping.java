import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ForTyping {

  public static void main(String[] args) {

    Set<String> set = new HashSet<String>();
    set.add("Mama");
    set.add("Mila");
    set.add("Ramu");

    for (String text:set){
      System.out.println(text);
    }

  }
}
