package Module1.Lesson27;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Example5 {
    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
        }

        ZoneId zone1 = ZoneId.of("Africa/Nouakchott");
        ZonedDateTime time = ZonedDateTime.now(zone1);
        System.out.println(time);

    }
}
