import java.util.Scanner;

// rectangle class
class Rectangle {
    protected double length;
    protected double breadth;

    // constructor for rectangle
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate and print the area
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area: " + area);
    }

    // method to calculate and print the perimeter
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

// square class inheriting from rectangle
class Square extends Rectangle {
    // constructor for square
    public Square(double side) {
        super(side, side);  // calling the rectangle constructor with side for both length and breadth
    }
}

public class Practical4_3 {
    public static void main(String[] args) {
        System.out.println("This practical is made by 23CS075-Tejas Patel");
        Scanner sc = new Scanner(System.in);
        // user input for rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        // create a rectangle object
        Rectangle rectangle = new Rectangle(length, breadth);

        // user input for square
        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        // create a square object
        Square square = new Square(side);

        // creating an array of objects
        Rectangle[] shapes = { rectangle, square };

        // loop through the array and print area and perimeter for each shape
        for (Rectangle shape : shapes) {
            System.out.println("\nShape: " + (shape instanceof Square ? "Square" : "Rectangle"));
            shape.printArea();
            shape.printPerimeter();
        }
        sc.close();
    }
}
