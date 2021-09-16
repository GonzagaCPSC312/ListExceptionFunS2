import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    }
}
