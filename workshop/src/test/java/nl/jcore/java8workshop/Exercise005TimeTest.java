package nl.jcore.java8workshop;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import static org.junit.Assert.assertEquals;

public class Exercise005TimeTest {
    private static final String TIMEZONE_EUROPE_AMSTERDAM = "Europe/Amsterdam";

    @Test
    public void testGetLocalDate() {
        final int year = LocalDate.now().getYear();
        final int month = LocalDate.now().getMonthValue();
        final int day = LocalDate.now().getDayOfMonth();
        assertEquals(LocalDate.of(year, month, day), Exercise005Time.getLocalDateOfToday());
    }

    @Test
    public void testGetInstantFromDate() {
        final LocalDateTime dateTime = LocalDate.of(2017, 02, 04).atStartOfDay();
        final ZoneId zoneId = ZoneId.of(TIMEZONE_EUROPE_AMSTERDAM);
        final Instant instant = Instant.ofEpochMilli(1486162800000L);
        assertEquals(instant, Exercise005Time.getInstantFromDateTimeAndTimezone(dateTime, zoneId));
    }
}
