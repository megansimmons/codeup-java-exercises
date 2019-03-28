package Shapes;

public class Square extends Rectangle {
    private int side;

    /*Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.*/

    public Square(int side){

        this.length = side;

        this.width = side;

    }

    public int getArea(){

        return (int) Math.pow(this.side, 2);

    }


    public int getPerimeter(){

        return 4 * this.side;
    }


/*    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square.length);
        System.out.println(square.width);

    }*/



}
