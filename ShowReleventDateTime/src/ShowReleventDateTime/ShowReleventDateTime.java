package ShowReleventDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ShowReleventDateTime {
	
	public static void main(String[] args) {
//		LocalDateTime t= LocalDateTime.now(ZoneId.of("GMT"));
//		LocalDateTime t1= LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		
		int year,month,dayOfMonth,hour,min,sec;
		Scanner inputVar = new Scanner(System.in);
		System.out.println();
		System.out.print("Please enter a year : ");
		year=inputVar.nextInt();
		System.out.println();
		System.out.print("Please enter a month : ");
		month=inputVar.nextInt();
		System.out.println();
		System.out.print("Please enter a Day : ");
		dayOfMonth=inputVar.nextInt();
		System.out.println();
		System.out.print("Please enter a Hour : ");
		hour=inputVar.nextInt();
		System.out.println();
		System.out.print("Please enter a Min : ");
		min=inputVar.nextInt();
		System.out.println();
		System.out.print("Please enter a Sec : ");
		sec=inputVar.nextInt();
		
		LocalDateTime localDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, min, sec);
		ZonedDateTime zonedDateTime1=ZonedDateTime.of(localDateTime,ZoneId.of("UTC"));

		ZonedDateTime zonedDateTime2=ZonedDateTime.of(localDateTime, ZoneId.of("America/Los_Angeles"));
		System.out.println(zonedDateTime1);
		System.out.println(zonedDateTime2);
		
	}

}


