package task4;

import java.util.ArrayList;
import task2.MyLine;
import task3.MyRectangle;

public class CampusMap {

    // Instance variables
    private ArrayList<MyRectangle> buildings;
    private ArrayList<MyLine> walkways;
    private ArrayList<MyCircle> fountains;

    // No arg constructor to store list of walkways, buildings, and fountains
    public CampusMap() {

        buildings = new ArrayList<>();
        walkways = new ArrayList<>();
        fountains = new ArrayList<>();
    }

    // Methods to add buildings, walkways, and fountains to matching lists
    public MyRectangle addBuilding(MyRectangle building) {

        buildings.add(building);
        return building;
    }

    public MyLine addWalkway(MyRectangle from, MyRectangle to) {

        if (!buildings.contains(from) || !buildings.contains(to)) {
            System.out.println("Error: One or both buildings are not in the campus map.");
            return null;
        }

        // Calculate center of from
        int fromCenterX = (from.getTopLeftX() + from.getBottomRightX()) / 2;
        int fromCenterY = (from.getTopLeftY() + from.getBottomRightY()) / 2;

        // Calculate center of to
        int toCenterX = (to.getTopLeftX() + to.getBottomRightX()) / 2;
        int toCenterY = (to.getTopLeftY() + to.getBottomRightY()) / 2;

        // Create walkway
        MyLine walkway = new MyLine(fromCenterX, fromCenterY, toCenterX, toCenterY);

        walkways.add(walkway);
        return walkway;
    }

    public MyCircle addFountain(MyCircle fountain) {

        fountains.add(fountain);
        return fountain;
    }

    // Method to calculate the length of all walkways on campus
    public double calculateTotalWalkwayLength() {

        double totalLength = 0;
        for (int i = 0; i < walkways.size(); i++) {

            MyLine line = walkways.get(i);
            double length = line.getLength();

            totalLength += length;
        }
        return totalLength;
    }

    // Method to calculate the total area of all fountains on campus
    public double calculateTotalFountainArea() {

        double totalArea = 0;
        for (int i = 0; i < fountains.size(); i++) {

            MyCircle circle = fountains.get(i);
            double area = circle.getArea();

            totalArea += area;
        }

        return totalArea;
    }

    // Method to check if a walkway exists between two buildings
    public boolean isWalkwayFromTo(MyRectangle from, MyRectangle to) {

        int fromCenterX = (from.getTopLeftX() + from.getBottomRightX()) / 2;
        int fromCenterY = (from.getTopLeftY() + from.getBottomRightY()) / 2;

        int toCenterX = (to.getTopLeftX() + to.getBottomRightX()) / 2;
        int toCenterY = (to.getTopLeftY() + to.getBottomRightY()) / 2;

        for (int i = 0; i < walkways.size(); i++) {
            MyLine line = walkways.get(i);

            // Get begin/end coordinates of each walkway
            int lineBeginX = line.getBegin().getX();
            int lineBeginY = line.getBegin().getY();
            int lineEndX = line.getEnd().getX();
            int lineEndY = line.getEnd().getY();

            // Check if walkway connetcs to buildings and return true if they do
            if (lineBeginX == fromCenterX && lineBeginY == fromCenterY
                    && lineEndX == toCenterX && lineEndY == toCenterY) {
                return true;
            }
        }
        return false;
    }
}
