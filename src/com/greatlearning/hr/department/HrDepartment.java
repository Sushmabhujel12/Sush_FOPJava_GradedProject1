package com.greatlearning.hr.department;
import com.greatlearning.supper.department.SuperDepartment;

public class HrDepartment  extends SuperDepartment {

	public final static String DEPARTMENTNAME = "HR Department";
	public final static String TODAYSWORK = "Fill today’s timesheet and mark your attendance";
	public final static String WORKDEADLINE = "Complete by EOD";
	public final static String ACTIVITY = "team Lunch";
	
public String departmentname() {
		
		return DEPARTMENTNAME;
	}
	
	public String getTodaysWork() {

		return TODAYSWORK;
	}

	public String getWorkDeadline() {

		return WORKDEADLINE;
	}
	public String doActivity() {

		return ACTIVITY;
	}
	
}
