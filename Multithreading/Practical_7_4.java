import java.util.Scanner;

class Increment extends Thread{
    private int num;

    Increment(int num)
    {
        this.num=num;
    }

    public void run() 
    {
        try{
            System.out.print("The incremented value of the number is :");
            Thread.sleep(1000); //DELAY FOR 1 SECOND
            System.out.println(++num); // INCREMENTED VALUE
        }catch(Exception e) 
        {
            e.printStackTrace(); //CATCHES EXCEPTION
        }
        return ;
    }
}

public class Practical_7_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        Increment e=new Increment(sc.nextInt());
        e.start();
        sc.close();
        System.out.println();
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        return ;
    }
}