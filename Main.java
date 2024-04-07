import geometry.ColoredCircle;
import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 3);
        circles[1] = new ColoredCircle(new Point(1, 1), 4, "red");
        circles[2] = new ColoredCircle(new Point(2, 2), 5, "blue");

        for (Circle circle : circles) {
            System.out.println("Area: " + circle.getArea());

            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Color: " + coloredCircle.getColor());
            }
        }
    }
}