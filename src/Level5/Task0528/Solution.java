package Level5.Task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

  public static void main(String[] args) {
    Date currentDate = new Date();
    SimpleDateFormat sdfDate = new SimpleDateFormat("dd MM YYYY");


    System.out.println(sdfDate.format(currentDate));


  }


}
