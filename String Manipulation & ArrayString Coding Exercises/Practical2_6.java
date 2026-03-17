import java.util.Arrays;
import java.util.Scanner;

public class Practical2_6
{
    // Get length of the string
    public static int findLength(String str) 
    {
        return str.length();
    }

    //convert the string to lowercase
    public static String toLowerCase(String str) 
    {
        return str.toLowerCase();
    }

    //convert the string to uppercase
    public static String toUpperCase(String str) 
    {
        return str.toUpperCase();
    }

    //reverse the string
    public static String reverseString(String str) 
    {
        return new StringBuilder(str).reverse().toString();
    }

    //sort the string alphabetically
    public static String sortString(String str) 
    {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object for reading input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("This practical is made by 23CS075-Tejas Patel");
        
        //String entered by the user
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        //operations to be performed on string
        int length = findLength(inputString);
        String lowerCase = toLowerCase(inputString);
        String upperCase = toUpperCase(inputString);
        String reversed = reverseString(inputString);
        String sorted = sortString(inputString);

        // Output
        System.out.println("Length of the string: " + length);
        System.out.println("Lowercase of the string: " + lowerCase);
        System.out.println("Uppercase of the string: " + upperCase);
        System.out.println("Reversed string: " + reversed);
        System.out.println("Sorted string: " + sorted);

        // Close the scanner
        scanner.close();
    }
}
