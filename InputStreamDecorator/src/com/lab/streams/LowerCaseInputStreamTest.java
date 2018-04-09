package com.lab.streams;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try{
		
			InputStream in = new LowerCaseInputStream(new DataInputStream(new FileInputStream("test.txt")));

			int c;
	    // reading input stream
			while ((c = in.read()) >= 0) {	System.out.print((char)c);}
	    
		}
		catch(FileNotFoundException e){
			
			System.out.print("There is no file with that name.");
			
		}
		
	}

}
