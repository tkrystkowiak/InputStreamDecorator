package com.lab.streams;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

public class LowerCaseInputStream extends InputStreamDecorator{
	
	private ArrayList<Integer> readList;
	private int streamCount;
	
	public LowerCaseInputStream(InputStream stream) throws IOException{
		
		super(stream);
		readList = new ArrayList<Integer>();
		streamCount = 0;
		readDecoratedStream();
		lowerCase();
		
	}
	
	private void readDecoratedStream() throws IOException{
		
		int a;
		while ((a = decoratedStream.read()) >= 0) {	readList.add(a); }
	
	}
	
	private void lowerCase(){
		
		for(int i = 0 ;  i<readList.size(); i++){
			
			int element = readList.get(i);
			
			if(Character.isUpperCase(element)){
				
				readList.set(i, Character.toLowerCase(element));
				
			}
			
		}
		
	}
	
	
	@Override
	public int read() throws IOException {
		
		if(streamCount<readList.size()){
			streamCount++;
			return readList.get(streamCount -1);
			
		}
		else{
			
			return -1;
		
		}
	}
}
