import java.util.Scanner;
public  class Practical6
{
	public static void main (String[] args)
	{
		System.out.println("This Practical is made by 23CS075-Tejas Patel");
        System.out.print("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int reverse=0;
        while(num!=0)
        {
            reverse = reverse*10;
            reverse = reverse + num%10;
            num = num/10;
        }
        System.out.print("Reversed numbwer is:");
        System.out.print(reverse);
    }
}