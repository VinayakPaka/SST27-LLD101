public class Player implements MediaPlayer {
    private Frame lastFrame;
    
    @Override
    public void play(byte[] fileBytes) {
        // Single responsibility: decode and create frame
        Frame frame = decodeFrame(fileBytes);
        lastFrame = frame;
        
        // Single responsibility: render UI
        renderUI(fileBytes.length);
        
        // Single responsibility: cache management
        cacheFrame();
    }
    
    private Frame decodeFrame(byte[] fileBytes) {
        return new Frame(fileBytes); // pretend decoding
    }
    
    private void renderUI(int byteCount) {
        System.out.println("\u25B6 Playing " + byteCount + " bytes");
    }
    
    private void cacheFrame() {
        System.out.println("Cached last frame? " + (lastFrame != null));
    }
}