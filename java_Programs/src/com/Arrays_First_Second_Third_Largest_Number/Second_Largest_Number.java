package com.Arrays_First_Second_Third_Largest_Number;

import java.util.Arrays;

public class Second_Largest_Number 
{
	
	
	public static int findThirdLargestNumber(int[] a,int total)
	{
		Arrays.sort(a);
		//12345679
		return a[6];
		
	
	}
	public static void main(String[] args) {
		
		int a[]={1,2,5,6,3,4,7,9};  
		int b[]={44,66,99,77,33,22,55};  
		
		int thirdLargestNumber = findThirdLargestNumber(a,8);
		System.out.println(thirdLargestNumber);
		
		
}
}