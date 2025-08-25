public class OrderService {
    private final NotificationService notificationService;
    
    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    
    public void checkout(String customerEmail, double subtotal) {
        double tax = subtotal * 0.18;
        double total = subtotal + tax;
        
        notificationService.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}