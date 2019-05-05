package Level6.Task0614;

import java.util.ArrayList;

public class Cat {

  public static ArrayList<Cat> cats = new ArrayList<>();


  public Cat() {
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Cat newCat = new Cat();
      Cat.cats.add(newCat);

    }
    printCats();
  }

  public static void printCats() {
    for (int i = 0; i < cats.size(); i++) {

      System.out.println(cats.get(i));

    }
  }

}
