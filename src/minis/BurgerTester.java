package minis;

public class BurgerTester {

    public static void main(String[] args) {

        BurgerTools.mostPopularTopping = "Avocado";
        System.out.println(BurgerTools.mostPopularTopping);

        BurgerTools.averageDaysBeforeExpiration = 3;
        System.out.println(BurgerTools.averageDaysBeforeExpiration);

        BurgerTools.temperatureWhenCooked = 200;
        System.out.println(BurgerTools.temperatureWhenCooked);

        BurgerTools.grill();

    }


}
