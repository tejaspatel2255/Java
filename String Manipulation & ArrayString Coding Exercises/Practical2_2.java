import java.util.Scanner;
public class Practical2_2 
{
    //System.out.println("This practical is made by 23CS075-Tejas Patel");
    public static int array_count9(int array[], int size)
    {
        int count=0;
        for(int i=0;i<size;i++)
        {
            if(array[i]==9)
            {
                count++;
            }
        }
        return count;
    }
    public static void  main(String[] args) 
    {
        // Create a Scanner object for reading input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
//int array[]=new int[n] then use n as var to go for iteration 
        //number of elements in the array given by user
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        // Output the result
        int ans=array_count9(array,n);
        System.out.println("The number of 9's in the array is " +ans);

        // Close the scanner
        sc.close();
    }
}

