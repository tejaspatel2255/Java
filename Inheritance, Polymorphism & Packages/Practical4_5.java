class Degree {
    //display general degree message
    void getDegree() {
        System.out.println("I got a Degree");
    }
}

class Undergraduate extends Degree {
    //display undergraduate message
    void Degree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    //display postgraduate message
    void Degree() {
        System.out.println("I am a Postgraduatee");
    }
}

public class Practical4_5 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        //degree object
        Degree D = new Degree();
        D.getDegree(); //general degree message

        //undergraduate object
        Undergraduate U = new Undergraduate();
        U.getDegree(); //general degree message
        U.Degree();    //undergraduate message
        
        //postgraduate object
        Postgraduate P = new Postgraduate();
        P.getDegree(); //general degree message
        P.Degree();    //postgraduate message
    }
}
