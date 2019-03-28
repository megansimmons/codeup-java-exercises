package Shapes;

public class Rectangle {

    protected int length;

    protected int width;

    public Rectangle(){

    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }



 /*   Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:*/




    public int getArea(){

        return this.length * this.width;

    }

    public int getPerimeter(){

        return 2 * this.length + 2 * this.width;

    }


}
