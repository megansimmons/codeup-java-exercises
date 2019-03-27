package Shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input test = new Input();

        Circle firstCircle = new Circle(test.getInt());



        System.out.println(firstCircle.getArea());
        System.out.println(firstCircle.getCircumference());

        Circle secondCircle = new Circle(test.getInt());

        System.out.println(secondCircle.getArea());
        System.out.println(secondCircle.getCircumference());

    }
}
