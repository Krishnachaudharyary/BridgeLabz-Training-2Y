import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // 2D Array: [person][0=weight, 1=height, 2=BMI]
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            // weight
            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();
            if (weight <= 0) {
                System.out.println("Invalid weight! Enter again.");
                i--;
                continue;
            }

            // height
            System.out.print("Enter height (m): ");
            double height = sc.nextDouble();
            if (height <= 0) {
                System.out.println("Invalid height! Enter again.");
                i--;
                continue;
            }

            // Store in array
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Status based on BMI
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display data
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Weight: %.2f kg, Height: %.2f m, BMI: %.2f, Status: %s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
