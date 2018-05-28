package com.case1;

public class WaterBill implements  InterfaceBill{

	@Override
	public double calcBill(int units) {
		double amt=units*8.98;
		return amt;
	}

	@Override
	public void printBill(double amt) {
		System.out.println("Bill :"+amt);
		
	}
	

}
