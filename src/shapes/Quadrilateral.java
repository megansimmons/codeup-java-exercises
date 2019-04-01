package shapes;

abstract class Quadrilateral extends Shape implements Measurable {



  /*  protected properties for length and width
    a constructor that accepts two numbers for the length and width and sets those properties
    methods for getting the length and width
    abstract methods for setting the length and width*/

    protected int length;
    protected int width;


    //is default constructor necessary for creating setter in subclass?



    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    abstract void setLength(int length);

    abstract void setWidth(int width);


}
