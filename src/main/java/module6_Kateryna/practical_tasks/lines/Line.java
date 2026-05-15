package module6_Kateryna.practical_tasks.lines;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public void print() {
        System.out.println("Line: " + this);
    }

    @Override
    public String toString() {
        return "startPoint = " + startPoint +
                ", endPoint = " + endPoint;
    }
}
