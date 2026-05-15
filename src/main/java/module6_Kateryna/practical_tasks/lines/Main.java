package module6_Kateryna.practical_tasks.lines;

public class Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(1, 2),
                new Point(3, 4),
                new Point(5, 6)
        };

        Line[] lines = {
                new Line(new Point(2, 2), new Point(3, 4)),
                new ColorLine(new Point(3, 7), new Point(5, 6), "green"),
                new Line(new Point(1, 1), new Point(2, 3)),
                new ColorLine(new Point(3, 2), new Point(4, 4), "blue")
        };

        for (Point point : points) {
            point.print();
        }

        for (Line line : lines) {
            line.print();
        }
    }
}
