package com.Remove_Duplicates_FromString_nd_StringArray;

public class stringCountingDupLettAndDisplayDupLett {
	
	public static void main(String[] args) {
		
		String word="haihaijavahaijavahowareyou";
		
		char[] chArr = word.toCharArray();
		
		int dupCount=1;
		
		for(int i=0;i<chArr.length;i++)
		{

			   dupCount=1; 
			for(int j=i+1;j<chArr.length;j++)
			{
				
				if(chArr[i]==chArr[j])
				{
					dupCount++;
					chArr[j]='0';
				}
				
			}
			   if(chArr[i]!='0'){
				   System.out.println("Letter  "+chArr[i]+" is repeated " +dupCount+" times");
			   }
			   
		}
			
		
		
		
		
		
		
	}

}
