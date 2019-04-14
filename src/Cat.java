public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat cat = new Cat();
        Cat.catsCount = cat.catsCount;
    }

    public static void main(String[] args) {

       setCatsCount(5);
        System.out.println(catsCount);

    }
}
