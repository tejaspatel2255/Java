import java.util.*;
class A {
    static int x = 50; //static variable
}

class B extends A {
    int x; //instance variable

    //set instance variable
    public void setInstanceVariable(int val) {
        x = val;
    }
    
    //display both variables
    public void display() {
        System.out.println("Value of static variable x in class A: " + A.x);
        System.out.println("Value of instance variable x in class B: " + x);
    }
}

public class Practical4_4 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        Scanner sc = new Scanner(System.in);//scanner is called
        B b = new B();
        System.out.print("Enter value of instance variable x: ");
        int input = sc.nextInt();
        b.setInstanceVariable(input);//enter value of x in class B
        b.display();
        sc.close();//scanner closed
    }
}
