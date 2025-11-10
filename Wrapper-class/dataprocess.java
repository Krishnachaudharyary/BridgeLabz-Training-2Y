import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        // Given array of primitive int values (employee ages)
        int[] ages = {25, 32, 45, 28, 39, 22, 30};

        // Convert int[] → ArrayList<Integer> using wrapper classes (auto-boxing)
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age); // auto-boxing: int → Integer
        }

        // Find youngest and oldest employee using Collections methods
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        // Display results
        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest Employee Age: " + youngest);
        System.out.println("Oldest Employee Age: " + oldest);
    }
}
