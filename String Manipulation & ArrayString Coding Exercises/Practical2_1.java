import java.util.Scanner;

public class Practical2_1 {
  public static void main(String[] args) {
    System.out.println("This practical is made by 23CS075-Tejas Patel");

    // Create a Scanner object for reading input from user
    Scanner sc = new Scanner(System.in);

    // String entered by the user
    System.out.print("Enter the String: ");
    String str = sc.nextLine();
//for string taking from user use Line 
    // Number of repetation given by the user
    System.out.print("Enter the number to repeat the string: ");
    int x = sc.nextInt();

    // front part of the string
    for (int i = 0; i < x; i++) {
      if (str.length() < 3) {
        System.out.print(str);
      } else {
        System.out.print(str.substring(0, 3));
      }
    }
    // Close the scanner
    sc.close();
    System.out.println(" ");
  }
}