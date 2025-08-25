public class Demo02 {
    public static void main(String[] args) {
        // Create player using interface (Dependency Inversion)
        MediaPlayer player = new Player();
        
        // Demo the media player
        System.out.println("=== Simple SOLID Solution ===");
        player.play(new byte[]{1, 2, 3, 4});
        
        // Demo with different data
        System.out.println("\n--- Playing different media ---");
        player.play(new byte[]{5, 6, 7, 8, 9});
    }
}
