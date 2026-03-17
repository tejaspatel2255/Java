import java.util.*;  

class MyStack {
    private ArrayList<Object> list = new ArrayList<>();  
    private int top;  
    
    public MyStack() {
        top = -1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to get the size of the stack
    public int getsize() {
        return list.size();
    }

    // Method to return the top element without removing it
    public Object peek() {
        return isEmpty() ? null : list.get(top);
    }

    // Method to remove and return the top element of the stack
    public Object pop() {
        if (isEmpty())
            return null;
        else {
            Object temp = list.remove(top);  // Remove the top element
            top--;  // Decrease the top index
            return temp;
        }
    }

    // Method to add an element to the top of the stack
    public void push(Object obj) {
        list.add(obj);  // Add element to the ArrayList
        top++;  // Increase the top index
        return;
    }

    // Method to print all elements of the stack from top to bottom
    public void Print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(list.get(i));  // Print each element
        }
        return;
    }
}

public class Practical_8_1 {
    static Scanner sc = new Scanner(System.in);  

    public static void main(String[] args) {
        try{
            Menu();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("This Practical is made by 23CS075-Tejas Patel");
    }

    public static void Menu() throws Exception
    {
        MyStack stack = new MyStack();  // Create a new MyStack object
        while (true) {
            // Display menu options
            System.out.println("[0]Exit");
            System.out.println("[1]Push");
            System.out.println("[2]Pop");
            System.out.println("[3]Peek");
            System.out.println("[4]Check if the stack is empty");
            System.out.println("[5]Get size of the stack");
            System.out.println("[6]Print the Stack");
            System.out.print("Enter your choice:");

            // Switch case to handle the user's choice
            switch (sc.nextInt()) {
                case 0: return ;
                case 1: {
                    stack.push(input());  // Push an element to the stack
                    break;
                }
                case 2: {
                    System.out.println(stack.pop());  // Pop and print the top element
                    break;
                }
                case 3: {
                    System.out.println(stack.peek());  // Peek and print the top element
                    break;
                }
                case 4: {
                    System.out.println(stack.isEmpty() ? "Empty" : "Not Empty");  // Check if stack is empty
                    break;
                }
                case 5: {
                    System.out.println("Size:" + stack.getsize());  // Print stack size
                    break;
                }
                case 6: {
                    System.out.println("--------------------------------------------------------");
                    stack.Print();  // Print all elements in the stack
                    System.out.println("--------------------------------------------------------");
                    break;
                }
                default: {
                    System.out.println("Invalid Choice");  // Handle invalid choice
                }
            }
            
        }
    }

    // Method to take input of different data types based on user choice
    public static Object input() {
        System.out.println("[1]Integer");
        System.out.println("[2]Double");
        System.out.println("[3]Boolean");
        System.out.println("[4]String");
        System.out.print("Enter your choice and the input:");
        
        // Switch case to handle the input type and return the inputted value
        switch (sc.nextInt()) {
            case 1: return sc.nextInt();
            case 2: return sc.nextDouble();
            case 4: return sc.next();
            case 3: return sc.nextBoolean();
            default: return null;
        }
    }
}