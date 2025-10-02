package task3;

import task2.MyPoint;

public class MyRectangle {

    // Instance variables
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {

        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {

        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Getters and setters for topLeft
    public MyPoint getTopLeft() {

        return this.topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {

        this.topLeft = topLeft;
    }

    // Getters and setters for bottomRight
    public MyPoint getBottomRight() {

        return this.bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {

        this.bottomRight = bottomRight;
    }
}
