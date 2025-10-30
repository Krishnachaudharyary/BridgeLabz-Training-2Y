public class BankTransactionLimits {

    // Method to calculate remaining limit
    public static double getRemainingLimit(Double limit, double withdrawnAmount) {
        // Handle null limit safely
        if (limit == null) {
            System.out.println("Limit not set for this account. Returning 0.0");
            return 0.0;
        }

        // Auto-unboxing happens here: Double -> double
        double remaining = limit - withdrawnAmount;

        // Ensure it doesn't go negative
        return (remaining < 0) ? 0.0 : remaining;
    }

    public static void main(String[] args) {
        // Test cases
        Double limit1 = 5000.0;    // as Double object
        double limit2 = 3000.0;    // as primitive
        Double limit3 = null;      // null limit

        double withdrawn = 1200.0;

        System.out.println("Remaining limit (limit1): " + getRemainingLimit(limit1, withdrawn));
        System.out.println("Remaining limit (limit2): " + getRemainingLimit(limit2, withdrawn));
        System.out.println("Remaining limit (limit3): " + getRemainingLimit(limit3, withdrawn));
    }
}
