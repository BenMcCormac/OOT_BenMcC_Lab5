package ie.atu;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        Person student1 = new Person("Paul", "Lennon", 30);
        System.out.println("Details are: Name: " + student1.getFirstName() + " " +student1.getLastName() + " Age: " + student1.getAge());

        Person student0 = new Person();
        System.out.println("Details are: Name: " + student0.getFirstName() + " " +student0.getLastName() + " Age: " + student0.getAge());

        student0.getUserInput();
        student0.displayInfo();

    }
}
