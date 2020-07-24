package vjs180000;
// Create a connecting Flights checkin application which gives timestamp for different timezones it connects ,like
// if a person checks for
// flights from New York to Tokyo, it should display the times in his zone and connected and destination place zone too
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRulesProvider;
import java.util.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class flightCheckin {
    private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a z";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

    public static void main(String[] args) {
        Set<String> allZones= ZoneId.getAvailableZoneIds ();
        List<String> zoneList= new ArrayList<String> (allZones);
        Collections.sort (zoneList);
        LocalTime time = LocalTime.now ();
        ZoneId originTimeZone= ZoneId.of ("America/Chicago");
        ZoneId destinationTimeZone=ZoneId.of ("Asia/Tokyo");
        LocalDateTime now= LocalDateTime.now ();
        ZonedDateTime currentTime = now.atZone(originTimeZone);
        ZonedDateTime destinationTime=currentTime.withZoneSameInstant (destinationTimeZone);
        LocalTime duration=LocalTime.of (15,36);
        System.out.println ("Current Time at origin");
        System.out.println(formatter.format(currentTime));
        System.out.println ("Current Time at destination");
        System.out.println(formatter.format(destinationTime));
        System.out.println ("Arrival Time at with reference to origin time");

        //destinationTime.plusHours (5).plusMinutes (5);
        System.out.println(formatter.format(currentTime.plusHours(duration.getHour ()).plusMinutes (duration.getMinute ())));

        System.out.println ("Arrival Time at destination local time ");
        System.out.println(formatter.format(destinationTime.plusHours(duration.getHour ()).plusMinutes (duration.getMinute ())));


    }

}
