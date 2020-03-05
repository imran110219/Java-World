package Structural.Decorator;

/**
 * Created by Sadman on 3/5/2020.
 */
public interface Report {
    public Object[][] getReportData(final String reportId);
    public String getFirstColumnData();
}
