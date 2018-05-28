package com.List;


import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_add_data
{
public static void main(String[] args)
{

ArrayList<String> al=new ArrayList<>();
al.add(0,"cognizant");


al.add(1,"capgemini");

al.add(2,"capgemini");

System.out.println("lst  ---- "+al);

al.add(1,"1111capgemini");
System.out.println("lst  ---- "+al);

al.add(0,"infosys");


//if you write the 2nd index before 1st index then we will get the indexoutofBondException
System.out.println("lst  ---- "+al);


//Collections.shuffle(al);










ArrayList<String> al2=new ArrayList<>();
al2.add("hello");
al2.add("hello");


al.addAll(al2);
System.out.println(al);



ArrayList<String> al3=new ArrayList<>();
al3.add("bye");
al3.add("bye");

al.addAll(1,al3);
System.out.println(al);




}
} 