class Parent {
    //parent class method
    void showparent() {
        System.out.println("This is Parent Class");
    }
}

class Child extends Parent {
    //child class method
    void showchild() {
        System.out.println("This is Child Class");
    }
}

public class Practical4_1 {
    public static void main(String[] args) {
        Parent P = new Parent(); //parent class object
        P.showparent(); //call parent method
        
        Child C = new Child(); //child class object
        C.showchild(); //call child method
        
        Child C1 = new Child(); //another Child class object
        C1.showparent(); //call parent method using child object
        
        System.out.println("This practical is made by 23CS075-Tejas Patel");
    }
}
