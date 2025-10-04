package task4;

import task2.MyPoint;
import task3.MyRectangle;

public class TestCampusMap {

    public static void main(String[] args) {

        // Create campus map
        CampusMap campus = new CampusMap();

        // Create 7 buildings 
        MyRectangle scienceHall = new MyRectangle(380, 740, 620, 560);
        MyRectangle library = new MyRectangle(700, 900, 950, 700);
        MyRectangle lectureRoom1 = new MyRectangle(120, 360, 200, 300);
        MyRectangle lectureRoom2 = new MyRectangle(210, 360, 290, 300);
        MyRectangle lectureRoom3 = new MyRectangle(300, 360, 380, 300);
        MyRectangle lectureRoom4 = new MyRectangle(165, 290, 245, 230);
        MyRectangle lectureRoom5 = new MyRectangle(255, 290, 335, 230);

        // Create a fountain
        MyPoint p1 = new MyPoint(500, 500);
        MyCircle fountain = new MyCircle(p1, 50);

        // Create a rectangle called fountainCenter for creating walkway to fountain(as addWalkway only accepts rectangles)
        MyRectangle fountainCenter = new MyRectangle(500, 500, 500, 500);

    }
}
