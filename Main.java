public class Main {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();

        // Calculate and display the area of a circle with radius 7
        System.out.println("\nArea of Circle: \n" + geometry.calculateAreaOfCircle(7));

        // Calculate and display the area of a triangle with base 5 and height 10
        System.out.println("\nArea of Triangle: \n" + geometry.calculateAreaOfTriangle(5, 10));

        // Calculate and display the area of a rectangle with length 4 and width 8
        System.out.println("\nArea of Rectangle: \n" + geometry.calculateAreaOfRectangle(4, 8));
    }
}
