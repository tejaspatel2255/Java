import java.util.Scanner;
public class Practical2_7 
{
    public static void main(String[] args) 
    {
        System.out.println("This practical is made by 23CS075-Tejas Patel");
        // Create a Scanner object for reading input from user
        Scanner sc = new Scanner(System.in);
        //String entered by the user
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        //Get length of the string
        int size = str.length();
        System.out.println("Length of the string is: "+size);
        //Replacing H and N
        String rep = str.replace('H', 'N');
        //Replacing string to uppercase
        System.out.println("Repalced string is: "+rep);
        String u = str.toUpperCase();
        System.out.println("Upper Case string is: "+u);
        String n="";
        for(int i=0;i<size;i++)
        {
            n=str.substring(0,8);
        }
        System.out.println("Extracted string is: "+n);
        // Close the scanner
        sc.close();
    }
}
