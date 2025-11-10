import java.util.ArrayList;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        // Create an ArrayList of Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 5 integer values using auto-boxing
        numbers.add(10);
        numbers.add(15);
        numbers.add(5);
        numbers.add(20);
        numbers.add(5);

        // Calculate sum using auto-unboxing
        int sum = 0;
        for (int num : numbers) { // auto-unboxing happens here
            sum += num;
        }

        // Display the result
        System.out.println("Sum of numbers = " + sum);
    }
}
