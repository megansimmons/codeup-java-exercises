import java.util.Scanner;

public class HighLow {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100.");

        double random;
        double answer;
        random = Math.round(Math.floor(Math.random() *100 +1));
        String choice;
        boolean keepGoing = true;
        do {
            do {
                answer = scanner.nextDouble();
                if (answer > random) {
                    System.out.println("LOWER");
                } else if (answer < random) {
                    System.out.println("HIGHER");
                } else if (answer == random) {
                    System.out.println("GOOD GUESS");
                }
            } while (answer != random);

            System.out.println("do you want to go play again?");
            choice = scanner.next();

            if(choice.charAt(0) == 'n'){
                keepGoing = false;
            } else if(choice.charAt(0) == 'y'){
                keepGoing = true;
            }

        } while(keepGoing);

    }

}