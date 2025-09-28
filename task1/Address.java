package task1;

public class Address {

    // Instance variables
    private String street;
    private String city;
    private String state;
    private String zip;

    // Contructor (uml did not directly ask for this but unsure how i'd create address in demo class without)
    public Address(String street, String city, String state, String zip) {

        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // toString method
    public String toString() {

        return (this.street + ", " + this.city + ", " + this.state + ", " + this.zip);
    }
}
