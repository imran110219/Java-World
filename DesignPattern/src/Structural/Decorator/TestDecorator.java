package Structural.Decorator;

/**
 * Created by Sadman on 3/5/2020.
 */
public class TestDecorator {
    public static void main(String[] args) {

        //ClientPopupDecorator popupDecoratored = new ClientPopupDecorator(new ClientLinkDecorator(new ClientReport()));
        //System.out.println(popupDecoratored.getFirstColumnData());

        SupportPopupDecorator supportPopupDecoratored = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        System.out.println(supportPopupDecoratored.getFirstColumnData());
    }
}
