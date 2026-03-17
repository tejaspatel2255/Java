import java.util.Scanner;
public  class Practical5
{
	public static void main (String[] args)
	{
		System.out.println("This Practical is made by 23CS075-Tejas Patel");
        Scanner sc=new Scanner(System.in);
		int code []={1,2,3,4,5};
        float tax[]={8,12,5,7.5f,3};
        int price[] ={1000,2000,3000,4000,5000};
        int rs=0;
        String product[]={"motor","fan","tube","wires","other"};
        for(int i=0; i<=4; i++)
        {
            System.out.println(code[i]+ " for " +product[i]);
        }
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        //where u want that user want to enter the use sc = next_datatype();
        switch(choice)
        {
            case 1:
                {
                    rs = (int)(price[choice-1]+price[choice-1]*tax[choice-1]/100);
                    System.out.println("The price of motor is:");
                    System.out.println(rs);
                    break;
                }
            case 2:
                {
                    rs = (int)(price[choice-1]+price[choice-1]*tax[choice-1]/100);
                    System.out.println("The price of fan is:");
                    System.out.println(rs);
                    break;
                }
            case 3:
                {
                    rs = (int)(price[choice-1]+price[choice-1]*tax[choice-1]/100);
                    System.out.println("The price of tube light is:");
                    System.out.println(rs);
                    break;
                }
            case 4:
                {
                    rs = (int)(price[choice-1]+price[choice-1]*tax[choice-1]/100);
                    System.out.println("The price of wires is:");
                    System.out.println(rs);
                    break;
                }
            case 5:
                {
                    rs = (int)(price[choice-1]+price[choice-1]*tax[choice-1]/100);
                    System.out.println("The price of other items is:");
                    System.out.println(rs);
                    break;
                }
        }
	}
}