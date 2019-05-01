package Level6.Task0613;


public class Solution {


  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      Cat cat = new Cat();
    }
    // Создай 10 котов

    // Выведи значение переменной catCount
    System.out.println(Cat.catCountForTask0613);
  }

  public static class Cat {
    public static int catCountForTask0613;


    // Создай статическую переменную catCount

    // Создай конструктор

    public Cat() {
      catCountForTask0613++;
    }
  }

}
