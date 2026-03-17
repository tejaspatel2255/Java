import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Practical6_3 {
    public static void main(String[] args) throws Exception {
        //create a File object representing the file to read
        File f = new File("xanadu.txt");
        
        //fileReader to read the file
        FileReader fr = new FileReader(f);
        
        //bufferedReader for efficient reading of lines from the file
        BufferedReader br = new BufferedReader(fr);
        
        //array to hold words in each line
        String words[] = null;
        
        //the word to search for in the file
        String str = "Tejas";
        String i;
        boolean occur = false; //flag to check if the word occurs

        //read the file line by line
        while ((i = br.readLine()) != null) {
            //split each line into words
            words = i.split("\\s+");
            
            //loop through the words array
            for (int j = 0; j < words.length; j++) {
                //check if the word matches the search word
                if (words[j].equals(str)) {
                    occur = true;
                    break;
                }
            }
        }

        //display whether the word is present or not
        if (occur) {
            System.out.println(str + " is present in the file");
        } 
        else {
            System.out.println(str + " is not present in the file");
        }
        System.out.println("This practical is made by 23CS075-Tejas Patel");
    }
}
