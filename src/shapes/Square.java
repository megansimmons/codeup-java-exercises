package shapes;

public class Square extends Quadrilateral {

 /*   Change your existing Square class to extend Quadrilateral.

    Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.*/



    public Square(int side) {
        super(side, side);

    }

    public void setLength(int length){
        this.length = length;
        this.width = length;
    }

    public void setWidth(int width){
        this.width = width;
        this.length = width;
    }


    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    public double getArea() {
        return this.length * this.width;
    }



}
