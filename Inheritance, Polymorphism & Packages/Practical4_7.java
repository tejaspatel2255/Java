import java.util.*;

interface Shapes {  //interface defining methods for shapes
    void input();  //method for input
    void output(); //method for output
}

//base class for common sign attributes
class Signs{
    public double area;
    public String text;
    public String colour;
    Scanner sc = new Scanner(System.in);

    //method to get common attributes
    void get(){
        System.out.println("Enter text:");
        text = sc.nextLine();
        System.out.println("Enter colour:");
        colour = sc.nextLine();
    }
}

class Circle extends Signs implements Shapes{  //circle class implementing Shapes interface

    private double radius;
    Scanner sc = new Scanner(System.in);

    public void input(){  //method to get radius and calculate area
        System.out.println("Enter radius:");
        radius = sc.nextDouble();
        area = 3.14 * radius * radius;
    }

    public void output(){  //method to display circle details
        System.out.println("Circle:");
        System.out.println("Text: " + text);
        System.out.println("Colour: " + colour);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Signs implements Shapes{  //rectangle class implementing Shapes interface
    private double length;
    private double breadth;
    Scanner sc = new Scanner(System.in);

    //method to get dimensions and calculate area
    public void input(){
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter breadth:");
        breadth = sc.nextInt();
        area = length * breadth;
    }

    public void output(){  //method to display rectangle details
        System.out.println("Rectangle:");
        System.out.println("Text: " + text);
        System.out.println("Colour: " + colour);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }
}

public class Practical4_7 {
    public static void main(String[] args) {
        System.out.println("This practical is made by 23CS075-Tejas Patel");
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        
        System.out.println("Enter your choice:"); //menu to choose shape
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        int choice = sc.nextInt();

        switch(choice){   //switch case to handle choice
            case 1:
                c.get();
                c.input();
                c.output();
                break;
            case 2:
                r.get();
                r.input();
                r.output();
                break;
        }
    }
}
