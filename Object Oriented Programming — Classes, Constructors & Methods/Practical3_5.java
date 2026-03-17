import java.util.*;
public class Practical3_5{
    public static void main(String[] args){
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        area a1 = new area();
        a1.setdata();
        a1.getdata();
    }
}

class area{
    private double length,breadth,area;

    Scanner sc = new Scanner(System.in);

    void setdata(){
        System.out.print("Enter length of rectangle:");
        length=sc.nextDouble();
        System.out.print("Enter breadth of rectangle:");
        breadth=sc.nextDouble();
        area=length*breadth;
    }

    void getdata(){
        System.out.print("Area of rectangle:"+area);
    }
}
