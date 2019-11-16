package Level8.Task0801;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public static void main(String[] args) {
    Set<String> mySet = new HashSet<String>();
    mySet.add("арбуз");
    mySet.add("банан");
    mySet.add("вишня");
    mySet.add("груша");
    mySet.add("дыня");
    mySet.add("ежевика");
    mySet.add("женьшень");
    mySet.add("земляника");
    mySet.add("ирис");
    mySet.add("картофель");

    for (String text : mySet){
      System.out.println(text);
    }

  }
}
