public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[FILE LOG] " + message + " (saved to file)");
    }
}
