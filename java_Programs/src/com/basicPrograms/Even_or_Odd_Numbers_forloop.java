package com.basicPrograms;


//Even numbers :0,2,4,6,8,10.
//odd numbers :1,3,5,7,9,11
public class Even_or_Odd_Numbers_forloop 
{
public static void main(String[] args) {
	
	
	// Method 1
	
		int [] a={2,5,1,7,8,9,6,3,5,8};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even"+a[i]);
			}
			else 
				{
				System.out.println("odd"+a[i]);
			}
		}
	
	
	
	
	System.out.println("==============================================");
	
	
	
	//Method 2
	
	System.out.println("odd number");
	for(int i=0;i<=10;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
	System.out.println("even numbers");
	for(int i=0;i<=10;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	
	
//method 3	
	
	for(int i=0;i<100;i++)
	{
		if(i%2==0)
		{
			System.out.println("even"+i);
		}
		else{
			System.out.println("odd" +i);
		}
	}
	
	

}
}
