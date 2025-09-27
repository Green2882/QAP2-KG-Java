package task1;

public class Person {

    // Instance variables
    private String lastname;
    private String firstName;
    private Address home;

    // toString method
    public String toString() {

        return (this.firstName + " " + this.lastname + ", " + this.home);
    }
}
