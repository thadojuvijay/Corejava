package com.ArrayPrograms;

public class Transpose_Matrix 
{
public static void main(String[] args) {
	
	int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
	int [][] transpose=new int[3][3];
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			transpose[i][j]=matrix[j][i];
		}
	}
	
	System.out.println("matrix");
	for(int i=0;i<matrix.length;i++)
	{
		for(int j=0;j<matrix[i].length;j++)
		{
			System.out.print(" "+matrix[i][j]);
			
		}
		System.out.println();
	}
	
	System.out.println("Transpose Matrix");
	for(int i=0;i<transpose.length;i++)
	{
		for(int j=0;j<transpose[i].length;j++)
		{
			System.out.print(" "+transpose[i][j]);
		}
		System.out.println();
	}
	
	
	
	
}
}
