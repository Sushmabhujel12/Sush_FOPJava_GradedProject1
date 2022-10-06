package com.greatlearning.tech.department;
import com.greatlearning.supper.department.SuperDepartment;


public class TechDepartment extends SuperDepartment {
	
	public final static String DEPARTMENTNAME = "Tech Department ";
	public final static String TODAYSWORK = "Complete coding of module 1 ";
	public final static String WORKDEADLINE = "Complete by EOD ";
	public final static String TECHSTACKINFORMATION = "core Java ";

	public String departmentname() {
		
		return DEPARTMENTNAME;
	}
	
	public String getTodaysWork() {

		return TODAYSWORK;
	}

	public String getWorkDeadline() {

		return WORKDEADLINE;
	}
	public String getTechStackInformation() {

		return TECHSTACKINFORMATION;
	}

}
