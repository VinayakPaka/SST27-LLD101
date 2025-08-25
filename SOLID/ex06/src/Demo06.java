public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        
        System.out.println("=== Simple SOLID Solution ===");
        
        Bird bird = new Bird();
        aviary.release(bird);
        
        Penguin penguin = new Penguin();
        System.out.println("\n--- Penguin activities ---");
        penguin.walk();
        penguin.swim();
        
        System.out.println("\n--- Different bird types ---");
        Bird sparrow = new Bird();
        aviary.release(sparrow);
    }
}
