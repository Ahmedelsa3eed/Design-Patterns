package Structural.Adapter;

public class LegacyPaymentAdapter implements PaymentGateway {
    private LegacyPaymentSystem legacyPaymentSystem;

    public LegacyPaymentAdapter(LegacyPaymentSystem legacyPaymentSystem) {
        this.legacyPaymentSystem = legacyPaymentSystem;
    }

    @Override
    public void processPayment(double amount) {
        float flaotAmount = (float) amount;
        this.legacyPaymentSystem.makePayment(flaotAmount);
    }
}
