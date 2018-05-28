package com.case2;

public class ElectricityBill extends AbstractPrintBill {

	@Override
	public double calcBill(int units) {
		double amt=units*7.98;
		return amt;
	}
	
	public static void main(String[] args) {
		//InterfaceBill b=new ElectricityBill();
		ElectricityBill b=new  ElectricityBill();
		double calcBill = b.calcBill(234);
		b.printBill(98);
	}

}
