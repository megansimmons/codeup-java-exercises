public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int myFavoriteNumber = 713;
        System.out.println(myFavoriteNumber);
//
        String myString = "Gandalf is beautiful.";

//        String myString = 3.14159;//incompatible types error
        System.out.println(myString);

//        long myNumber = 3.14;//must not be a decimal (literal values with a decimal point are treated as _________)

//        double myNumber = 3.14;// this works

        long myNum = 123L;// L does not print out

        float myNumber = 3.14f;// this works too
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);//5
//        System.out.println(x);//6

//        int x = 5;
//        System.out.println(++x);//6
//        System.out.println(x);//6

//        String class = 3;//can't do this

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;// classCastException
//        int three = (int) "three";//string cannot be converted to int error


        System.out.println(theNumberThree);
        System.out.println(o);
//        System.out.println(three);//can't do this


//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);//5
        System.out.println(y);//-3

//        byte first = 128;
//        System.out.println(first);//error: incompatible types from int to byte
        byte second = 1;
        System.out.println(second);
//
//        short third = 654,321;
//        System.out.println(third);//error: identifier expected

        short fourth = 45;
        System.out.println(fourth);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println();

    }
}
