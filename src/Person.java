public class Person {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name){
//        System.out.println(name);
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, " + name);
    }


    public Person(String name){
        setName(name);

    }

    public static void main(String[] args) {

        Person personA = new Person("Paxton");
        System.out.println(personA.name);

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));//error
//        System.out.println(person1.name.equals(person2.name));//error
//        System.out.println(person1 == person2);//false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);//true

//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());//null
//        System.out.println(person2.getName());//null
//        person2.setName("Jane");
//        System.out.println(person1.getName());//null
//        System.out.println(person2.getName());//null

    }







}

