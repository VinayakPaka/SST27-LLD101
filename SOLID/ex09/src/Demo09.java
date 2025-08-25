public class Demo09 {
    public static void main(String[] args) {
        System.out.println("=== Simple SOLID Solution ===");
        
        OrderRepository sqlRepo = new SqlOrderRepository();
        OrderController sqlController = new OrderController(sqlRepo);
        sqlController.create("ORD-1");
        
        System.out.println("\n--- Different repository ---");
        OrderRepository memoryRepo = new InMemoryOrderRepository();
        OrderController memoryController = new OrderController(memoryRepo);
        memoryController.create("ORD-2");
        
        System.out.println("\n--- Swapping repositories ---");
        OrderController controller = new OrderController(sqlRepo);
        controller.create("ORD-3");
        
        controller = new OrderController(memoryRepo);
        controller.create("ORD-4");
    }
}
