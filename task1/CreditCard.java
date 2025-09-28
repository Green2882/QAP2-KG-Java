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

    // getPersonal method
    public String getPersonal() {

        return (this.owner.toString());
    }

    // charge method
    public void charge(Money amount) {

        Money newBalance = this.balance.add(amount);

        if (newBalance.compareTo(this.creditLimit) > 0) {
            System.out.println("Error - charge exceeds credit limit");
        } else {
            this.balance = newBalance;
        }
    }

    // payment method
    public void payment(Money amount) {

        Money newBalance = this.balance.subtract(amount);
        this.balance = newBalance;

        /* Did not specify in assignment if they can overpay their balance and have credits or not so I allowed them to.
        I do however understand if that was the case, i would use the same if statement as in add method
        and just compare to see if payment exceeds balance and throw error if it did*/
    }
}
