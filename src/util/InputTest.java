package util;

public class InputTest {

    public static void main(String[] args) {

        Input test = new Input();

        System.out.println(test.yesNo());

        test.getInt(3,15);

        test.getInt();

        test.getDouble(4,10);

        test.getDouble();


    }




}
