package period;

import java.time.Period;

/**
 * @author Sadman
 */
public class PeriodExample2 {
    public static void main(String[] args) {
        Period period = Period.of(2017,02,16);
        System.out.println(period.toString());
    }
}
