package module6_Kateryna.practical_tasks.lines;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("ColorLine: " + this);
    }

    @Override
    public String toString() {
        return super.toString() + ", color = '" + color + '\'';
    }
}
