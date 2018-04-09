package com.lab.streams;

import java.io.InputStream;

public abstract class InputStreamDecorator extends InputStream {
	protected InputStream decoratedStream;
	public InputStreamDecorator(InputStream stream){
		decoratedStream = stream;
	}
}
