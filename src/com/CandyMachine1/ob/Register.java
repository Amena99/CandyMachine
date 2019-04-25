package com.CandyMachine1.ob;

public class Register {
	//instance variable 
	int cashOnHand = 500;
	
	//default constructor
	public Register() {
		
	}
	
	//parameter constructor
	public Register(int setCash) {
		if(setCash >= 0) {
			cashOnHand = setCash;
		}else {
			cashOnHand = 50;
		}
	}
	
	//accept input of cash from customer
	//and update the COH
	public void acceptPayment(int payment){
		cashOnHand = cashOnHand + payment;
	}
	
	//takes no parameters but returns the current COH
	public int returnCashOH() {
		return cashOnHand;
	}
	
}
