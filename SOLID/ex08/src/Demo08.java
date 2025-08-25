public class Demo08 {
    public static void main(String[] args) {
        System.out.println("=== Simple SOLID Solution ===");
        
        PedalVehicle bicycle = new Bicycle();
        bicycle.pedal(5);
        
        System.out.println("\n--- Car Operations ---");
        Vehicle car = new Car();
        car.startEngine();
        car.pedal(0);
        car.recharge(50);
        
        System.out.println("\n--- Different vehicle types ---");
        PedalVehicle anotherBike = new Bicycle();
        anotherBike.pedal(3);
        
        EngineVehicle motorcycle = new Car();
        motorcycle.startEngine();
    }
}
