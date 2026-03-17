import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Practical6_4 {
    public static void main(String[] args) throws Exception{
        //source and destination file names
        String sourceFileName = "sourceFile.txt";
        String destinationFileName = "destinationFile.txt";
        
        //fileInputStream to read the source file
        FileInputStream fin = new FileInputStream(sourceFileName);
        
        //fileOutputStream to write to the destination file
        FileOutputStream fout = new FileOutputStream(destinationFileName);

        int data;
        //loop to read from source and write to destination
        while ((data = fin.read()) != -1) {
            fout.write(data);
        }
        //close the input and output streams
        fin.close();
        fout.close();
        //output message on successful copy
        System.out.println("File copied successfully.");
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
    }
}
