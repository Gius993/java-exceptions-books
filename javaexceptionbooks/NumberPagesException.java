package com.lesson.javaexceptionbooks;

public class NumberPagesException extends Exception{
	public  int pageNumber;
	public NumberPagesException(int pageNumber) {
		super("Le pagine devono essere positive");	
		
	
	}
}
