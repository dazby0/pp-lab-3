import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(3.0, 4.0);

        Circle circle = new Circle(center, 5.0);

        System.out.println("Circle Properties:");
        System.out.println("Center of the circle: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Radius of the circle: " + circle.getRadius());
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
    }
}