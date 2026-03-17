class TriangleArea {
    double b, h;
    public TriangleArea() {  //default constructor
        b = 4;
        h = 8;
        System.out.println((b * h) / 2); //calculate area
    }

    public TriangleArea(double height) {  //constructor with one parameter
        b = 5;
        h = height;
        System.out.println((b * h) / 2); //calculate area
    }

    public TriangleArea(double base, double height) {  //constructor with two parameters
        b = base;
        h = height;
        System.out.println((b * h * 0.5) / 2); //calculate area
    }
}

public class Practical3_2 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        //create TriangleArea objects
        TriangleArea TA = new TriangleArea();
        TriangleArea TA1 = new TriangleArea(5);
        TriangleArea TA2 = new TriangleArea(3, 4);
    }
}
