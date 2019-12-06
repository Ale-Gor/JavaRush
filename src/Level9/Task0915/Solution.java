import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/*
Перехват выборочных исключений
*/

public class Solution {
  public static StatelessBean BEAN = new StatelessBean();

  public static void main(String[] args) {
    handleExceptions();
  }

  public static void handleExceptions() {
    BEAN.methodThrowExceptions();
  }

  public static class StatelessBean {
    public void log(Exception exception) {
      System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
    }

    public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
      int i = (int) (Math.random() * 3);
      if (i == 0) {
        throw new CharConversionException();
      } else if (i == 1) {
        throw new FileSystemException("");
      } else if (i == 2) {
        throw new IOException();
      }
    }
  }
}
