package task2;

public class MyLine {

    // Instance variables
    private MyPoint begin;
    private MyPoint end;

    // Constuctors
    public MyLine(int x1, int y1, int x2, int y2) {

        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {

        this.begin = begin;
        this.end = end;
    }

    // Getter and setter for begin
    public MyPoint getBegin() {

        return this.begin;
    }

    public void setBegin(MyPoint begin) {

        this.begin = begin;
    }

    // Getters and setter for end
    public MyPoint getEnd() {

        return this.end;
    }

    public void setEnd(MyPoint end) {

        this.end = end;
    }

    // Getters and setters for begin x/y
    public int getBeginX() {

        return begin.getX();
    }

    public void setBeginX(int x) {

        begin.setX(x);
    }

    public int getBeginY() {

        return begin.getY();
    }

    public void setBeginY(int y) {

        begin.setY(y);
    }

    // Getters and setters for end x/y
    public int getEndX() {

        return end.getX();
    }

    public void setEndX(int x) {

        end.setX(x);
    }

    public int getEndY() {

        return end.getY();
    }

    public void setEndY(int y) {

        end.setY(y);
    }

    // Getters and setters for begin/end XY
    public int[] getBeginXY() {

        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {

        begin.setXY(x, y);
    }

    public int[] getEndXY() {

        return end.getXY();
    }

    public void setEndXY(int x, int y) {

        end.setXY(x, y);
    }

    // getLength method
    public double getLength() {

        return begin.distance(end);
    }

    // getGradient method
    public double getGradient() {

        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

}
