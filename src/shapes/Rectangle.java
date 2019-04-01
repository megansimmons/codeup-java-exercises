package shapes;

public class Rectangle extends Quadrilateral {


    public Rectangle(int length, int width){

        super(length, width);

    }

    public void setLength(int length) {


    }

    public void setWidth(int width) {


    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }


    public double getArea() {
        return this.length * this.width;
    }


}
