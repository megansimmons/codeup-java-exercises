package Grades;
import java.util.*;

public class Student {
    private String name;
    private ArrayList <Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void addGrade(int grade){
       grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;


        for(int i = 0; i < grades.size(); i += 1){
            sum += grades.get(i);
        }

        return sum / grades.size();
    };

    public static void main(String[] args) {


        Student student1 = new Student("Caitlin");
        student1.addGrade(93);
        student1.addGrade(90);
        student1.addGrade(86);
        student1.addGrade(99);

        System.out.println(student1.getGradeAverage());


    }



}
