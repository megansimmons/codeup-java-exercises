import java.util.Random;

public class ServerNameGenerator {

/*    Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
    Create a method that will return a random element from an array of strings.
    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.*/

public static String randomAdj;
public static String randomNoun;

public static String randomEl(String[] array){
    int r = (int) (Math.random() * array.length);

    return array[r];
}




/*    public static Random random(String[] array){

        Random randomString = new Random();
        int randomInt = randomString.nextInt(array.length);
        System.out.println(array[randomInt]);

//        Random randomNoun = new Random();
//        int indexNoun = randomNoun.nextInt(nouns.length);



        return randomString;
    }*/

    public static void main(String[] args) {

        String[] adjectives = {
                "sleepy",
                "grumpy",
                "sneezy",
                "bashful",
                "happy",
                "cynical",
                "dopey",
                "genuine",
                "dedicated",
                "honest"
        };

        String[] nouns = {
                "dog",
                "nerd",
                "ocean",
                "building",
                "zombie",
                "friend",
                "garden",
                "food",
                "sock",
                "family"
        };

       randomAdj = randomEl(adjectives);
       randomNoun = randomEl(nouns);
        System.out.println(randomAdj);
        System.out.println(randomNoun);
        System.out.println(randomAdj + "-" + randomNoun);

        /*String one = ServerNameGenerator.random(adjectives);*/

        /*System.out.println(one);*/


        String[] arr={"1", "2", "3", "4", "5"};
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
        System.out.println(arr[randomNumber]);

    }



}
