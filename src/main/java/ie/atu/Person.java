package ie.atu;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;

    //Constructor
    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + firstName + "" + lastName + ", Age: " + age);
    }
}
