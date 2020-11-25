package zoneddatetime;

import java.time.ZonedDateTime;

/**
 * @author Sadman
 */
public class ZonedDateTimeExample3 {
    public static void main(String[] args) {
        ZonedDateTime zone =ZonedDateTime.now();
        System.out.println(zone.getZone());
    }
}
