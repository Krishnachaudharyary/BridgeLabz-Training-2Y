// Custom marker interface
interface SensitiveData {}

// Class marked as sensitive
class CreditCardInfo implements SensitiveData {
    String cardNumber;
    String holderName;

    public CreditCardInfo(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }
}

// Processor to handle encryption for sensitive data
class DataProcessor {
    public void process(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("🔒 Encrypting sensitive data before storage...");
        } else {
            System.out.println("✅ Normal data - storing directly.");
        }
    }
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        CreditCardInfo card = new CreditCardInfo("1234-5678-9012-3456", "Krishna");
        String normalData = "Regular log entry";

        DataProcessor processor = new DataProcessor();
        processor.process(card);
        processor.process(normalData);
    }
}
