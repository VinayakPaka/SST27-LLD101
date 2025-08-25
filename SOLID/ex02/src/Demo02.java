public class Demo02 {
    public static void main(String[] args) {
        MediaPlayer player = new Player();
        
        System.out.println("=== Simple SOLID Solution ===");
        player.play(new byte[]{1, 2, 3, 4});
        
        System.out.println("\n--- Playing different media ---");
        player.play(new byte[]{5, 6, 7, 8, 9});
    }
}
