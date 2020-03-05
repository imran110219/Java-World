package Structural.Decorator;

/**
 * Created by Sadman on 3/5/2020.
 */
public class SupportReport implements Report {

    @Override
    public Object[][] getReportData(String reportId) {
        return null;
    }

    @Override
    public String getFirstColumnData() {
        return "Support data";
    }

}