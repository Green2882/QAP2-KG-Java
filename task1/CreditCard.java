package task1;

public class CreditCard {

    //Instance variables
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {

        this.owner = newCardHolder;
        this.creditLimit = limit;
    }
}
