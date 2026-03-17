import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Practical6_2 {
    public static void main(String[] args) throws Exception {
        File f = new File("xanadu.txt"); //file object for "xanadu.txt"
        FileReader fr = new FileReader(f); //read file contents
        BufferedReader br = new BufferedReader(fr); //buffer for efficient reading
        
        int i = 0; //store each character
        int count = 0; //counter for occurrences of the character
        
        //loop through file content
        while ((i = br.read()) != -1) {
            if (i == args[0].charAt(0)) { //check for character match
                count++; //increment counter if matched
            }
        }
        
        //output the result
        System.out.println("The Given Letter " + args[0].charAt(0) + " occurs " + count + " times");
        
        fr.close();
        System.out.println("This practical is made by 23CS075-Tejas Patel");
    }
}
