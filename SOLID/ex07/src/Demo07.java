public class Demo07 {
    public static void main(String[] args) {
        System.out.println("=== Simple SOLID Solution ===");
        
        // Basic printer can only print
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello");
        
        // All-in-one machine can do everything
        System.out.println("\n--- All-in-One Machine ---");
        Machine allInOne = new AllInOneMachine();
        allInOne.print("Hello World");
        allInOne.scan("/tmp/out");
        allInOne.fax("123-456-7890");
        
        // Try to use basic printer for scanning (compile error, which is good!)
        // basicPrinter.scan("/tmp/out"); // Compile error - BasicPrinter doesn't implement Scanner
        
        System.out.println("\n--- Different printer types ---");
        Printer anotherPrinter = new BasicPrinter();
        anotherPrinter.print("Another document");
    }
}
