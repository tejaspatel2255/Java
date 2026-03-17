import java.util.*;

public class Practical3_3 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        //create employee objects
        employee e1 = new employee();
        employee e2 = new employee();
        
        //set and get data for employees
        e1.setdata();
        e2.setdata();
        e1.getdata();
        e2.getdata();
    }
}

class employee {
    private String fname, lname;
    private double monthsalary, yearsalary, totalsalary, finalsalary;

    Scanner sc = new Scanner(System.in);

    //set employee data
    void setdata() {
        System.out.print("Enter first name of the employee: ");
        fname = sc.nextLine();
        System.out.print("Enter last name of the employee: ");
        lname = sc.nextLine();
        System.out.print("Enter salary of the employee: ");
        monthsalary = sc.nextDouble();

        if (monthsalary < 0) {
            monthsalary = 0; //ensure non-negative salary
        }

        yearsalary = monthsalary * 12;
        totalsalary = yearsalary * 10 / 100;
        finalsalary = totalsalary + yearsalary;
    }

    //get and display employee data
    void getdata() {
        System.out.print("Name of employee is: " + fname + " ");
        System.out.println(lname);
        System.out.println("Salary of employee is: " + monthsalary);
        System.out.println("Monthly salary of employee is: " + monthsalary);
        System.out.println("Yearly salary of employee is: " + yearsalary);
        System.out.println("Final salary of employee is: " + finalsalary);
        sc.close();
    }
}
