package coding;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class TraditionalDateTime {
    public static void main(String[] args) {
       LocalDate d = LocalDate.now();
       System.err.println(d);
       LocalDate d1 = LocalDate.of(2001,Month.AUGUST,20);
       System.out.println(d1);
       LocalDate d2 = LocalDate.of(2001,Month.FEBRUARY,19);
       System.out.println(d2);
       LocalDate t1 = LocalDate.now(ZoneId.of("US/Pacific"));
       System.out.println(t1);
       LocalTime t2 = LocalTime.now(ZoneId.of("US/Pacific"));
       System.out.println(t2);
       
       for(String s: ZoneId.getAvailableZoneIds()) {
    	   System.out.println(s);
       }
       
    }
}