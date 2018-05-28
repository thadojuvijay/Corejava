package com.serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization_Example 
{
public static void main(String[] args) throws IOException {
	
	Employee employee=new Employee(1,"vijay");
	
	FileOutputStream fos=new FileOutputStream("file.txt");
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fos);
	
	// public final void writeObject(Object obj) throws IOException {}
	//writes the specified object to the ObjectOutputStream.
	objectOutputStream.writeObject(employee); 
	
	//public void flush() throws IOException {}
	//flushes the current output stream.
	objectOutputStream.flush();
	
	//public void close() throws IOException {}
	//closes the current output stream.
	objectOutputStream.close();
	System.out.println("sucess");
	
}
}
