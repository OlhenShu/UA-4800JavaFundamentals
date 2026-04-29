package com.softserve.academy.module6.pracTask.lines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Line> lines = new ArrayList<>();
        lines.add(new Line(new Point(0, 0), new Point(1, 3)));
        lines.add(new ColorLine(new Point(2, 2), new Point(4, 5), "red"));
        lines.add(new ColorLine(new Point(1, 1), new Point(3, 4), "blue"));
        lines.add(new Line(new Point(5, 5), new Point(6, 7)));

        Arrays.stream(lines.toArray()).forEach(line -> {
            ((Line) line).print();
            System.out.println();
        });

    }

}
