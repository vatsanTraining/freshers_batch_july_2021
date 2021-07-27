package com.training.proxy;
/* Real Subject */
public class InterNetAccessImpl implements InterNetAccess {

   private int empGrade;
	
	

	public void setEmpGrade(int empGrade) {
		this.empGrade = empGrade;
	}

	@Override
	public void grantPermission() {
		
		System.out.println("REAL UP");
		
		System.out.println("Your Can Access Internet");

	}

}
