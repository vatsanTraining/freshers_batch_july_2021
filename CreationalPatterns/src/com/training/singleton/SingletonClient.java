package com.training.singleton;

public class SingletonClient {

	public static void main(String[] args) {
		
		PolicyQuote inst1 = PolicyQuote.getInstance();
		
		System.out.println(inst1.hashCode());
		
		
		PolicyQuote inst2 = PolicyQuote.getInstance();
		
		System.out.println(inst2.hashCode());
		
		Runnable th1=new Runnable() {
		
			@Override
			public void run() {
			
				PolicyQuote inst1 = PolicyQuote.getInstance();
				
				System.out.println(Thread.currentThread().getName()+inst1.hashCode());	
			}
		};
							
		Thread mythread1=new Thread(th1,"First thread := ");
		Thread mythread2=new Thread(th1,"Second Thread :=");
		
		mythread1.start();
		mythread2.start();
		
	}
}
