package task4;

import task2.MyPoint;

public class MyCircle {

    // Instance variables
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    // Constructors
    public MyCircle() {

        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {

        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {

        this.center = center;
        this.radius = radius;
    }

    // Getters and Setters
    public int getRadius() {

        return this.radius;
    }

    public void setRadius(int radius) {

        this.radius = radius;
    }

    public MyPoint getCenter() {

        return this.center;
    }

    public void setCenter(MyPoint center) {

        this.center = center;
    }

    public int getCenterX() {

        return this.center.getX();
    }

    public void setCenterX(int x) {

        this.center.setX(x);

    }

    public int getCenterY() {

        return this.center.getY();
    }

    public void setCenterY(int y) {

        this.center.setY(y);
    }

    public int[] getCenterXY() {

        return this.center.getXY();
    }

    public void setCenterXY(int x, int y) {

        this.center.setXY(x, y);
    }

    // toString method
    public String toString() {
        return "MyCircle[radius=" + this.getRadius() + ", center=" + center.toString() + "]";
    }

    public double getArea() {

        return (Math.PI * radius * radius);
    }

    public double getCircumference() {

        return (2 * Math.PI * radius);
    }

    public double distance(MyCircle another) {

        return this.center.distance(another.center);
    }

}
