public class Geometry extends Shape {
    // Implement the abstract method for the circle's area
    @Override
    public double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Implement the abstract method for the triangle's area
    @Override
    public double calculateAreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
}
