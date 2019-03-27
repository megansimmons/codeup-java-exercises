package util;

import java.util.Scanner;


public class Input {


   private Scanner scanner;


   public Input(){

       scanner = new Scanner(System.in);

   }

    public  String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("yes/no");
        String userInput = scanner.next();
        return (userInput.equalsIgnoreCase("y")|| userInput.equalsIgnoreCase("yes"));

    }




    public int getInt(int min, int max) {

        System.out.println("Enter a number between " + min + " and " + max);

        int userInput = scanner.nextInt();


        while (userInput < min || userInput > max) {

            System.out.println("Your number is out of range: ");

            userInput = scanner.nextInt();


        }

        System.out.println("Your number " + userInput + " is valid!");

        return userInput;
    }

    public int getInt(){
        System.out.println("Enter an integer");
       return scanner.nextInt();
    }


    public double getDouble(double min, double max) {

        System.out.println("Enter a number between " + min + " and " + max);

        double userInput = scanner.nextDouble();


        while (userInput < min || userInput > max) {

            System.out.println("Your number is out of range, try again: ");

            userInput = scanner.nextDouble();


        }

        System.out.println("Your number " + userInput + " is valid!");

        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter an integer");
        return scanner.nextDouble();
    }


}
