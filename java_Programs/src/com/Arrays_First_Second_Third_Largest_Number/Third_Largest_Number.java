package com.Arrays_First_Second_Third_Largest_Number;

public class Third_Largest_Number 
{
	
	
	
	public static int findThirdLargestNumber(int[] a,int total)
	{
		int temp=0;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}

		}
		return a[total-3];
		
	
	}
public static void main(String[] args) {
	
	int a[]={1,2,5,6,3,4,7,9};  
	int b[]={44,66,99,77,33,22,55};  
	
	int thirdLargestNumber = findThirdLargestNumber(a,8);
	System.out.println(thirdLargestNumber);
	
	
	//12345679
}
}
