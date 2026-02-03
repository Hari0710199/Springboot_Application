package com.java.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1998, 10, 07);
		LocalDate now = LocalDate.now();
		Period period = Period.between(birthday, now);
		System.out.println("My age is :" + period.getYears() + period.getMonths() + period.getDays());

	}
}
