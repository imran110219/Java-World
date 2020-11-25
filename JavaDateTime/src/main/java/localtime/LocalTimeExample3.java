package localtime;

import java.time.LocalTime;

/**
 * @author Sadman
 */
public class LocalTimeExample3 {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(10,43,12);
        System.out.println(time1);
        LocalTime time2=time1.minusHours(2);
        LocalTime time3=time2.minusMinutes(34);
        System.out.println(time3);
    }
}
