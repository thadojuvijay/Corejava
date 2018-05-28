package com.practice_delete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Palindrome_number_or_not
{
public static void main(String[] args) throws IOException {
	
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	int number = reader.read();
	int reverse;
	int sum=0;
	while(number>0)
	{
		reverse=number%10;
        sum=(sum*10)+reverse;
        number=number/10;
	}
	
}
}
