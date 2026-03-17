import java.util.Scanner;
public class Practical2_4
{
    public static void main(String[] args) 
    {
        System.out.println("This practical is made by 23CS075-Tejas Patel");
        // Create a Scanner object for reading input from user
        Scanner sc = new Scanner(System.in);
        
        //String entered by the user
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int size = str.length();
        String ans="";

        // Call the doubleChar method with the user input
        ans = double_char(str,size);
        System.out.println(ans);
        // Close the scanner
        sc.close();
    }
    public static String double_char(String str, int size)
    {
        String result="";
        for(int i=0; i<size; i++)
        {
            result+=str.charAt(i);
            result+=str.charAt(i);
        }
        return result;
    }
}