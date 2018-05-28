package com.case2;

public   abstract class AbstractPrintBill implements InterfaceBill{

	@Override
	public void printBill(double amt) {
		System.out.println("Bill :"+amt);
		
	}

}
