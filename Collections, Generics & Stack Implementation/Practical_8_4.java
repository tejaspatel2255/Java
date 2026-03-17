import java.io.*;
import java.util.*; // for checking Java keywords
import javax.lang.model.SourceVersion;                 

public class Practical_8_4 {
    private static final String path = "C:\\Users\\MEGH\\Documents\\Charusat\\SEM 3\\JAVA Practical\\Lab Programmes\\Part 8\\Practical_8_4.java";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        // HashSet to store unique keywords found in the file
        Set<String> keywords = new HashSet<>();
        String line;
        int count = 0; // Counter to keep track of total keywords

        // Read file line-by-line until end of file
        while ((line = br.readLine()) != null) {
            // Split each line into words based on whitespace
            String words[] = line.split("\\s+");
            for (String word : words) {
                // Check if the word is a Java keyword
                if (SourceVersion.isKeyword(word)) {
                    count++;  // Increment total keyword count
                    keywords.add(word);  // Add keyword to the set (duplicates ignored)
                }
            }
        }

        // Print the set of distinct keywords found in the file
        System.out.println("Total number of keywords: " + count);
        System.out.println("Total number of distinct Keywords: " + keywords.size());

        // Prompt user to search for a specific keyword
        System.out.print("Enter the keyword you want to search: ");
        String search = sc.next();

        // Check if the entered keyword is present in the set
        System.out.println("The keyword " + search + " is " + (keywords.contains(search) ? "present" : "not present") + " in the file");

        // Close BufferedReader and Scanner
        br.close();
        sc.close();

        System.out.println();
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
    }
}