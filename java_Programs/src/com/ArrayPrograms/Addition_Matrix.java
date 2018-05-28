package com.ArrayPrograms;

public class Addition_Matrix 
{
public static void main(String[] args) {

	int[][] a={{1,2,3,4},{2,4,5,8},{4,5,3,5}};
	int [][] b={{1,2,3,3},{2,4,3,4},{2,5,3,5}};

	
	int[][]c=new int[4][4];
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
		c[i][j]=a[i][j]+b[i][j];
		
		System.out.println(c[i][j]);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	
	
	int c[][]=new int[3][3];
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			
			c[i][j]=a[i][j]+b[i][j];
			System.out.print("  "+c[i][j]);
		}
		
		System.out.println();
	}*/
}
}
