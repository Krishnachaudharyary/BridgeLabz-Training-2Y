import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year >= 1582) {
            // Method 1: Using multiple if-else
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }

            // Method 2: Single if with logical operators
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("(Logical Check) " + year + " is a Leap Year");
            } else {
                System.out.println("(Logical Check) " + year + " is NOT a Leap Year");
            }
        } else {
            System.out.println("Year must be >= 1582 (Gregorian Calendar)");
        }
    }
}
