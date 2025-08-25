public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        
        // Demo the shipping cost calculator
        System.out.println("=== Simple SOLID Solution ===");
        
        Shipment standard = new Shipment("STANDARD", 2.0);
        Shipment express = new Shipment("EXPRESS", 2.0);
        Shipment overnight = new Shipment("OVERNIGHT", 2.0);
        
        System.out.println("Standard shipping (2kg): $" + calculator.cost(standard));
        System.out.println("Express shipping (2kg): $" + calculator.cost(express));
        System.out.println("Overnight shipping (2kg): $" + calculator.cost(overnight));
        
        // Demo with different weight
        System.out.println("\n--- Different weight ---");
        Shipment heavyExpress = new Shipment("EXPRESS", 5.0);
        System.out.println("Express shipping (5kg): $" + calculator.cost(heavyExpress));
    }
}
