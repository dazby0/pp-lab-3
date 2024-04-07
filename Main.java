import geometry.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(6.0);

        System.out.println("Properties of the Square:");
        System.out.println("Length: " + square.getLength());
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }
}