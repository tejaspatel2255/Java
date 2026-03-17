import java.util.Scanner;
public class Practical5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create a scanner object for reading input
        int x, y, z;
        System.out.print("Enter value of x: ");
        x = sc.nextInt(); //read user input for x

        System.out.print("Enter value of y: ");
        y = sc.nextInt(); //read user input for y
        try {
            z = x / y; //division of x by y
            System.out.println("Value of z: " + z);
        } 
        catch (Exception e) { //catch any exceptions (like division by zero)
            System.out.println("The Exception is: " + e); //print the exception details
            System.out.println(e.getMessage());
        }
        sc.close();
        System.out.println("This practical is made by 23CS075-Tejas Patel");
    }
}
