import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // LISTS
        // List is an interface
        // interface: a set of methods that a class can promise to implement
        // java provides two classes that implement List
        // ArrayList and LinkedList
        List<String> myAutumnWords;
        // <T> is a parameterized type (e.g. generics)
        myAutumnWords = new ArrayList<>();
        myAutumnWords.add("pumpkin");
        myAutumnWords.add("chilly");
        myAutumnWords.add("halloween");
        myAutumnWords.add("leaves");
        System.out.println(myAutumnWords);
        System.out.println(myAutumnWords.size());

//        myAutumnWords.remove(0);
//        System.out.println(myAutumnWords);

        // task: make a list of the first 10 square numbers
        // print, reverse, print
        // e.g. the Collections framework
        Collections.sort(myAutumnWords);
        System.out.println(myAutumnWords);
        // int -> Integer, char -> Character, double -> Double,....
        // autoboxing: converting a primitive into a reference type
        List<Integer> mySquares = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            mySquares.add(i * i);
        }
        System.out.println(mySquares);
        Collections.reverse(mySquares);
        System.out.println(mySquares);
        Collections.shuffle(mySquares);
        System.out.println(mySquares);

        // we will return to this project later... for exceptions
        // EXCEPTIONS
        // exception: an event that occurs during runtime that disrupts the normal program execution flow
        // 2 main types of exceptions in java
        // 1. unchecked exception: errors and runtime exceptions
        // 2. checked exceptions: exceptions that you must acknowledge, handle, and/or recover from

        // run time exception
        try {
            int x = 5 / 0; // surround this line with try/catch block
        } catch (ArithmeticException e) { // be specific
            e.printStackTrace(); // System.err
        } finally {
            // executes no matter what happens in the try (success or failure)
            System.out.println("Hello from finally");
            // one use case... put clean up code here
            // e.g. free resources, like close files, sockets, ...
        }

        // surround with: cmd + opt + T OR ctrl + alt + T

        // checked exception
        // lets say we want to open a file that doesn't exist (DNE)
        Scanner infile = null;
        try {
            infile = new Scanner(new File("dne.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Scanner kb = new Scanner(System.in);
        int userNum = 0;
        boolean valid = false; // assume invalid input until proven otherwise
        do {
            try {
                System.out.print("Enter an integer (or else!): ");
                userNum = kb.nextInt(); // on failure, the (not-int) string is in the buffer
                // on success, the newline character is in the buffer
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("That's not an integer!!");
            } finally {
                kb.nextLine(); // flush it out
            }
        } while (!valid);
        /*
        Task 1: Run the program. What happens if you enter “hi” as user input instead of an integer?
                Is this a checked or unchecked exception? How do you know?
        Task 2: Using a try/catch block, ensure this exception doesn’t crash your program!
        Task 3: Write an input validation loop that requires the user enters an integer.
        */

        System.out.println("Program execution continues...");

    }
}
