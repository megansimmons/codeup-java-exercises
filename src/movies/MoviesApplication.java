package movies;

import java.util.Scanner;

import util.Input;

public class MoviesApplication {

    private Scanner scanner;

    public MoviesApplication(){

        scanner = new Scanner(System.in);

    }

    private String getMenu(){
        return "What would you like to do?\n" +

            "0 - exit\n" +
            "1 - view all movies\n" +
            "2 - view movies in the animated category\n" +
            "3 - view movies in the drama category\n" +
            "4 - view movies in the horror category\n" +
            "5 - view movies in the scifi category\n";
    }


    private int userSelect() {
        int userSelect = scanner.nextInt();
        System.out.println(userSelect);
        this.options(userSelect);
        return userSelect;
    }





    public int options(int userSelect){
        if(userSelect == 0){
            System.out.println("exit");
        } else if(userSelect == 1){
            System.out.println("Do you want to view all movies?");
            System.out.println(this.filter("all"));
        } else if(userSelect == 2){
            System.out.println("animated");
            System.out.println(this.filter("animated"));
        } else if(userSelect == 3){
            System.out.println("drama");
            System.out.println(this.filter("drama"));
        } else if(userSelect == 4){
            System.out.println("horror");
            System.out.println(this.filter("horror"));
        } else if(userSelect == 5){
            System.out.println("scifi");
            System.out.println(this.filter("scifi"));
        }

        System.out.println("Would you like to continue?");
            String yesChoice = scanner.next();
            if(yesChoice.equals("y") || yesChoice.equals("yes")){
                this.runApp();
            } else {
                System.out.println("See ya next time.");
            }

        return userSelect;
    }

    private String filter(String category){
        String newMovie = "";
        Movie[] allMovies = MoviesArray.findAll();
        for(int i = 0; i < allMovies.length; i++){
            if(allMovies[i].getCategory() == category){
                newMovie += allMovies[i].getName() + "---" + allMovies[i].getCategory() + "\n";
            } else if(category == "all") {
                newMovie += allMovies[i].getName() + "---" + allMovies[i].getCategory() + "\n";
            }

        }
        return newMovie;

    }


    public void runApp(){
        System.out.println(this.getMenu());
//        this.userSelect();
        this.userSelect();

    }





    public static void main(String[] args) {

        MoviesApplication movieApp = new MoviesApplication();
        //method for running application

        movieApp.runApp();





    }



}
