package task1;

public class Money {

    // Instance variables
    private long dollars;
    private long cents;

    // Constrcutors
    public Money(double amount) {

        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);

        if (cents == 100) {
            this.dollars++;
            this.cents = 0;
        }
    }

    public Money(Money otherObject) {

        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Add method
    public Money add(Money otherAmount) {
        long totalDollars = this.dollars + otherAmount.dollars;
        long totalCents = this.cents + otherAmount.cents;

        if (totalCents >= 100) {
            totalDollars += totalCents / 100;
            totalCents = totalCents % 100;
        }

        return new Money(totalDollars + (totalCents / 100.0));
    }

    // Subtract method
    public Money subtract(Money otherAmount) {
        long totalDollars = this.dollars - otherAmount.dollars;
        long totalCents = this.cents - otherAmount.cents;

        if (totalCents < 0) {
            totalDollars -= 1;
            totalCents += 100;
        }

        return new Money(totalDollars + (totalCents / 100.0));
    }

    // compareTo method
    public int compareTo(Money anotherObject) {
        if (this.dollars == anotherObject.dollars && this.cents == anotherObject.cents) {
            return 0; // equal
        } else if (this.dollars > anotherObject.dollars
                || (this.dollars == anotherObject.dollars && this.cents > anotherObject.cents)) {
            return 1; // greater than

        } else {
            return -1; // less than
        }
    }

    // equals method
    public boolean equals(Money anotherObject) {

        return (this.dollars == anotherObject.dollars && this.cents == anotherObject.cents);
    }

    public String toString() {

        double total = this.dollars + (this.cents / 100.00);

        return (String.format("%.2f", total));
    }

}
