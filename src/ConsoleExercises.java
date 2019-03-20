import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi + ".");
        System.out.format("The value of pi is approximately %.2f.", pi);

        Scanner scanner = new Scanner(System.in);
        Scanner secondScanner = new Scanner(System.in);


        System.out.println("\n Enter an integer: ");

        int userInput = scanner.nextInt();

        System.out.print("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter 3 words: ");

        String userInputOne = scanner.next();

//        System.out.print("Enter another word: ");

        String userInputTwo = scanner.next();

//        System.out.print("Enter a third word: ");

        String userInputThree = scanner.next();

        System.out.println(userInputOne + userInputTwo + userInputThree);
// iamtired

        System.out.format("%s \n %s \n %s", userInputOne, userInputTwo, userInputThree);

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("\nEnter a sentence");
        String userSentence = scanner2.nextLine();
        System.out.println(userSentence);






    }
}
