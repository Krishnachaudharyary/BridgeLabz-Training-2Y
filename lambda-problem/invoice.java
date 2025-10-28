import java.util.*;
import java.util.stream.*;

class Invoice {
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

public class InvoiceCreation {
    public static void main(String[] args) {
        // List of transaction IDs
        List<String> transactionIds = Arrays.asList("TXN001", "TXN002", "TXN003", "TXN004");

        // Using Constructor Reference to create Invoice objects
        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)   // Constructor reference
                                               .collect(Collectors.toList());

        // Print all invoices
        invoices.forEach(System.out::println);
    }
}
