package com.lesson.javaexceptionbooks;

public class TitleException extends Exception{
	public  String title;
	public TitleException( String title) {
		super("il titolo deve avere almeno un carattere");	
	}
}
