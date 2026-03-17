import java.util.*;
public class Practical3_1 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        Scanner sc = new Scanner(System.in); //prompt user for input
        System.out.print("Enter the number in pound to get in rs.: "); //read user input
        double pound = sc.nextDouble(); //convert pounds to rupees
        double rs = pound * 100.0; //display the result
        System.out.println("Rs. " + rs);
        sc.close();
    }
}