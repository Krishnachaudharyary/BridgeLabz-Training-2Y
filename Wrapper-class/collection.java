import java.util.ArrayList;
import java.util.Collections;

public class WrapperInCollections {
    public static void main(String[] args) {
        // Given array of primitive doubles
        double[] prices = {10.5, 20.0, 35.75, 5.5};

        // Convert to ArrayList<Double> using wrapper objects (auto-boxing)
        ArrayList<Double> priceList = new ArrayList<>();
        for (double p : prices) {
            priceList.add(p); // auto-boxing: double -> Double
        }

        // Calculate highest price using Collections.max()
        double highest = Collections.max(priceList);

        // Calculate average price using auto-unboxing
        double sum = 0;
        for (double p : priceList) { // auto-unboxing: Double -> double
            sum += p;
        }
        double average = sum / priceList.size();

        // Display results
        System.out.println("Prices: " + priceList);
        System.out.println("Highest price: " + highest);
        System.out.println("Average price: " + average);
    }
}
