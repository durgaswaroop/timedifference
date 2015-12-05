package timediff;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;

public class TimeDiffInMS{

	public static void main(String[] args) throws ParseException {

		OffsetDateTime start = OffsetDateTime.parse("2014-06-10T10:45:00+03:00"); 
									// Takes the time stamp and converts to an OffsetDateTime object
		OffsetDateTime end = OffsetDateTime.parse("2015-06-10T10:50:00+03:00");
		
		Instant startInst = start.toInstant();   // converts it to an Instant Class object
		Instant endInst = end.toInstant();
		Duration dur = Duration.between(startInst, endInst); // calculates the duration between the two instances
		
		System.out.println("The Period between the two instants is:\n");
		System.out.println(dur.toMillis() + " Millisecs"); //prints the milliseconds

	}
}
