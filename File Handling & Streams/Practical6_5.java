import java.io.*;

public class Practical6_5 {
    public static void main(String[] args) {
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        //write console input to a file
        try (
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("output.txt"));
        ) {
            System.out.println("Enter text to write to the file (type 'exit' to finish):");

            String line;
            //read input until 'exit' is entered
            while (!(line = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(line);
                fileWriter.newLine();    //add a new line
            }

            System.out.println("Text has been written to output.txt");

        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        //copy data from "output.txt" to "output_copy.txt"
        try ( 
            FileInputStream fileInputStream = new FileInputStream("output.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("output_copy.txt");
        ) {
            byte[] buffer = new byte[1024];  //buffer for reading
            int bytesRead;
            
            //read and write data in chunks
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);  //write to output file
            }

            System.out.println("Binary data has been copied to output_copy.txt");

        } 
        catch (IOException e) {
            e.printStackTrace();  //handle I/O exceptions
        }
    }
}
