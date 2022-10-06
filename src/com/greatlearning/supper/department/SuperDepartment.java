package com.greatlearning.supper.department;

import java.util.Calendar;
import java.util.Date;

public class SuperDepartment {
	
	public final static String DEPARTMENTNAME = "Super Department ";
	
	public final static String TODAYSWORK = "No Work as of now ";
	
	public final static String WORKDEADLINE = "Nil ";
	//public final static String TodayAHoliday = "Today is not a holiday";
	
	
	public String CHECKHOLIDAY= "";

	
	public String departmentName() {
		
		return DEPARTMENTNAME ;
	}

	public String getTodaysWork() {
		
		return TODAYSWORK;
	}
	public String getWorkDeadline() {
		
		return WORKDEADLINE;
	}
	
	
	public String isTodayAHoliday() {
		
		Date todayDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(todayDate);
		
		if((calendar.get(Calendar.DAY_OF_WEEK)== Calendar.SATURDAY)||(Calendar.DAY_OF_WEEK== Calendar.SUNDAY)) {
			
			CHECKHOLIDAY ="Today is a Holiday";
			return CHECKHOLIDAY;
		}
		else {
			CHECKHOLIDAY ="Today is not a Holiday";
			
			return CHECKHOLIDAY;
		}
	}
	
	
	
}
