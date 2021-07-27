package com.training.singleton;

public class PolicyQuote {

	
	private  String policyName;
	private long tenure;
	private double premium;
	private String  paymentMode;
	private static  PolicyQuote instance=null;
	
	public static PolicyQuote getInstance(){
		
		if(instance==null)
		{
		      synchronized (PolicyQuote.class) {
			   		if(instance == null){
                   instance = new PolicyQuote();
                   }
                }
		}
		return instance;
	}
	
	private  PolicyQuote() {
		super();
		System.out.println("Constructor Called");
	}
	
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public long getTenure() {
		return tenure;
	}
	public void setTenure(long tenure) {
		this.tenure = tenure;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "PolicyQuote [policyName=" + policyName + ", tenure=" + tenure
				+ ", premium=" + premium + ", paymentMode=" + paymentMode + "]";
	}
	
	
}
