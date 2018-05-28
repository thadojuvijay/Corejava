package com.SingleDimensionArray;

public class ForEachLoop1 
{
public static void main(String[] args) {
	
	int []a={10,26,3728,282};
	
	for (int i : a) {
		System.out.println(i);
	}
	
	
	
	int [][]b={{65,78,78,766},{16,27,26}};
	for (int[] is : b) {
		
		for (int i : is) {
			System.out.println(i);
		}
	}
}
}
