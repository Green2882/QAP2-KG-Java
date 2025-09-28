package task1;

public class Person {

    // Instance variables
    private String lastName;
    private String firstName;
    private Address home;

    // Contructor (uml did not directly ask for this but unsure how i'd create person in demo class without)
    public Person(String lastName, String firstName, Address home) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // toString method
    public String toString() {

        return (this.firstName + " " + this.lastName + ", " + this.home);
    }
}
