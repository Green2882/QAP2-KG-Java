
public class MyPoint {

    // Instance variables
    private int x = 0;
    private int y = 0;

    // Default constructor
    public MyPoint() {
    }

    // Parameterized constructor
    public MyPoint(int x, int y) {

        this.x = x;
        this.y = y;
    }

    // Getter methods
    public int getX() {

        return this.x;
    }

    public int getY() {

        return this.y;
    }

    // Setter methods
    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public void setXY(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int[] getXY() {

        return new int[]{this.x, this.y};
    }

    // toString method
    public String toString() {

        return ("(" + this.getX() + "," + this.getY() + ")");
    }

    // Overloaded distance methods
    public double distance(int x, int y) {

        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return (Math.sqrt(xDiff * xDiff + yDiff * yDiff));
    }

    public double distance(MyPoint anotherPoint) {

        int xDiff = this.x - anotherPoint.x;
        int yDiff = this.y - anotherPoint.y;

        return (Math.sqrt(xDiff * xDiff + yDiff * yDiff));
    }

    public double distance() {

        return (Math.sqrt(this.x * this.x + this.y * this.y));
    }
}
