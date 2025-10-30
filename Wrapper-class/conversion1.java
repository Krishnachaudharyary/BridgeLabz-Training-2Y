import java.util.Scanner;

public class conversion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking integer input from user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Converting primitive int to Integer object
        Integer obj = Integer.valueOf(num);

        // Displaying values
        System.out.println("Primitive value: " + num);
        System.out.println("Integer object value: " + obj);

        sc.close();
    }
}
