package com.sortingPrograms;

public class Sort_Paragraph_in_AscendingOrder_String 
{
	
public static void setParaghWordToAscOrder(String[] strbytes){
		
		String temp="";
		
		for(int i=0;i<strbytes.length;i++){
			for(int j=i+1;j<strbytes.length;j++){
				
				byte firstCh =(byte) strbytes[i].charAt(0);
				
				byte secondCh =(byte) strbytes[j].charAt(0);
				if(firstCh>secondCh){
					temp=strbytes[i];
					strbytes[i]=strbytes[j];
					strbytes[j]=temp;
				}
				
			}
			
			System.out.println("ascorder-----"+strbytes[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		String str="Hi hello This is java program This is some paragraph text. I write java program";
		String[] split = str.split(" ");
		System.out.println("After Sorting paragraph");
		setParaghWordToAscOrder(split);
	}
}
