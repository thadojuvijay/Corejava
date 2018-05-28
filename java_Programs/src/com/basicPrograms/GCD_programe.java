package com.basicPrograms;

public class GCD_programe {

	static int gcd(int a, int b)
	   {
	      int z = 0;
	      int p, q;
	      p = (a > b) ? a : b;
	      q = (a < b) ? a : b;
	      
	      z = q;
	      System.out.println("before z val--"+z);
	      while(p % q != 0)
	      {
	    	  System.out.println("before -----p---"+p+"---q---"+q+"---z---"+z);
	         z = p % q;
	         p = q;
	         q = z;
	         System.out.println("p---"+p+"---q---"+q+"---z---"+z);
	      }
	     
	      return z;
	   }
	
	
	public static void main(String[] args) {
		
		System.out.println("gcd----"+gcd(5, 7));
		
		
	}
	
}
