package Level5.Task0526;

public class Solution {

  public static class Man{
    String name;
    int age;
    String address;

    public Man(String name, int age, String address) {
      this.name = name;
      this.age = age;
      this.address = address;
    }
  }

  public static class Woman{
    String name;
    int age;
    String address;

    public Woman(String name, int age, String address) {
      this.name = name;
      this.age = age;
      this.address = address;
    }
  }

  public static void main(String[] args) {
    Man adam = new Man("Adam", 33, "Krakow");
    Woman eva = new Woman("Eva", 30, "Krakow");
    Woman silvia = new Woman("Silvia", 20, "Waw");
    Man sam = new Man("Sam", 33, "Lublin");

    System.out.println(adam.name +" "+ adam.age + " "+ adam.address);
    System.out.println(eva.toString());

  }

}
