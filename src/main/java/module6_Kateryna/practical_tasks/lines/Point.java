package module6_Kateryna.practical_tasks.lines;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("Point: " + this);
    }

    @Override
    public String toString() {
        return "(x = " + x +
                ", y = " + y +
                ')';
    }
}
