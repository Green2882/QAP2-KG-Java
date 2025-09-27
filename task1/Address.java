package task1;

public class Address {

    // Instance variables
    private String street;
    private String city;
    private String state;
    private String zip;

    // toString method
    public String toString() {

        return (this.street + ", " + this.city + ", " + this.state + ", " + this.zip);
    }
}
