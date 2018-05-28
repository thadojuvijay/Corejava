package com.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Convert_StringArray_into_List {

	public static void main(String[] args) {
		
		String[]a={"hai","vijay","how are you"};
		
		//method 1
		List<String> asList = Arrays.asList(a);
		System.out.println("asList(String[])===============================");
		for (String e : asList) {
			System.out.println(e);
		}
		
         //Method 2
		System.out.println("Collectons.addAll(List,String[])===================");
		  List<String> anotherList = new ArrayList<String>();   
            Collections.addAll(anotherList, a);
            for (String f : anotherList) {
				System.out.println(f);
			}

            //method3 manually we are adding one by one string into ArrayList
            System.out.println("need to take one-one String and store into list ");
            ArrayList<String> arraylist= new ArrayList<String>();
    	    String array[] = {"Text1","Text2","Text3","Text4"};   
    	    for(int i =0;i<array.length;i++)
                {
           /* We are adding each array's element to the ArrayList*/
    		 arraylist.add(array[i]);
    	    }

    	    /*ArrayList content*/
    	    for(String str: arraylist)
    	    {
    	         System.out.println(str);
    	    }
	}

}
