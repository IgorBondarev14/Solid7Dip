package solid;

import solid.dip.DisplayReport;
import solid.dip.PrintReport;
import solid.dip.Report;
import solid.dip.ReportManager;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        ReportManager rm = new ReportManager(new DisplayReport());
        ReportManager rm1 = new ReportManager(new PrintReport());
        report.calculate();
        rm.output(report.getItems());
        rm1.output(report.getItems());
    }
}
