package Level8.Task0825;


/*
Модификатор запутался
*/

public class Solution {
  public int A = 5;
  public static int B = 2;

  public int C = A * B;
  public static int D = B * A;

  public static void main(String[] args) {
  }

  public static int getValue() {
    return D;
  }

  public int getValue2() {
    return C;
  }
}