public class Practical4
{
    public static void main(String[] args)
    {
		System.out.println("This Practical is made by 23CS075-Tejas Patel");
        int arr[][]= {{1},{1,2},{1,2,3}};
        int count=0;
        for(int i=0;i<3;i++)
        {
            System.out.print("The length of the element " + (i+1) +  " is: ");
            count++;
            System.out.println(count);
        }
    }
}