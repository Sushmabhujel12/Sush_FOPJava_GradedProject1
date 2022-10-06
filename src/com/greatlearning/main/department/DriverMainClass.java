package com.greatlearning.main.department;

import com.greatlearning.admin.department.AdminDepartment;
import com.greatlearning.hr.department.HrDepartment;
import com.greatlearning.tech.department.TechDepartment;

public class DriverMainClass {
	
	public final static String WELCOME = " Welcome to ";
	public static void main (String args[]) {
		
		
		//To Display Admin Department
		
		String adminDepartmentName="",adminTodaysWork="",adminWorkDeadline="",adminTodayAHoliday="";
		AdminDepartment adminDepartment = new AdminDepartment();
		
		adminDepartmentName=  adminDepartment.departmentName();
		adminTodaysWork= adminDepartment.getTodaysWork();
		adminWorkDeadline= adminDepartment.getWorkDeadline();
		adminTodayAHoliday= adminDepartment.isTodayAHoliday();
		System.out.println(WELCOME+"Admin Department"+"\n"+adminTodaysWork+"\n"+adminWorkDeadline+"\n"+adminTodayAHoliday);
		System.out.println("");
		System.out.println("");
		//To Display HR Department
		 
		
		String hrDepartmentName="",hrActivity="",hrTodaysWork="",hrWorkDeadline="",hrTodayAHoliday="";
		HrDepartment hrDepartment = new HrDepartment();
		hrDepartmentName= hrDepartment.departmentName();
		hrActivity= hrDepartment.doActivity();
		hrTodaysWork= hrDepartment.getTodaysWork();
		hrWorkDeadline= hrDepartment.getWorkDeadline();
		hrTodayAHoliday= hrDepartment.isTodayAHoliday();
		System.out.println(WELCOME+"HR Department"+"\n"+hrActivity+"\n"+hrTodaysWork+"\n"+hrWorkDeadline+"\n"+hrTodayAHoliday);
		System.out.println("");
		System.out.println("");

		//To Display Tech Department
		
		String techDepartmentName="",techTodaysWork="",techWorkDeadline="",techTodayAHoliday="",techStackInformation="";
		 
		TechDepartment techDepartment = new TechDepartment();
		techDepartmentName=  techDepartment.departmentName();
		techTodaysWork=   techDepartment.getTodaysWork();
		techWorkDeadline= techDepartment.getWorkDeadline();
		techStackInformation= techDepartment.getTechStackInformation();
		techTodayAHoliday=  techDepartment.isTodayAHoliday();
		
		System.out.println(WELCOME+"Tech Department"+"\n"+techTodaysWork+"\n"+techWorkDeadline+"\n"+techStackInformation+"\n"+techTodayAHoliday);
        System.out.println("");
		System.out.println("");

		
	}

}
