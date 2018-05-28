package com.sortingPrograms;

public class Sort_Integer_Array 
{
	
	public static int[] sortNumbers(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{//0=1,
			for(int j=i+1;j<arr.length;j++)
			{//j=0+1=1=1,
			
				
	//1>9, 1>0=true, 1>8, 1>0=true, 1>1, 1>0=true, 1>2, 1>3
				if(arr[i]>arr[j])
			
				{
					temp=arr[i]; //0=1  
					
					arr[i]=arr[j];//1=0   
					arr[j]=temp;//0=0
	
				}
			}
			
		}
		return arr;
		
	}
	
public static void main(String[] args) {
	
	
	//int[] a={2,4,5,1,3,6,8,7};
	int[] a={1,9,0,8,0,1,0,2,3};
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"---");
	}
	int res[]=sortNumbers(a);
	System.out.println("after sort");
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+"---");
	}
	
}
}
