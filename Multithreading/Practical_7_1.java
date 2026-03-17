class A extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}

class B implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}

public class Practical_7_1 {
    public static void main(String[] args) {
        A a = new A();                //creating a thread using the class that extends Thread
        Thread b = new Thread(new B()); //creating a thread using the class that implements Runnable
        a.start();                    
        b.start();   
        System.out.println();
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
    }
}