import java.util.Scanner;
public class Practical3_4 {
    
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        Date d = new Date();  //creation of objects
        d.set();   //calling set method to set the data
        d.displayDate();  //calling for displaydate method
    }
}

class Date
{
    //declaring varaibles
    int day, month, year;
    Scanner sc = new Scanner(System.in);
    //set data method
    void set()
    {
        System.out.print("Enter Day, Month & Year: ");
        day = sc.nextInt();  //scanning of values from users
        month = sc.nextInt();
        year = sc.nextInt();
    }
    //display data method
    void displayDate()
    {
        System.out.println("Date: "+day+"/"+month+"/"+year);
    }
}