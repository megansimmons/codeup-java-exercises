package util;
import java.util.Scanner;


public class Input {

    private Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return "";
    }

    public boolean yesNo(){
        return true;
    }




    public static int getInteger(int min, int max) {
        int output;
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.printf("Invalid input. Enter a valid integer between %d and %d: ", min, max);
            sc.next();
        }
        output = sc.nextInt();
        if(output < min || output > max) {
            System.out.printf("Invalid range. Enter a valid integer between %d and %d: ", min, max);
            return getInteger(min, max);
        }
        return output;
    }


    public static void main(String[] args) {

    }
}
