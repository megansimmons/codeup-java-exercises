package minis;

public class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 713;
        dish.nameOfDish = "Milanesa";
        dish.wouldRecommend = true;
        dish.eat();


/*        System.out.println(dish.nameOfDish);
        System.out.println(dish.wouldRecommend);
        System.out.println(dish.costInCents);*/

        System.out.printf("%n %d %s %b" ,
                dish.costInCents,
                dish.nameOfDish,
                dish.wouldRecommend);


    }
}
