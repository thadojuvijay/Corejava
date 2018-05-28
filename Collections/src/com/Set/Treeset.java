package com.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset 
{
public static void main(String[] args)
{
TreeSet<Integer> set=new TreeSet<>();

/**
 *  TreeSet does not allow duplicates.
 */
set.add(1);
set.add(1);
System.out.println("not allow duplicates=============="+set);

/**
 * does not allows null values
 */
set.add(8);
//set.add(null);
System.out.println(set);

/**
 * treeSet follows only assending order output
 */
set.add(57);
set.add(23);
set.add(65);
set.add(9);
set.add(7);
System.out.println(set);
Iterator<Integer> iterator = set.iterator();
Integer first = set.first();
System.out.println(first);
while(iterator.hasNext()){
	System.out.println(iterator.next());

}
System.out.println(set.last());
//System.out.println(set.remove(65));
System.out.println(set);

System.out.println(0x10+10+010);
int a,b,c;
b=10;
a=b=c=20;
System.out.println(a);
}
}
