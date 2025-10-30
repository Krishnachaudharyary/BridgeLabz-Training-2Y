import java.util.Optional;

public class BankTransactionLimits {

    // Method 1: Using null check and auto-unboxing
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

    // Method 2: Using Optional (modern approach)
    public static double getRemainingLimitOptional(Double limit, double withdrawnAmount) {
        return Optional.ofNullable(limit)
                .map(l -> Math.max(0.0, l - withdrawnAmount))
                .orElseGet(() -> {
                    System.out.println("Limit not set for this account. Returning 0.0");
                    return 0.0;
                });
    }

    public static void main(String[] args) {
        // Test cases
        Double limit1 = 5000.0;    // as Double object
        double limit2 = 3000.0;    // as primitive
        Double limit3 = null;      // null limit

        double withdrawn = 1200.0;

        System.out.println("=== Using normal method ===");
        System.out.println("Remaining limit (limit1): " + getRemainingLimit(limit1, withdrawn));
        System.out.println("Remaining limit (limit2): " + getRemainingLimit(limit2, withdrawn));
        System.out.println("Remaining limit (limit3): " + getRemainingLimit(limit3, withdrawn));

        System.out.println("\n=== Using Optional method ===");
        System.out.println("Remaining limit (limit1): " + getRemainingLimitOptional(limit1, withdrawn));
        System.out.println("Remaining limit (limit2): " + getRemainingLimitOptional(limit2, withdrawn));
        System.out.println("Remaining limit (limit3): " + getRemainingLimitOptional(limit3, withdrawn));
    }
}
