import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi + ".");

        System.out.format("The value of pi is approximately %.2f.", pi);

        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//
//
        System.out.println("\nEnter an integer: ");

        int userInput = scanner.nextInt();

        System.out.print("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter 3 words: ");

        String userInputOne = scanner.next();


        String userInputTwo = scanner.next();


        String userInputThree = scanner.next();
        scanner.nextLine();//this prevents program from running past the sentence; a buffer of sorts
//could store this buffer in a variable
        //String random = scanner.nextLine();


        System.out.format("%s \n %s \n %s", userInputOne, userInputTwo, userInputThree);



        System.out.println("\nEnter a sentence");

        String userSentence = scanner.nextLine();
        System.out.println(userSentence);


        System.out.println("\nEnter the length, width, and height of your classroom.");
        double userLength = scanner.nextDouble();
        double userWidth = scanner.nextDouble();

        double userHeight = scanner.nextDouble();
//        int userLength = scanner.nextInt();
//        int userWidth = scanner.nextInt();




        System.out.format("%s \n %s \n", userLength, userWidth);
        double area = userLength * userWidth;
        System.out.println(area);
        System.out.format("The area of the room is: %s", area);
//        System.out.format("Here is the random variable: %s%n", random);
            //This goes with the buffer stored in a variable.


        double perimeter = 2 * (userLength + userWidth);
        System.out.format("\n The perimeter of the room is %s", perimeter);
        double volume = area * userHeight;
        System.out.format("\n The volume of the room is %s", volume);

        //another way could be to say
            //double ___________ = new Double(scanner.nextLine());
                // but this must be placed as the first variable followed by
                    //double ________ = scanner.nextDouble();

            //souf tab is a shortcut for using the following line (replaces printf)
//        System.out.printf("The area of the classroom is &f.", length * width);





    }
}
