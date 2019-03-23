import java.util.Scanner;

public class MethodsExercises {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println(addition(5,4));
//        System.out.println(subtraction(10, 4));
//        System.out.println(multiplication(5,4));
//        System.out.println(division(20,2));
//        System.out.println(modulus(20,4));

//        count(5);

        getInteger(11, 20);

    }
//     1.   Basic Arithmetic
//
//       a. Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//        Subtraction
//        Multiplication
//        Division
//       b. Each function needs to take two parameters/arguments so that the operation can be performed.
//
//       c. Test your functions and verify the output.
//
//       d. Add a modulus function that finds the modulus of two numbers.
//
// Food for thought: What happens if we try to divide by zero? What should happen?

        public static int addition(int x, int y){
            return x +y;
        }

        public static int subtraction(int x, int y){
            return x-y;
        }

        public static int multiplication(int x, int y){
            return x*y;
        }

        public static int division(int x, int y){
            return x/y;
        }

        public static int modulus(int x, int y){
            return x % y;
        }

//    Create a method that validates that user input is in a certain range



        public static int getInteger(int min, int max){
        // method accepts a number given from a user
            //determines if the number is within the range of min-max
                //use boolean to determine?
            int number = 1;
            System.out.println("Enter a number between " + min + " and " + max);
            Scanner scannerTwo = new Scanner(System.in);
            int userInput = scannerTwo.nextInt();
//            System.out.println(userInput);
            if(userInput >= min && userInput <= max){
                System.out.println("Your number " + userInput + " is valid!");
//                 i
            } else {
                System.out.println("Your number is out of range: ");
                getInteger(min, max);
            }
             return number;
        }



//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }




//This is the closing for the class MethodsExercises: do not go below this line!
}







