package com.basicPrograms;

public class Lcm_program
{
public static void main(String[] args) {
	
	int n1=5;
	int n2=2;
	int lcm;
	
	//int[] arr={8,9,7,5,4,1,3,14,12};
	
	lcm=(n1>n2) ? n1 :n2 ;
	
	System.out.println("lcm val----------------------"+lcm(5,2));
	
	while(true){
		
		if(lcm%n1==0 && lcm%n2==0){
			System.out.println("lcm---"+lcm);
			break;
		}
		System.out.println("before---lcm---"+lcm);
		++lcm;
		System.out.println("after---lcm---"+lcm);
	}
	
}

static int lcm(int a, int b)
{
   int x;
   x = (a > b) ? a : b;
   while(true)
   {
      if(x % a == 0 && x % b == 0){
         return x;
      }
      
      ++x;
   }
      
}



}
