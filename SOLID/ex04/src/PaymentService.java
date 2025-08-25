
public class PaymentService {
    private final java.util.Map<String, PaymentProcessor> processors;
    
    public PaymentService() {
        processors = new java.util.HashMap<>();
        processors.put("CARD", new CardPaymentProcessor());
        processors.put("UPI", new UPIPaymentProcessor());
        processors.put("WALLET", new WalletPaymentProcessor());
    }
    
    public String pay(Payment payment) {
        PaymentProcessor processor = processors.get(payment.getProvider());
        if (processor == null) {
            throw new RuntimeException("No provider: " + payment.getProvider());
        }
        return processor.processPayment(payment.getAmount());
    }
}