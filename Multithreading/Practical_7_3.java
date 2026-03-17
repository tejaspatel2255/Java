import java.util.Random;

class RandomNumberGenerator implements Runnable {
    private int num;

    RandomNumberGenerator() {
        Random ra = new Random();
        num = ra.nextInt(1000);
    }

    @Override
    public void run() {
        System.out.println("Generated Number: " + num);
        if (num % 2 == 0) {
            Square sq = new Square(num);
            sq.start(); // Start a new thread for Square
        } else {
            Cube cu = new Cube(num);
            cu.start(); // Start a new thread for Cube
        }
    }
}

class Square extends Thread {
    private int num;

    Square(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Square of the number " + num + " : " + (num * num));
    }
}

class Cube extends Thread {
    private int num;

    Cube(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Cube of the number " + num + " : " + (num * num * num));
    }
}

public class Practical_7_3 {
    public static void main(String[] args) {
        Thread th = new Thread(new RandomNumberGenerator());
        th.start(); // Start the RandomNumberGenerator thread
        System.out.println();
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
    }
}