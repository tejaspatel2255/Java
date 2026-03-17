interface P1 {
    String constP1 = "This is first P1."; //constant for P1
    void displayP1(); //method for P1
}

interface P2 {
    String constP2 = "This is second P2."; //constant for P2
    void displayP2(); //method for P2
}

interface P12 extends P1, P2 {
    String constP12 = "This is third P12."; //constant for P12
    void displayP12(); //method for P12
}

class Q implements P12 {
    @Override
    public void displayP1() {
        System.out.println(constP1); //display P1 constant
    }

    @Override
    public void displayP2() {
        System.out.println(constP2); //display P2 constant
    }

    @Override
    public void displayP12() {
        System.out.println(constP12); //display P12 constant
    }
}

public class Practical4_6 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        Q q = new Q(); //create Q instance
        q.displayP1(); //call displayP1
        q.displayP2(); //call displayP2
        q.displayP12(); //call displayP12
    }
}
