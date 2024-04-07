import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(3.0, 4.0);

        ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "blue");

        System.out.println("Properties of the Colored Circle:");
        System.out.println("Center of the circle: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Radius of the circle: " + coloredCircle.getRadius());
        System.out.println("Color of the circle: " + coloredCircle.getColor());
        System.out.println("Perimeter of the circle: " + coloredCircle.calculatePerimeter());
        System.out.println("Area of the circle: " + coloredCircle.getArea());
    }
}