import java.util.Scanner;
public class Practical3_6 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        Complex c1 = new Complex();  //Creating Objects
        Complex c2 = new Complex();

        c1.set(); // Calling for set method to set the data
        c2.set();
        Complex c3 = new Complex(); //Creating new objects
        Complex c4 = new Complex();
        c4 = c3.sum(c1, c2);  //Here object c3 is used to call the method & c1,c2 is passed as argument and c4 is used to store the values returned by the method
        c4.putdata(); //Displaying data
        c4 = c3.subtraction(c1, c2);
        c4.putdata();
        c4 = c3.product(c1, c2);
        c4.putdata();
    }
}

class Complex
{
    //Declaring variables
    float r,i;
    Scanner sc = new Scanner(System.in);
    //set method to set the data
    void set()
    {
        System.out.print("Enter Real Part & Imaaginary Part: ");
        r = sc.nextFloat();
        i = sc.nextFloat();
    }
    //creating method for sum which takes inputs as objects and returns objects as answer
    Complex sum(Complex C1, Complex C2)
    {
        Complex temp=new Complex();  
        temp.r = C1.r + C2.r;
        temp.i = C1.i + C2.i;
        return temp;      
    }
    //creating method for subtraction which takes inputs as objects and returns objects as answer
    Complex subtraction(Complex C1, Complex C2)
    {
        Complex temp=new Complex();
        temp.r = C1.r - C2.r;
        temp.i = C1.i - C2.i;
        return temp;
    }
    //creating method for product which takes inputs as objects and returns objects as answer
    Complex product(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.r = (C1.r*C2.r) - (C1.i*C2.i);
        temp.i = (C1.r*C2.i) + (C1.i*C2.r);
        return temp;
    }
    //display data method
    void putdata()
    {
        if(i<0)
        System.out.println(r+" - "+i+"i");
        else
        System.out.println(r+" + "+i+"i");
    }
}
