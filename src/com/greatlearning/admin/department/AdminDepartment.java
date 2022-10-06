package com.greatlearning.admin.department;

import com.greatlearning.supper.department.SuperDepartment;
public class AdminDepartment extends SuperDepartment {
	
	public final static String DEPARTMENTNAME = "Admin Department ";
	public final static String TODAYSWORK = "Complete your documents Submission ";
	public final static String WORKDEADLINE = "Complete by EOD ";

	
	
	public String departmentname() {
		
		return DEPARTMENTNAME;
	}
	
	public String getTodaysWork() {

		return TODAYSWORK;
	}

	public String getWorkDeadline() {

		return WORKDEADLINE;
	}
}
