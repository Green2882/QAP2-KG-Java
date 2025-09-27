
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

}
