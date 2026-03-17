public class Practical5_3 {
    public static void main(String[] args) {
        Practical5_3 obj = new Practical5_3(); //create an object of Practical5_3
        try {
            obj.create_exception();
        } 
        catch (ArithmeticException ae) { 
            System.out.println("An Error Occurred");
        }

        int age = 10;
        obj.check_age(age); //check if age is eligible for voting
        System.out.println("This practical is made by 23CS075-Tejas Patel");
    }

    //method that throws an ArithmeticException (division by zero)
    int create_exception() throws ArithmeticException {
        int x = 10 / 0; //division by zero to trigger exception
        return x;
    }

    //method to check voting eligibility based on age
    public void check_age(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible for Voting"); //throw exception if age < 18
        } 
        else {
            System.out.println("Eligible for Voting"); //print if age is 18 or above
        }
    }
}
