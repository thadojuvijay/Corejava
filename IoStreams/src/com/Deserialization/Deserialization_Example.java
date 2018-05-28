package com.Deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.serialization.Employee;

public class Deserialization_Example 
{
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	
	//public ObjectInputStream(InputStream in) throws IOException {}
	//creates an ObjectInputStream that reads from the specified InputStream.
	
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.txt"));
	
	//public final Object readObject() throws IOException, ClassNotFoundException{}
	//reads an object from the input stream.
	
	Object object = ois.readObject();
	
	
	String name = object.getClass().getName();
	System.out.println(name);
	
	Employee employee=(Employee)object;
	System.out.println(employee.msg());
System.out.println(employee.getEno());
System.out.println(employee.getName());
	
}
}
