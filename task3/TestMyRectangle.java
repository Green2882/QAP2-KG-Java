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
        r1.setTopLeftXY(1, 3);
        r1.setBottomRightXY(6, 1);

        r2.setTopLeftX(2);
        r2.setTopLeftY(2);
        r2.setBottomRightX(5);
        r2.setBottomRightY(0);

        // Display updated rectangles
        System.out.println();
        System.out.println("Updated rectangles:");
        System.out.println(r1);
        System.out.println(r2);

        // Display width, height, area, and perimeter of each rectangle
        System.out.println();
        System.out.println("r1 width = " + r1.getWidth());
        System.out.println("r1 height = " + r1.getHeight());
        System.out.println("r1 area = " + r1.getArea());
        System.out.println("r1 perimeter = " + r1.getPerimeter());
        System.out.println();
        System.out.println("r2 width = " + r2.getWidth());
        System.out.println("r2 height = " + r2.getHeight());
        System.out.println("r2 area = " + r2.getArea());
        System.out.println("r2 perimeter = " + r2.getPerimeter());
    }

}
