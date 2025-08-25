public class Demo07 {
    public static void main(String[] args) {
        System.out.println("=== Simple SOLID Solution ===");
        
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello");
        
        System.out.println("\n--- All-in-One Machine ---");
        Machine allInOne = new AllInOneMachine();
        allInOne.print("Hello World");
        allInOne.scan("/tmp/out");
        allInOne.fax("123-456-7890");
        
        System.out.println("\n--- Different printer types ---");
        Printer anotherPrinter = new BasicPrinter();
        anotherPrinter.print("Another document");
    }
}
