import java.util.Scanner;
public class Practical2_5 
{
    public static void main(String[] args) 
    {
        System.out.println("This practical is made by 23CS075-Tejas Patel");
        // Create a Scanner object for reading input from user
        Scanner sc = new Scanner(System.in);

        //String entered by the user
        System.out.print("Enter the String to get it reversed: ");
        String str = sc.nextLine();

        // Split the paragraph into words
        String arr[] = str.split(" ");
        
        for(int i=0;i<arr.length;i++)
        {
            String result ="";
            //reverseWordsInParagraph method with the user input
            for(int j=arr[i].length()-1;j>=0;j--)
            {
                result = result + arr[i].charAt(j);
            }
            System.out.print(result+" ");
        }
        // Output the result
        System.out.println();
        // Close the scanner
        sc.close();
    }
}
