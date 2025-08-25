public class Demo10 {
    public static void main(String[] args) {
        System.out.println("=== Simple SOLID Solution ===");
        
        // Using console logger
        Logger consoleLogger = new ConsoleLogger();
        ReportService consoleReportService = new ReportService(consoleLogger);
        consoleReportService.generate();
        
        // Using file logger
        System.out.println("\n--- Different logger ---");
        Logger fileLogger = new FileLogger();
        ReportService fileReportService = new ReportService(fileLogger);
        fileReportService.generate();
        
        // Easy to swap loggers
        System.out.println("\n--- Swapping loggers ---");
        ReportService reportService = new ReportService(consoleLogger);
        reportService.generate();
        
        reportService = new ReportService(fileLogger);
        reportService.generate();
    }
}
