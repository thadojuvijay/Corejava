package com.Remove_Duplicates_FromString_nd_StringArray;

public class ParagraphWordsDuplicate {

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
			
			if(pgh[i]!="0" && count!=1){
				System.out.println(pgh[i]+"--- word is repeated "+count+" time");
			}
			
			
		}
		
	}
	
	public static void convertGivenPghtoAscOrder(byte[] strbyte){
		 byte temp=0;
		  for(int i=0;i<strbyte.length;i++){
			  for(int j=i+1;j<strbyte.length;j++){
				  if(strbyte[i]>strbyte[j]){
					temp=strbyte[i];
				     strbyte[i]=strbyte[j];
				     strbyte[j]=temp;
				  }
			  }
				  
			  System.out.print(" "+ (char)strbyte[i]);
		  }
		  
		  
		  String ascStr=new String(strbyte);
		  System.out.println();
		  System.out.println("asending order string--- "+ ascStr);
		  
	}
	
	
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
				
				temp="";
				
			}
			
			System.out.println("ascorder-----"+strbytes[i]);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		String str="Hi hello This is java program This is some paragraph text. I write java program";
		
		//String str="hi jai hind hi jai jai hind";
		
		//String str="Z X S D E Y U P L H G C C S A W W Q O P M N V C D";
		
		//String str="ASDQWRYIOKMNCDFGHRE";
		
		String regex=" ";
		
		String[] split = str.split(regex);
		
		byte[] bytes = str.getBytes();
		
		/*for (byte b : bytes) {
			System.out.println("bytes---"+b);
		}
		char tempLet=(char) bytes[0];
		System.out.println("temp lett----"+tempLet);
     */
		
		//convertGivenPghtoAscOrder(bytes);
		
		
	/*	System.out.println(split+"---"+split.length);
        System.out.println(split[0]);		
		
		for(int i=0;i<split.length;i++){
			System.out.println(split[i]);
		}
	*/		
		
		//countWordsInPgh(split);
		
		setParaghWordToAscOrder(split);
		
		//String[] names={"Ajay","vijay","Balu","Ramu","Rk"};
		
		//setParaghWordToAscOrder(names);
		
		
	}
	
	
}
