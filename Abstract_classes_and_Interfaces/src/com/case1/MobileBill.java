package com.case1;

public class MobileBill implements InterfaceBill {

	@Override
	public double calcBill(int units) {
		double amt=units*2.56;
		return amt;
	}

	@Override
	public void printBill(double amt) {
		System.out.println("Bill :"+amt);
		
	}



}
