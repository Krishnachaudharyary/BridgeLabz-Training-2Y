import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0, temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int index = 0;

        temp = number;
        while (temp != 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        System.out.print("Reversed Number = ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
