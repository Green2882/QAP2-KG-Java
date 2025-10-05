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

        // Add buildings and fountains to CampusMap
        campus.addBuilding(scienceHall);
        campus.addBuilding(library);
        campus.addBuilding(lectureRoom1);
        campus.addBuilding(lectureRoom2);
        campus.addBuilding(lectureRoom3);
        campus.addBuilding(lectureRoom4);
        campus.addBuilding(lectureRoom5);
        campus.addFountain(fountain);
        campus.addBuilding(fountainCenter);

        // Create walkways
        campus.addWalkway(scienceHall, fountainCenter);
        campus.addWalkway(library, fountainCenter);
        campus.addWalkway(lectureRoom1, fountainCenter);
        campus.addWalkway(lectureRoom2, fountainCenter);
        campus.addWalkway(lectureRoom3, fountainCenter);
        campus.addWalkway(lectureRoom4, fountainCenter);
        campus.addWalkway(lectureRoom5, fountainCenter);
        campus.addWalkway(library, scienceHall);
        campus.addWalkway(lectureRoom1, lectureRoom2);
        campus.addWalkway(lectureRoom2, lectureRoom3);
        campus.addWalkway(lectureRoom2, lectureRoom4);
        campus.addWalkway(lectureRoom4, lectureRoom5);

        // Display total fountain area and total walkway length
        System.out.println(String.format("Total area of campus fountain: %7.2f", campus.calculateTotalFountainArea()));
        System.out.println(String.format("Total length of campus walkways: %7.2f", campus.calculateTotalWalkwayLength()));

        campus.addWalkway(library, lunchHall);

    }
}
