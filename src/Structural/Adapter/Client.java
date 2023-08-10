package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        // Legacy payment system
        LegacyPaymentSystem legacyPaymentSystem = new LegacyPaymentSystem();

        // Using the adapter to make the legacy payment system work with the modern code
        PaymentGateway legacyPaymentAdapter = new LegacyPaymentAdapter(legacyPaymentSystem);
        legacyPaymentAdapter.processPayment(150.0);
    }
}
