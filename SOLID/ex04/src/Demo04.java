
public class Demo04 {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        
        // Demo the payment service
        System.out.println("=== Simple SOLID Solution ===");
        
        Payment upiPayment = new Payment("UPI", 499);
        Payment cardPayment = new Payment("CARD", 299);
        Payment walletPayment = new Payment("WALLET", 199);
        
        System.out.println(paymentService.pay(upiPayment));
        System.out.println(paymentService.pay(cardPayment));
        System.out.println(paymentService.pay(walletPayment));
        
        // Demo with different amounts
        System.out.println("\n--- Different amounts ---");
        Payment largePayment = new Payment("CARD", 999);
        System.out.println(paymentService.pay(largePayment));
    }
}
