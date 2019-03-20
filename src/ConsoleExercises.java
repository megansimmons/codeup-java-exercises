import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi + ".");
        System.out.format("The value of pi is approximately %.2f.", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//
//
//        System.out.println("\nEnter an integer: ");
//
//        int userInput = scanner.nextInt();
//
//        System.out.print("You entered: --> \"" + userInput + "\" <--");
//
//        System.out.print("Enter 3 words: ");
//
//        String userInputOne = scanner.next();
//
//
//        String userInputTwo = scanner.next();
//
//
//        String userInputThree = scanner.next();
//        scanner.nextLine();
//
//
//
//        System.out.format("%s \n %s \n %s", userInputOne, userInputTwo, userInputThree);
//
//
//
//        System.out.println("\nEnter a sentence");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);


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
        double perimeter = 2 * (userLength + userWidth);
        System.out.format("\n The perimeter of the room is %s", perimeter);
        double volume = area * userHeight;
        System.out.format("\n The volume of the room is %s", volume);





    }
}
