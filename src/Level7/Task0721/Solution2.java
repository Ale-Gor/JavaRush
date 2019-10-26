package Level7.Task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Минимаксы в массивах
*/

public class Solution2 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = new int[20];
    int maximum;
    int minimum;

    for (int i = 0; i < 20; i++) {
      numbers[i] = Integer.parseInt(reader.readLine());
    }

    minimum = numbers[0];
    maximum = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < minimum) {
        minimum = numbers[i];
      }
      if (numbers[i] > maximum) {
        maximum = numbers[i];
      }
      System.out.print(maximum + " " + minimum);
    }
  }
}
