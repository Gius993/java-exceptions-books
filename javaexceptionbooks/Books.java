package com.lesson.javaexceptionbooks;

public class Books {
	// Attributi libro
	private String titolo;
	private int numeroPagine;
	private String autore;
	private String editore;
	// Costruttore
	public Books (String titolo, int numeroPagine, String autore, String editore) throws NumberPagesException, TitleException, AutorException {
		super();
		validateTitle(titolo);
		this.titolo = titolo;
		validateNumberPages(numeroPagine);
		this.numeroPagine = numeroPagine;
		validateAutor(autore);
		this.autore = autore;
		this.editore = editore;
		
	}
	
  // Metodi validazioni exception
	public void validateNumberPages(int numeroPagine) throws NumberPagesException{
		if(numeroPagine < 0) {
			throw new NumberPagesException(numeroPagine);
		}
	}
	public void validateTitle(String titolo) throws TitleException{
		if(titolo.length() <= 0) {
			throw new TitleException(titolo);
		}
	}
	public void validateAutor(String autore) throws AutorException{
		if(autore.length() <= 0) {
			throw new AutorException(autore);
		}
	}
	//metodi set
	public void setNumeroPagine(int numeroPagine) throws NumberPagesException{
		
		validateNumberPages(numeroPagine);
		this.numeroPagine = numeroPagine;
		
	}
	public void setTitolo(String titolo) throws TitleException{
		validateTitle(titolo);
		this.titolo = titolo;
	}
	public void setAutore(String autore) throws AutorException{
		validateAutor(autore);
		
		this.autore = autore;
	}
	public void setEditore(String editore)  {
		this.editore = editore;
	}
	// Metodi get
	public String getTitolo() {
		
		return titolo;
	}
	public int getPagine() {
		return numeroPagine;
	}
	public String getAutore() {
		return autore;
	}
	public String getEditore() {
		return editore;
	}
	

	
}
