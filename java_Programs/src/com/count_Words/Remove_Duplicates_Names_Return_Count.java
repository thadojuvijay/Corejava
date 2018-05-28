package com.count_Words;

public class Remove_Duplicates_Names_Return_Count 
{
	public static void countWordsInPgh(String[] pgh){
		int count=1;
		for(int i=0;i<pgh.length;i++){
			count=1;
			for(int j=i+1;j<pgh.length;j++){
				//System.out.println("i>>>"+pgh[i]+"---j>>>"+pgh[j]);
				//System.out.println("count before---"+count);
				if(pgh[i].equals(pgh[j])){         // here == operator not working
					count=count+1;
					pgh[j]="0";
				}
			}
			
			if(pgh[i]!="0"){
				System.out.println(pgh[i]+"--- word is repeated "+count+" time");
			}
				
		}
				
	}
	
	
	public static void main(String[] args) 
	{
		String []name={"vijay","vijay","Ajay","Ajay","rajesh","uday"};
		countWordsInPgh(name);
	}
}
