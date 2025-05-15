public class Main{
    public static void main(String[] args) {
        reportGeneration pdf = new PDF("PDF format");
        pdf.prepareReport();
        reportGeneration html = new HTML("HTML format");
        html.prepareReport();
    }
}