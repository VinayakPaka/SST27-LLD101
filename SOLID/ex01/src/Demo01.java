

public class Demo01 {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailClient();
        
        OrderService orderService = new OrderService(notificationService);
        
        System.out.println("=== Simple SOLID Solution ===");
        orderService.checkout("a@shop.com", 100.0);
        
        System.out.println("\n--- Another order ---");
        orderService.checkout("b@shop.com", 250.0);
    }
}
