package Level7.Task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Минимаксы в массивах
*/

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> lst = new ArrayList<>();

    int maximum;
    int minimum;

    for (int i = 0; i < 20; i++){
      lst.add(Integer.parseInt(reader.readLine()));
    }

    minimum = lst.get(0);
    maximum = lst.get(0);

    for (int i = 0; i < lst.size(); i++) {
      if (lst.get(i)<minimum){
        minimum = lst.get(i);
              }
      if (lst.get(i) > maximum) {
        maximum = lst.get(i);
      }


    }

   System.out.print(maximum + " " + minimum);
  }
}
