package com.lesson.javaexceptionbooks;

public class AutorException extends Exception{
	public  String autor;
	public AutorException( String autor) {
		super("l'autore deve avere almeno un carattere");	
	}
}
