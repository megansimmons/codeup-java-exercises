import java.util.Scanner;

public class MethodsExercises {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

/*        System.out.println(addition(5,4));
        System.out.println(subtraction(10, 4));
        System.out.println(multiplication(5,4));
        System.out.println(division(20,2));
        System.out.println(modulus(20,4));

        count(5); */

      int x = getInteger(11, 20);

        System.out.println(x);

//        int i = getInteger(1, 10);

//        factorial(i);


    }
/*     1.   Basic Arithmetic

       a. Create four separate methods. Each will perform an arithmetic operation:

        Addition
        Subtraction
        Multiplication
        Division
       b. Each function needs to take two parameters/arguments so that the operation can be performed.

       c. Test your functions and verify the output.

       d. Add a modulus function that finds the modulus of two numbers.

 Food for thought: What happens if we try to divide by zero? What should happen?*/

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }










//    Create a method that validates that user input is in a certain range


    public static int getInteger(int min, int max) {

        System.out.println("Enter a number between " + min + " and " + max);

        int userInput = scanner.nextInt();


        while (userInput < min || userInput > max) {

            System.out.println("Your number is out of range, try again: ");

            userInput = scanner.nextInt();


        }

        System.out.println("Your number " + userInput + " is valid!");

        return userInput;
    }












        static void factorial(int i){


            boolean userContinue = false;


            do {


                long fact = 1;

//                int userInt = i;

//                userInt = scanner.nextInt();//It is the number to calculate factorial

      // Use a for loop to calculate the factorial.

                for (int x = 1; x <= i; x++) {

                    fact = fact * x;

                    System.out.println(fact);
                }


                System.out.println("Factorial of " + i + " is: " + fact);

            System.out.println("Would you like to continue?");

                String answer = scanner.next();




            } while (userContinue);


        }

//
//
////     3. Calculate the factorial of a number.
//
//    static void factorial() {
//
//        String answer = " ";
//
//        //Prompt the user to enter an integer from 1 to 10.
//
//        System.out.println("Enter and integer between 1 and 10.");
//
//        Scanner scannerThree = new Scanner(System.in);
//
//        int userInt = scannerThree.nextInt();//It is the number to calculate factorial
//
//        //Assume that the user will enter an integer, but verify it’s between 1 and 10.
//
//
//        if (userInt >= 1 && userInt <= 10) {
//            System.out.println("Your number " + userInt + " is valid!");
//        } else {
//            System.out.println("Your number is out of range ");
//
//        }
//
//        //Use the long type to store the factorial.
//
//        long fact = 1;
//
//
//        // Use a for loop to calculate the factorial.
//
//        for (int i = 1; i <= userInt; i++) {
//        String message = "" + i + "! = ";
//            fact = fact *i;
////            fact = fact * i;
//            System.out.println(fact);
//        }
//        //Display the factorial of the number entered by the user.
//
//
//        System.out.println("Factorial of " + userInt + " is: " + fact);
////            Ask if the user wants to continue.
////            Continue only if the user agrees to.
//
//    }




// MARCUS' VERSION OF FACTORIAL PROGRAM


//    public static void factorial(int num){
//
//        for(int i = 1; i <= num; i++){
//
//            long factorSolution = 1;
//
//            String message = "" + i + "! = ";
//
//
//            for(int x = 1; x <= i; x++){
//
//                if(i == x){
//
//                    factorSolution *= x;
//
//                    message += x;
//
//                    continue;
//                }
//
//                factorSolution *= x;
//
//                message += x + " x ";
//
//            }
//
//            message += " = " + factorSolution;
//
//            System.out.println(message);
//
//        }
//    }


//This is the closing for the class MethodsExercises: do not go below this line!


}







