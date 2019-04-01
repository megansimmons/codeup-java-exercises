package shapes;

public class ShapesTest {

    public static void main(String[] args) {


        Measurable myShapeA = new Square(5);

        Measurable myShapeB = new Rectangle(5,2);




        System.out.println(myShapeA.getArea());
        System.out.println(myShapeA.getPerimeter());

        System.out.println(myShapeB.getArea());
        System.out.println(myShapeB.getPerimeter());



  /*      Rectangle box1 = new Rectangle(5, 4);

        Rectangle box2 = new Square(5);


        System.out.println(box1.getArea());

        System.out.println(box1.getPerimeter());

        System.out.println(box2.getArea());

        System.out.println(box2.getPerimeter());


*/

    }
}
