interface PaymentProcessor {
    void processPayment(double amount);

    // Default refund method
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed (default method).");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via PayPal.");
    }
}

class Stripe implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via Stripe.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        PaymentProcessor stripe = new Stripe();

        paypal.processPayment(500);
        paypal.refund(200);

        stripe.processPayment(1000);
        stripe.refund(500);
    }
}
