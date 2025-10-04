package task3;

import task2.MyPoint;

public class TestMyRectangle {

    public static void main(String[] args) {

        // Set up two rectangles with the two constrcutors
        MyPoint p1 = new MyPoint(2, 5); // topLeft
        MyPoint p2 = new MyPoint(7, 2); // bottomRight
        MyRectangle r1 = new MyRectangle(p1, p2);
        MyRectangle r2 = new MyRectangle(3, 6, 8, 3);

        // Display original rectangles
        System.out.println();
        System.out.println("Original Rectangles:");
        System.out.println(r1);
        System.out.println(r2);

        // Update rectangle points using different methods
    }
}
