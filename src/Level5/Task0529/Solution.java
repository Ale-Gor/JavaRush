package Level5.Task0529;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
*/

public class Solution {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    int a = 0;
    String s = "";

    while (true)
    {
      s = br.readLine();
      if (s.equals("сумма"))
        break;
      else a=Integer.parseInt(s);
      sum = sum +a;
    }

    System.out.println("Сумма - "+ sum);

  }
}
