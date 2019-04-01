package minis;

abstract class Employee {

    protected String name;
    protected String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public abstract String work();

    public static void main(String[] args) {

        Developer developer = new Developer("Sabita", "human resources");
        Manager manager = new Manager("Cailtin", "Food safety");

        System.out.println(developer.name + ":" + developer.department);
        System.out.println(manager.name);

    }


}
