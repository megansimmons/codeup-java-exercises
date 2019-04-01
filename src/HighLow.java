import java.util.Scanner;

public class HighLow {

    public static void gameFunction(){


        boolean keepGoing = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pick a number between 1 and 100.");

            double random;
            double answer;
            random = Math.round(Math.floor(Math.random() *100 +1));
            System.out.println(random);
            String choice;

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

                if(choice.equals("y")){
                    keepGoing = true;
                }

        } while(keepGoing);
    }



    public static void main(String[] args) {
        gameFunction();


    }

}