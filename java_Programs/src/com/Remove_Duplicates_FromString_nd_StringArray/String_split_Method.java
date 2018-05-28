package com.Remove_Duplicates_FromString_nd_StringArray;

public class String_split_Method
{

	public static void main(String[] args) {
		
		//split method will used slipt each string or each character and it 
		//returns String[]

		String s="viiiijayy";
		
String[] split = s.split("");//String[]split={"v","i","i","i","i","j","a","y","y"}
		System.out.println(split);
		
		for (String string : split) {
			
			System.out.println(string);
		}
		
		
		String[] split2 = s.split(s);//String[] split2={"viiiijayy"};
		System.out.println("split2============"+split2);
		for(String r:split2)
		{
			System.out.println(r);
		}
		
		
		
	}
}
