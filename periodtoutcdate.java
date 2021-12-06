///usr/bin/env jbang "$0" "$@" ; exit $?

import static java.lang.System.*;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class periodtoutcdate {

    public static void main(String... args) {
        
        if (args.length == 0 || args[0] == null) {
            System.out.println("Usage: periodtoutcdate P2DT3H");
            System.exit(-1);
        }

        String period = args[0];
        Duration duration = Duration.parse(period);
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        out.println(String.format("%s = %s", period, now.minus(duration)));
    }
}
