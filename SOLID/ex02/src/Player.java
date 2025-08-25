public class Player implements MediaPlayer {
    private Frame lastFrame;
    
    @Override
    public void play(byte[] fileBytes) {
        Frame frame = decodeFrame(fileBytes);
        lastFrame = frame;
        
        renderUI(fileBytes.length);
        
        cacheFrame();
    }
    
    private Frame decodeFrame(byte[] fileBytes) {
        return new Frame(fileBytes);
    }
    
    private void renderUI(int byteCount) {
        System.out.println("\u25B6 Playing " + byteCount + " bytes");
    }
    
    private void cacheFrame() {
        System.out.println("Cached last frame? " + (lastFrame != null));
    }
}