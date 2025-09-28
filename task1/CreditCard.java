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

    // getBalance method
    public Money getBalance() {

        return new Money(this.balance);
    }

    // getCreditLimit method
    public Money getCreditLimit() {

        return new Money(this.balance);
    }
}
