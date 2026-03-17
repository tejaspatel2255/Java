import java.util.Scanner;

public class Practical2_3 
{
    public static boolean array_count(int arr[])
    {
        // Check the first 4 elements or the entire array if it has less than 4 elements
        for(int i=0;i<4;i++)
        {
            if(arr[i]==9)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        System.out.println("This practical is made by 23CS075-Tejas Patel");
        // Create a Scanner object for reading input from user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size for array: ");
        int size=sc.nextInt();
        
        // Initialize the array
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element"+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        // Call the arrayFront9 method with the user inputs
        boolean ans=array_count(arr);

        // Output the result
        System.out.println("One of the First Four Element in the array is 9 is "+ans);
        // Close the scanner
        sc.close();
    }
}

