package com.training.factory;

public class InsuranceFactory {

	public static Insurance getInsurance(int ch){
		
		Insurance ins=null;
		
		if(ch==1)
		{
		   ins=new LifeInsurance();
		}
		else
		{
			ins=new HealthInsurance();
		}
		return ins;
	}

   /*public  Insurance getInsurance(int ch){
		
		Insurance ins=null;
		
		if(ch==1)
		{
		   ins=new LifeInsurance();
		}
		else
		{
			ins=new HealthInsurance();
		}
		return ins;
	}*/
	

}
