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
}
