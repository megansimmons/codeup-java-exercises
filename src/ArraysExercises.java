import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        String[] daysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

       /* for(String day: daysOfWeek){
            System.out.println(day);
        }*/





        /*Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.*/



        Person[] objects = new Person[3];


        objects[0] = new Person("Diana");
        objects[1] = new Person("Jamie");
        objects[2] = new Person("Adriana");




        for(int i = 0; i < 3; i +=1){

            System.out.println(objects[i].getName());

        }

        Person newbOne = new Person("Emily");

        Person newbTwo = new Person("Sabita");

        Person newbThree = new Person("Fourth Marcus");

        Person[] copy = ArraysExercises.addPerson(objects, newbOne);

        Person[] copy2 = ArraysExercises.addPerson(objects, newbThree);



     for(int i = 0; i < copy2.length; i +=1){
         System.out.println(copy2[i].getName());
     }

    }

    /*Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.*/

        public static Person[] addPerson(Person[] objects, Person addNewb){


            Person[] copy;
            copy = Arrays.copyOf(objects, objects.length + 1);

            copy[objects.length] = addNewb;

             return copy;

        }

}
