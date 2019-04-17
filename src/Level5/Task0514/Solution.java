package Level5.Task0514;

public class Solution {

  static class Person {

    String name;
    int age;

    public void Initialize(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {

    Person Adam = new Person();
    Adam.Initialize("Adam", 33);

  }
}
