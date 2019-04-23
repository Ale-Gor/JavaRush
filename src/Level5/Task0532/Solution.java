package Level5.Task0532;

import java.io.*;

/*
Задача по алгоритмам
*/

public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(reader.readLine());
    int a;
    int maximum = Integer.parseInt(reader.readLine());



    for (int i = 0; i < N-1; i++) {

      int nextInt = Integer.parseInt(reader.readLine());
      if (nextInt > maximum){
        maximum = nextInt;
      }

    }

    System.out.println(maximum);
  }
}
