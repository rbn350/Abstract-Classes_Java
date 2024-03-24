public abstract class Shape {
    // Abstract method to calculate the area of a circle
    public abstract double calculateAreaOfCircle(double radius);

    // Abstract method to calculate the area of a triangle
    public abstract double calculateAreaOfTriangle(double base, double height);

    // Concrete method to calculate the area of a rectangle with implementation
    public double calculateAreaOfRectangle(double length, double width) {
        return length * width;
    }
}
