package Level6.Task0603;

public class Solution {

  public static void main(String[] args) {


    Cat[] cats = new Cat[5000];
    Dog[] dogs = new Dog[5000];

    for (int i = 0; i < 5000; i++) {

      cats[i] = new Cat();
      dogs[i] = new Dog();

    }

  }

  class Dog {
    @Override
    protected void finalize() throws Throwable {
      super.finalize();
      System.out.println("Cat was destroyed");
    }
  }

  class Cat {
    @Override
    protected void finalize() throws Throwable {
      super.finalize();
      System.out.println("Cat was destroyed");
    }
  }

}
