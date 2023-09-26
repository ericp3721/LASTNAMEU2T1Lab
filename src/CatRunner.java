public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Tim", 7, 7.7);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Katrina", 6, 6.6);
        cat2.printCatInfo();
        cat2.introduce();

    }
}
