package com.kanerika_pvt_ltd;

import java.util.ArrayList;
import java.util.List;

public class Example1 
{
public static void main(String[] args) {
	
	List<String> list=new ArrayList<>();
	
	List<String>list2=list;
	list.add("vijay");
	list2.add("uday");
	System.out.println(list2);
}
}
