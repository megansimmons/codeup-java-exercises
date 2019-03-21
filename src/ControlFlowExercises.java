import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Loop Basics
//
//       1. While
//
//        a. Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:


//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i++);
//        }

//
//        5 6 7 8 9 10 11 12 13 14 15
//
//        Do While
//
//        b. Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

        // example do-while loop
//        int count = 1;
//        do {
//            System.out.println("Count is: " + count);
//            count++;
//        } while (count < 11);

//
//        int x = 0;
//        do {
//            System.out.println();
//                x++;
//        } while (x <=10);

        // DOESN'T WORK

//        int x = 1;
//        do {
//            if (x % 2  == 0) {
//                System.out.println(x);
//                x++;
//            }
//        } while (x <= 100);


//        Alter your loop to count backwards by 5's from 100 to -10.

        // THIS WORKS

//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while(j>= -10);


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

        // THIS WORKS

//        long k = 2;
//        do {
//            k *= k;
//            System.out.println(k);
//        } while (k < 1000000);


//        For
//
//        refactor the previous two exercises to use a for loop instead

//        int m = 0;
//        for (m = 0; m <= 100; m++){
//            if (m % 2==0){
//                System.out.println(m);
//            }
//        }

//        int b = 100;
//        for (b = 100; b >= -10; b--){
//            if(b %5 == 0){
//                System.out.println(b);
//            }
//        }


//        2. Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.
//        int fb = 1;
//
//        for (fb = 1; fb <= 100; fb++) {
//            if (fb % 15 == 0) {
//                System.out.println("fizzbuzz");
//            } else if (fb % 5 == 0) {
//                System.out.println("buzz");
//            } else if (fb % 3 == 0) {
//                System.out.println("fizz");
//            } else {
//                System.out.println(fb);
//            }
//        }

        //WALK THRU WAY FOR FIZZBUZZ
        // in this example if the number is divisible by 15, the first two number passes the first two code blocks and concats the string to be FizzBuzz
        //if each block is just doing one thing, (like below), you don't have to use the curly braces...but you can

//        int top = 60;
//        int bot = 1;
//        while (bot < top) {
//            String message = "";
//            if (bot %3 ==0) {
//               message += "Fizz";
//            }
//            if ( bot %5 == 0){
//                message += "Buzz";
//            }
//            if (bot %3 !=0 && bot %5 !=0) {
//                message += bot;
//            }
//            System.out.println(message);
//            bot++;
//        }


//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.


//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

//        String userInput;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//
//            int input = scanner.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | ------");
//
//
//            for (int t = 1; t <= input; t++) {
//                int tsq = (int) Math.pow(t, 2);
//                int tcu = (int) Math.pow(t, 3);
//
//                System.out.printf("%-6d | %-7d | %-6d%n", t, tsq, tcu);
//
//            }
//            System.out.println("Do you want to print another number?");
//            userInput = scanner.next();
//
//        } while (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));





//

        String userGrade;

        do {
            System.out.println("Enter a numerical grade.");

            int grade = scanner.nextInt();

            if (grade >= 88 && grade <= 100) {
                System.out.println("You have an A");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("You have a B");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("You have a C");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("You have a D");
            } else {
                System.out.println("You have an F");
            }

            System.out.println("Do you want to print another number?");
            userGrade = scanner.next();
        } while (userGrade.equalsIgnoreCase("y") || userGrade.equalsIgnoreCase("yes"));


        //Don't go below this!
    }
}
