public class Demo08 {
    public static void main(String[] args) {
        System.out.println("=== Simple SOLID Solution ===");
        
        // Bicycle can only pedal
        PedalVehicle bicycle = new Bicycle();
        bicycle.pedal(5);
        
        // Car can do everything
        System.out.println("\n--- Car Operations ---");
        Vehicle car = new Car();
        car.startEngine();
        car.pedal(0); // Car doesn't have pedals
        car.recharge(50);
        
        // Try to use bicycle for engine operations (compile error, which is good!)
        // bicycle.startEngine(); // Compile error - Bicycle doesn't implement EngineVehicle
        
        System.out.println("\n--- Different vehicle types ---");
        PedalVehicle anotherBike = new Bicycle();
        anotherBike.pedal(3);
        
        EngineVehicle motorcycle = new Car(); // Car implements EngineVehicle
        motorcycle.startEngine();
    }
}
