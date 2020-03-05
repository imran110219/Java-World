package Structural.Decorator;

/**
 * Created by Sadman on 3/5/2020.
 */
public class SupportPopupDecorator extends ColumDecorator{

    public SupportPopupDecorator(Report report) {
        super(report);
    }

    public String getFirstColumnData() {
        return addPopup (super.getFirstColumnData()) ;
    }

    private String addPopup(String data){
        return data  + " - support popup - ";
    }
}