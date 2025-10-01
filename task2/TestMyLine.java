package task2;

import java.util.Arrays;

public class TestMyLine {

    public static void main(String[] args) {

        // Create two lines using the different constructors
        MyLine l1 = new MyLine(1, 1, 2, 2);

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyLine l2 = new MyLine(p1, p2);

        // Test getters
        System.out.println("l1 begin = " + l1.getBegin());
        System.out.println("l1 end = " + l1.getEnd());
        System.out.println("l2 begin = " + l2.getBegin());
        System.out.println("l2 end = " + l2.getEnd());
        System.out.println("l1 begin X = " + l1.getBeginX());
        System.out.println("l1 begin Y = " + l1.getBeginY());
        System.out.println("l2 end X = " + l2.getEndX());
        System.out.println("l2 end Y = " + l2.getEndY());
        System.out.println("l1 begin XY = " + Arrays.toString(l1.getBeginXY()));
        System.out.println("l2 end XY = " + Arrays.toString(l2.getEndXY()));

        // Test setters
        l1.setBeginX(2);
        l1.setBeginY(1);
        l1.setEndX(4);
        l1.setEndY(2);
        l2.setBeginXY(1, 0);
        l2.setEndXY(2, 1);

        // Print new points using toString
        System.out.println("New Lines after using setters");
        System.out.println(l1);
        System.out.println(l2);
    }
}
