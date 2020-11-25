package zoneddatetime;

import java.time.Period;
import java.time.ZonedDateTime;

/**
 * @author Sadman
 */
public class ZonedDateTimeExample4 {
    public static void main(String[] args) {
        ZonedDateTime zone= ZonedDateTime.now();
        ZonedDateTime m = zone.minus(Period.ofDays(126));
        System.out.println(m);
    }
}
