package Level5.Task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());
    int d = Integer.parseInt(reader.readLine());
    int e = Integer.parseInt(reader.readLine());

    int minimum = min (min (min(a, b), min (c, d)), e);

    System.out.println("Minimum = " + minimum);
  }

  public static int min(int a, int b) {
    return a < b ? a : b;
  }
}
