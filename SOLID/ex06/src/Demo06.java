public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        
        // Demo the aviary with flyable birds
        System.out.println("=== Simple SOLID Solution ===");
        
        Bird bird = new Bird();
        aviary.release(bird); // This works fine
        
        // Penguin can't fly, so it's not used in aviary
        Penguin penguin = new Penguin();
        System.out.println("\n--- Penguin activities ---");
        penguin.walk();
        penguin.swim();
        
        // Try to use penguin in aviary (this would cause compile error, which is good!)
        // aviary.release(penguin); // Compile error - Penguin doesn't implement Flyable
        
        System.out.println("\n--- Different bird types ---");
        Bird sparrow = new Bird();
        aviary.release(sparrow);
    }
}
