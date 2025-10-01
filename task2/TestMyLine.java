package task2;

public class TestMyLine {

    public static void main(String[] args) {

        // Create two lines using the different constructors
        MyLine l1 = new MyLine(2, 4, 4, 6);

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(0, 5);
        MyLine l2 = new MyLine(p1, p2);

    }
}
