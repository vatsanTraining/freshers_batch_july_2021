package com.training.proxy;
/* PROXY */
public class ProxyInterNetAccess implements InterNetAccess {

	InterNetAccessImpl real;
	private int empGrade;
	
	
	public void setEmpGrade(int empGrade) {
		this.empGrade = empGrade;
	}


	public ProxyInterNetAccess() {
		super();
		real=new InterNetAccessImpl();
	}


	@Override
	public void grantPermission() {
				
	if(this.empGrade>5)
	{
		System.out.println("Proxy Up-Delegating to Real");
		real.grantPermission();
	}
	else
	{
	   System.out.println("Proxy Controlling the Access");
		System.out.println("You are Not Authorzed : contact Admin");
	}
	}
	
	
	

}
