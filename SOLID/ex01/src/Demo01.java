

public class Demo01 {
    public static void main(String[] args) {
        // Create notification service
        NotificationService notificationService = new EmailClient();
        
        // Create OrderService with dependency injection
        OrderService orderService = new OrderService(notificationService);
        
        // Demo the checkout process
        System.out.println("=== Simple SOLID Solution ===");
        orderService.checkout("a@shop.com", 100.0);
        
        // Demo with different amount
        System.out.println("\n--- Another order ---");
        orderService.checkout("b@shop.com", 250.0);
    }
}
