import java.util.Scanner;


public class Bob {

    public static void main(String[] args) {

//        Create a class named Bob with a main method for the following exercise.
//
//                Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

        Scanner scanner = new Scanner(System.in);



        String bob = " ";
        String otherPerson;
        String answer = " ";
        do {
            System.out.println("Attempt conversation.");
            otherPerson = scanner.nextLine();

            if (otherPerson.endsWith("?")) {
                bob = "Sure";

            } else if (otherPerson.endsWith("!")) {
                bob = "Whoa, chill out!";
            } else if (otherPerson.isEmpty()) {
                bob = "Fine. Be that way!";
            } else {
                bob = "Whatever";
            }
            System.out.println(bob);
            System.out.println("Do you want to continue attempt?");
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));











    }
}
