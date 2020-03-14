package com.cts.activity.dao;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class DateDemo {

	public static void main(String[] args) {
		DateToString dts=new DateToString();
		DaysBetween db=new DaysBetween();
		TestZone tz=new TestZone();
		LeapYear lp=new LeapYear();
		TodayDate td =new TodayDate();
		TodayDate1 td1 =new TodayDate1();
		Date date = new Date(0);
		System.out.println(date);
		int day=date.getDate();
		switch (day) {
		case 0:System.out.println("Sunday");
			
		break;
		case 1:System.out.println("Monday");
		
		break ;
		case 2:System.out.println("Tuesday");
		
		break ;
		case 3:System.out.println("Wednesday");
		
		break ;
		case 4:System.out.println("Thursday");
		
		break ;
		case 5:System.out.println("Friday");
		
		break ;
		case 6:System.out.println("Saturday");
		
		break ;

		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
		td.show();
		td1.show();
		lp.leapCheck();
		tz.WhichZone();
		db.getNumber();
		dts.StringConvert();
		
	}
	

}
class TodayDate {

	public void show() {
		
		LocalDate date=LocalDate.now();
		System.out.println("today's date is :"+date);
		LocalDate tommorow=LocalDate.of(2020, 8, 20);
		if(date.isBefore(tommorow))
		{
			System.out.println("TRUE");
		}
		if(date.isAfter(tommorow))
		{
			System.out.println("TRUE");
		}

	}

}
class TodayDate1 {

	public void show() {
		
		LocalDate date=LocalDate.now();
		LocalTime current1=LocalTime.now();
		LocalDate next=date.plus(1, ChronoUnit.WEEKS);
		LocalDate birthday=LocalDate.of(1997,3,17);
		MonthDay birth=MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());
		MonthDay current=MonthDay.from(date);
		if(birth.equals(current)) {
			System.out.println("Today Birthday");
		}
		Clock clock=Clock.systemUTC();
		System.out.println("Clock :"+clock);
		
		Clock defaultClock=Clock.systemDefaultZone();
		System.out.println("Clock :"+defaultClock);
		LocalTime current2=current1.plusHours(2);
		System.out.println("Current Time: "+current1);
		System.out.println("Current Time After 2Hrs: "+current2);
		System.out.println("1 week Later date is :"+next);
		int day=date.getDayOfMonth();
		int month=date.getMonthValue();
		int year=date.getYear();
		
		System.out.printf("Year : %d , Month : %d , Day : %d \t %n",year,month,day);

	}

}
class LeapYear {

	public void leapCheck() {
		
		LocalDate nowDate=LocalDate.now();
		
		if(nowDate.isLeapYear())
		{
			System.out.printf("The Year %s is a Leap Year %n",nowDate);
		}
		else
		{
			System.out.printf("The Year %s is not a Leap year %n",nowDate);
		}

	}
}
class TestZone{
	public void WhichZone() {
		ZoneId zone=ZoneId.of("Asia/Calcutta");
		
		LocalDateTime loc_DateTime=LocalDateTime.now();
		ZonedDateTime zon_DateTime=ZonedDateTime.of(loc_DateTime, zone);
		System.out.println("Date and Time in delhi :"+zon_DateTime);
	}
}
class DaysBetween{
	public void getNumber() {
		LocalDate date=LocalDate.of(2015, Month.JULY, 3);
		LocalDate date1=LocalDate.now();
		Period months=Period.between(date, date1);
		System.out.printf("Duration between "+date+" and "+date1+" is(YY MM DD): "+months.getYears()+" years "+months.getMonths()+" months "+months.getDays()+" days ");
	}
}
class DateToString{
	public void StringConvert() {
		try{
			LocalDate nowDate=LocalDate.now();
	
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd YYYY");
		String convrt=nowDate.format(formatter);
		System.out.println("The date is converted into string format: "+nowDate+" to "+convrt);
		}
	catch( Exception e)
	{
		System.out.println("error");
	}
	
		try {
			String birthday="Jan 10 1985";
			DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("MMM dd yyyy");

			LocalDate date3=LocalDate.parse(birthday, formatter1);
			System.out.println("The Date is formatted from: "+birthday+" to "+date3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
