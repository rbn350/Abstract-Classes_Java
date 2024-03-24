# Abstract-Classes_Java
Demonstration of abstract classes in Java.

**Program Overview**:

- The Geometry Calculation Program is designed to demonstrate object-oriented principles through the calculation of areas for various geometric shapes: circles, triangles, and rectangles. It features an abstract class Shape that defines abstract methods for calculating the areas of a circle and a triangle, along with a concrete method for calculating the area of a rectangle. The Geometry class extends Shape and provides implementations for the abstract methods. The program showcases polymorphism, abstraction, and inheritance in Java.

**Features**:

- **_Abstract Shape Class_**: Serves as a blueprint for geometric shapes with methods to calculate areas.
- **_Geometry Class_**: Extends Shape and implements the abstract methods to calculate the areas of a circle and a triangle.

**Area Calculations**:

- **_Circle_**: Utilizes the formula πr².
- **_Triangle_**: Utilizes the formula ½ * base * height.
- **_Rectangle_**: Utilizes the formula length * width (implemented directly in Shape).

**How to Run**:

1. Ensure Java is installed on your system.
2. Save the Shape.java, Geometry.java, and Main.java files in the same directory.
3. Compile the program with javac Main.java.
4. Run the compiled program with java Main.
5. Observe the output, which will display the areas of a circle, triangle, and rectangle with predefined dimensions.

**Usage**:

- The program is initiated from Main.java, where instances of Geometry are used to calculate and print the areas of a circle, a triangle, and a rectangle.
- To calculate areas of different sizes, modify the parameters in the Main.java file before compiling and running the program.

**Implementation Details**:

**_Shape (Abstract Class)_**: Defines the structure for subclasses with two abstract methods (calculateAreaOfCircle and calculateAreaOfTriangle) and one concrete method (calculateAreaOfRectangle).
**_Geometry (Class)_**: Implements the abstract methods from Shape for calculating the areas of a circle and a triangle. Inherits the concrete method for calculating the area of a rectangle directly from Shape.

**Purpose**:

- This program serves as an educational tool to understand basic concepts of object-oriented programming (OOP) such as inheritance, abstraction, and polymorphism. It provides a practical application of these concepts through simple geometric calculations.

**Extending the Program**:

- To extend the program, one might consider adding more shapes, such as squares or parallelograms, by defining new abstract methods in Shape and implementing them in Geometry.
- Another extension could involve enhancing the Main class to accept user input for dimensions, allowing for dynamic calculation of areas.
