import java.util.Scanner;

//custom exception class
class MyException extends Exception {
    private int param;

    //constructor to initialize custom exception with a parameter
    public MyException(int param) {
        this.param = param;
    }

    //override toString method to display the exception in a custom format
    @Override
    public String toString() {
        return "MyException[" + param + "]";
    }
}

public class Practical5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int x, y, z, a;
        int arr[] = new int[5];
        String str;

        try {
            //try block for division and input
            try {
                System.out.print("Enter value of x: ");
                x = sc.nextInt(); //read input for x
                System.out.print("Enter value of y: ");
                y = sc.nextInt(); //read input for y
                a = x / y; //perform division
            }
            catch (ArithmeticException ae) { //handle division by zero
                System.out.println("Invalid Division");
                System.out.println(ae.getMessage());
            }

            //try block for number format exception
            try {
                str = "123abc"; //initialize string with alphanumeric value
                int num = Integer.parseInt(str); //attempt to parse string to integer
            } 
            catch (NumberFormatException e) { //handle format mismatch exception
                System.out.println("Format mismatch");
            }

            //try block for input mismatch exception
            try {
                System.out.print("Enter one Integer: ");
                z = sc.nextInt(); //read integer input
            } 
            catch (Exception e) { //handle invalid input
                System.out.println("Invalid Input: " + e);
            }

            //try block for array index out of bounds
            try {
                System.out.println("The 5th Element of the array: " + arr[5]); //access invalid index
            } 
            catch (Exception e) { //handle array index exception
                System.out.println("Index is Invalid " + e);
            }

            //throw custom exception
            try {
                throw new MyException(5); //manually throw custom exception
            } 
            catch (MyException e) { //catch custom exception
                System.out.println(e.toString());
            }
        } 
        catch (Exception e) { //general catch block
            System.out.println("Exceptions Encountered");
        }
        finally {
            //finally block to indicate exception handling completion
            System.out.println("Exception Handling Completed");
        }
        sc.close();
        System.out.println("This practical is made by 23CS075-Tejas Patel");
    }
}
