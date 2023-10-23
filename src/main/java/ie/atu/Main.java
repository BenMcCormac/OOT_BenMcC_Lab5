package ie.atu;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        Person student1 = new Person("Paul", "Lennon", 30);
        student1.displayInfo();

        Person student0 = new Person();
        student0.displayInfo();

        student0.getUserInput();
        student0.displayInfo();

    }
}
