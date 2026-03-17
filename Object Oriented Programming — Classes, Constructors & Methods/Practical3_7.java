class Reference
{
    int data;
    Reference(int data)
    {
        this.data = data;
    }
}
class Returningobjects
{
    int x,y;
    Returningobjects(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
public class Practical3_7 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        int a=10;  //pass by value
        System.out.println("Before passing value of a: "+a);
        passbyvalue(a);
        System.out.println("After passing value of a: "+a);

        Reference R = new Reference(15);  //pass by reference
        System.out.println("Before passing by reference: "+R.data);
        passbyreference(R);
        System.out.println("After passing by reference: "+R.data);

        int result = returnvalues(20,25);   //returning values
        System.out.println("Result of returning values is: "+result);

        Returningobjects RO = new Returningobjects(50, 50);   //returning objects
        System.out.println("Returning Objects: "+RO.x+" "+RO.y);
    }

    public static void passbyvalue(int value)   //method to show pass by value case
    {
        value += 10;
        System.out.println("Inside the method: "+value);
    }

    public static void passbyreference(Reference r)   //method to show passing by reference
    {
        r.data = r.data + 10;
        System.out.println("Inside the method: "+r.data);
    }

    public static int returnvalues(int a, int b)   //method to show returning values
    {
        return (a+b);
    }

    public static Returningobjects createobject(int x, int y)   //method to show returning objects
    {
        return new Returningobjects(x, y);
    }
}
