package com.training;

import com.training.ifaces.PaymentStrategy;

public class Patient {

	  private  PaymentStrategy strategy;
      private double  amount;

public Patient(double amount) {
 super();
  this.amount = amount;
}
public PaymentStrategy getStrategy() {
return strategy;
}
public void setStrategy(PaymentStrategy strategy) {
this.strategy = strategy;
}
public void makePayment(){
strategy.pay(4500);
}

}
