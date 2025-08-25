public class ShippingCostCalculator {
    private final java.util.Map<String, ShippingStrategy> strategies;
    
    public ShippingCostCalculator() {
        strategies = new java.util.HashMap<>();
        strategies.put("STANDARD", new StandardShipping());
        strategies.put("EXPRESS", new ExpressShipping());
        strategies.put("OVERNIGHT", new OvernightShipping());
    }
    
    public double cost(Shipment shipment) {
        ShippingStrategy strategy = strategies.get(shipment.getType());
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown type: " + shipment.getType());
        }
        return strategy.calculateCost(shipment.getWeightKg());
    }
}
