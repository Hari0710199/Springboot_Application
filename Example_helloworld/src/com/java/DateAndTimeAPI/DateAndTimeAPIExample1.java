package com.java.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeAPIExample1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();// date
		LocalTime time = LocalTime.now();// time

		System.out.println("Date " + date + " Time : " + time);
		System.out.println("Day Of Month :" + date.getDayOfMonth());
		System.out.println("Date of year :" + date.getYear());
		System.out.println("hour of time :" + time.getHour());
		System.out.println("get minute : " + time.getMinute());
		System.out.println("get second : " + time.getSecond());
		System.out.println("get nanosecond : " + time.getNano());
		LocalDateTime localDateTime = LocalDateTime.now();// currentDate
		System.out.println("LocalDatetime : " + localDateTime);

		LocalDateTime localDateTime1 = LocalDateTime.of(1998, 10, 07, 9, 45);// particular Date
		System.out.println("currentyear : " + localDateTime1.getYear());
		System.out.println("plus months6  : " + localDateTime1.plusMonths(8));
		System.out.println("minus months 6 " + localDateTime1.minusMonths(3));

	}

}
