import java.util.Scanner;

public class StudentGrades1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks of Student " + (i + 1));

            System.out.print("Physics: ");
            int p = sc.nextInt();
            if (p < 0) {
                System.out.println("Invalid marks! Enter again.");
                i--;
                continue;
            }

            System.out.print("Chemistry: ");
            int c = sc.nextInt();
            if (c < 0) {
                System.out.println("Invalid marks! Enter again.");
                i--;
                continue;
            }

            System.out.print("Maths: ");
            int m = sc.nextInt();
            if (m < 0) {
                System.out.println("Invalid marks! Enter again.");
                i--;
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            int total = p + c + m;
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f, Grade: %c\n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}
