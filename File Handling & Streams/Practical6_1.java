import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practical6_1 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        //create files if they do not exist
        createFiles();
        //write specific content to each file
        writeContentToFile("file1.txt", "This is file 1.\nThis is second line.");
        writeContentToFile("file2.txt", "This is file 2.");
        writeContentToFile("file3.txt", "This is file 3.\nThis is second line\nThis is third line.");
        //read and display the content of the files
        readFiles();
    }

    //method to create the files if they do not already exist
    private static void createFiles() {
        try {
            //create File objects for each file
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");
            File file3 = new File("file3.txt");

            //check if each file exists, if not, create it
            if (!file1.exists()) {
                file1.createNewFile();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            if (!file3.exists()) {
                file3.createNewFile();
            }
        } 
        catch (IOException e) {
            //handle any exceptions that occur during file creation
            System.out.println("Error creating files: " + e.getMessage());
        }
    }

    //method to write content to a file
    private static void writeContentToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            //write the provided content to the file
            writer.write(content);
        } 
        catch (IOException e) {
            //handle any exceptions that occur during file writing
            System.out.println("Error writing to file " + fileName + ": " + e.getMessage());
        }
    }

    //method to read and display the content of the files
    private static void readFiles() {
        try {
            //create File objects for each file
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");
            File file3 = new File("file3.txt");

            //use Scanner objects to read the contents of each file
            Scanner scanner1 = new Scanner(file1);
            Scanner scanner2 = new Scanner(file2);
            Scanner scanner3 = new Scanner(file3);

            //variables to keep track of the number of lines in each file
            int linesInFile1 = 0;
            int linesInFile2 = 0;
            int linesInFile3 = 0;

            //read and display the content of file1
            System.out.println("File 1 content:");
            while (scanner1.hasNextLine()) {
                System.out.println(scanner1.nextLine());
                linesInFile1++; //count the number of lines
            }
            System.out.println("Number of lines in file 1: " + linesInFile1);

            //read and display the content of file2
            System.out.println("\nFile 2 content:");
            while (scanner2.hasNextLine()) {
                System.out.println(scanner2.nextLine());
                linesInFile2++; //count the number of lines
            }
            System.out.println("Number of lines in file 2: " + linesInFile2);

            //read and display the content of file3
            System.out.println("\nFile 3 content:");
            while (scanner3.hasNextLine()) {
                System.out.println(scanner3.nextLine());
                linesInFile3++; //count the number of lines
            }
            System.out.println("Number of lines in file 3: " + linesInFile3);
        } 
        catch (IOException e) {
            //handle any exceptions that occur during file reading
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
