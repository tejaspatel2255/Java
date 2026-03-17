import java.util.Scanner; // for user input

public class Practical4_2 {
    public static void main(String[] args) {
        Employee E = new Employee(); // employee object
        E.getdata(); // basic member data
        E.getemployeedata(); // employee-specific data
        E.printdata(); // print basic member data
        E.printemployeedata(); // print employee-specific data
        E.printSalary(); // print salary

        Manager M = new Manager(); // manager object
        M.getdata(); // basic member data
        M.getmanagerdata(); // manager-specific data
        M.printdata(); // print basic member data
        M.printmanagerdata(); // print manager-specific data
        M.printSalary(); // print salary
        System.out.println("This practical is made by 23CS075-Tejas Patel");
    }
}

class Member {
    Scanner sc = new Scanner(System.in); // for input
    String name;
    int age;
    long phonenumber;
    String address;
    float salary;

    void printSalary() {
        System.out.println("Salary: " + salary); // print salary
    }

    void getdata() {
        System.out.print("Enter name: ");
        name = sc.nextLine(); // get name
        System.out.print("Enter address: ");
        address = sc.nextLine(); // get address
        System.out.print("Enter age: ");
        age = sc.nextInt(); // get age
        System.out.print("Enter phone number: ");
        phonenumber = sc.nextLong(); // get phone number
        System.out.print("Enter salary: ");
        salary = sc.nextFloat(); // get salary
    }

    void printdata() {
        System.out.println("Name: " + name); // print name
        System.out.println("Address: " + address); // print address
        System.out.println("Age: " + age); // print age
        System.out.println("Phone number: " + phonenumber); // print phone number
    }
}

class Employee extends Member {
    String specialization; // specialization

    void getemployeedata() {
        System.out.print("Enter specialization: ");
        sc.nextLine(); // consume newline
        specialization = sc.nextLine(); // get specialization
    }

    void printemployeedata() {
        System.out.println("Specialization: " + specialization); // print specialization
    }
}

class Manager extends Member {
    String department; // department

    void getmanagerdata() {
        System.out.print("Enter department: ");
        sc.nextLine(); // consume newline
        department = sc.nextLine(); // get department
    }

    void printmanagerdata() {
        System.out.println("Department: " + department); // print department
    }
}
