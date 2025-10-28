public class Invoice {
    private String transactionId;

    // Constructor
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    // Getter
    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{transactionId='" + transactionId + "'}";
    }
}
