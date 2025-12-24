import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones
{
    public static void main(String args[])
    {
	
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

	// for gmt
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // for India
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // for pacific
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in GMT: " + gmtTime.format(format));
        System.out.println("Current Time in IST: " + istTime.format(format));
        System.out.println("Current Time in PST: " + pstTime.format(format));
    }
}