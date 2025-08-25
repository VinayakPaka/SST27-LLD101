public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Engine started: Vroom!");
    }
    
    @Override
    public void pedal(int effort) {
        System.out.println("Car doesn't have pedals!");
    }
    
    @Override
    public void recharge(int kWh) {
        System.out.println("Recharging with " + kWh + " kWh");
    }
}
