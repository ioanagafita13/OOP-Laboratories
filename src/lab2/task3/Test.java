package lab2.task3;

import java.util.List;

public class Test {
    public static void main(String[] args){
        Point point = new Point(3, 5);
        point.printCoord();

        Polygon polygon = new Polygon(List.of(1.4f, 2f, 1f, 6f, 3f, 9f));
        polygon.printPolygon();
    }
}
