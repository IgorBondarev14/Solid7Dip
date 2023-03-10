package solid.dip;

import java.util.List;

public class DisplayReport implements Reportable{

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to display");
        for (ReportItem item : items) {
            System.out.format("see %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
