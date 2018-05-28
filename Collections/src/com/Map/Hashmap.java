package com.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import oracle.net.aso.h;

public class Hashmap
{
public static void main(String[] args) {
	HashMap<Integer, String> hashMap=new HashMap<>();
	
	
	
	hashMap.put(78222, "hkjabdj");
	hashMap.put(1, "vijay");
	hashMap.put(1, "rk");
	hashMap.put(768, "vijay");
	hashMap.put(3, "tata");
	//hashMap.put(null, null);
	//hashMap.put(null, "ganga");
	hashMap.put(7896444, "hjakjhjhjahjhjka");
	hashMap.put(5, "100");
	hashMap.put(6, "gaghjga");
	hashMap.put(5678, "hyde");
	
	System.out.println(hashMap);
	
	
	
	
	
	

	boolean bool = hashMap.containsKey(1);
	System.out.println(bool);
	
System.out.println("data is available"+hashMap.isEmpty());
	
Set<Integer> keySet = hashMap.keySet();

System.out.println("keys---"+keySet);

   Collection<String> values = hashMap.values();
   
   System.out.println("values ----"+ values);
	System.out.println(hashMap);
	
/*	
	Iterator<Integer> iterator = keySet.iterator();
	
	while(iterator.hasNext()){
		int key=iterator.next();
		String val = hashMap.get(key);
		System.out.println(key+"--------"+val);
	}
	
*/
	

	Set<Integer>kd=hashMap.keySet();
	
	Iterator<Integer> ir=kd.iterator();
	while(ir.hasNext())
	{
		Integer next = ir.next();
		
		System.out.println( "============="+hashMap.get(next));
		
	}
	
	
	
	
}
}
