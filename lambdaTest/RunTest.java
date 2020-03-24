package lambdaTest;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Optional;

/**
 * @author liyao
 * @version 1.0
 * @date 2020/3/24 16:12
 */
public class RunTest {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "c").forEach(e -> {
            System.out.println(e);
        });
        final Clock clock = Clock.systemUTC();
        System.out.println( clock.instant() );
        System.out.println( clock.millis() );
//        String abc = null;
        String abc = "hahaha";
        Optional<String> name = Optional.ofNullable(abc);
        System.out.println(name.isPresent());
        System.out.println(name.orElse("123"));

        // Get the local date and local time
        final LocalDate date = LocalDate.now().plusDays(2);
        final LocalDate dateFromClock = LocalDate.now( clock );

        System.out.println( date );
        System.out.println( dateFromClock );

// Get the local date and local time
        final LocalTime time = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now( clock );

        System.out.println( time );
        System.out.println( timeFromClock );
    }

}
