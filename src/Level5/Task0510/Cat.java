package Level5.Task0510;

public class Cat {

    private String name = null;
    private int weight;
    private int age;
    private String color = null;
    private String address = null;

    public void initialize(String name, int weight, int age, String color, String address) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 6;
        this.age = age;
    }

    public void initialize(int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

        public static void main (String[]args){

        }
    }

