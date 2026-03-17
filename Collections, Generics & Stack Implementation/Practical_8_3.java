import java.util.*;  
public class Practical_8_3 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text :-");
        String text = sc.nextLine();

        // Split the input text into an array of words using space as a delimiter
        String str[] = text.split(" ");

        // Use a TreeMap to store words as keys and their frequencies as values
        Map<String, Integer> map = new TreeMap<>();

        // Iterate over the array of words
        for (int i = 0; i < str.length; i++) {
            // Update the frequency of each word in the map
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        }

        // Print the map, which contains each word and its frequency
        System.out.println(map);
        System.out.println();
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
        sc.close();
        return ;
    }
}