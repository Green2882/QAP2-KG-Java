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

    // Getters and setters for individual x and y
    public int getTopLeftX() {

        return topLeft.getX();
    }

    public void setTopLeftX(int x) {

        topLeft.setX(x);
    }

    public int getTopLeftY() {

        return topLeft.getY();
    }

    public void setTopLeftY(int y) {

        topLeft.setY(y);
    }

    public int getBottomRightX() {

        return bottomRight.getX();
    }

    public void setBottomRightX(int x) {

        bottomRight.setX(x);
    }

    public int getBottomRightY() {

        return bottomRight.getY();
    }

    public void setBottomRightY(int y) {

        bottomRight.setY(y);
    }
}
