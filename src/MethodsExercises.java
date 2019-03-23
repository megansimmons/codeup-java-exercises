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

//        getInteger(11, 20);


        factorial();








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
//            int number = 1;
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

            //I don't know what else to return even though not really using this for anything
             return userInput;
        }





        // 3. Calculate the factorial of a number.

//        static int factorial(int userInt){
//
//        //Prompt the user to enter an integer from 1 to 10.
//        //Assume that the user will enter an integer, but verify it’s between 1 and 10.
//
//        //Use the long type to store the factorial.
//            long fact = 1;
//        // Use a for loop to calculate the factorial.
//            for(int i = 1; i < userInt; i ++){
//                fact = fact * i;
//            }
//            System.out.println(fact);
//        //Display the factorial of the number entered by the user.
//
//
//
//
////    Ask if the user wants to continue.
////    Continue only if the user agrees to.
//
//
//
//
//            return userInt;
//
//        }

// Example from javatpoint.com

        static int factorial() {

            System.out.println("Enter and integer between 1 and 10.");
            Scanner scannerThree = new Scanner(System.in);
            int userInt = scannerThree.nextInt();//It is the number to calculate factorial
            int i;
            long fact = 1;
            for (i = 1; i <= userInt; i++) {
                fact = fact * i;
                System.out.println(fact);
            }
            System.out.println("Factorial of " + userInt + " is: " + fact);

            return i;
        }

//This is the closing for the class MethodsExercises: do not go below this line!
}







