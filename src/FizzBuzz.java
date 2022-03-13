import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        isFizzBuzz(15);
        System.out.println("----------------");
        fizzBuzzList(100);
        System.out.println("----------------");
        fizzBuzzArray(100);
        System.out.println("----------------");
        printArrayAsList(new String[]{"this", "that", "these"});
    }
//method to judge if a number is Fizz, Buzz or FizzBuzz.
    public static void isFizzBuzz(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("Buzz");
        } else System.out.println(number);
    }
//method to list out a range of numbers with their FizzBuzz results.
    public static void fizzBuzzList(int endNumber) {
        for (int i = 1; i <= endNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
    }
//method to add the FizzBuzz results as Strings in an array.
    public static void fizzBuzzArray(int endNumber) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= endNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0 && i % 5 != 0) {
                list.add("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                list.add("Buzz");
            } else list.add(String.valueOf(i));
        }
        System.out.println(list);

    }
//method to print an array as a list.
    public static void printArrayAsList(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
