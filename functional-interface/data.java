interface ReportExporter {
    void exportToCSV();
    void exportToPDF();

    // Default JSON export method
    default void exportToJSON() {
        System.out.println("Exporting report to JSON format (default method).");
    }
}

class CSVExporter implements ReportExporter {
    public void exportToCSV() {
        System.out.println("Exporting report to CSV format.");
    }
    public void exportToPDF() {
        System.out.println("Exporting report to PDF format.");
    }
}

public class DataExport {
    public static void main(String[] args) {
        ReportExporter exporter = new CSVExporter();
        exporter.exportToCSV();
        exporter.exportToPDF();
        exporter.exportToJSON(); // newly added default method
    }
}
