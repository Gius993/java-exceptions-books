package com.lesson.javaexceptionbooks;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroLibri = 0;
		try {
			System.out.println("Ciao quanti libri vuoi comprare?");
			numeroLibri = Integer.parseInt(scan.nextLine());
			
		} catch(NumberFormatException e) {
			System.out.println("Devi inserire un numero e non lettere");
		}
		
		Books [] libri = new Books[numeroLibri];
		
		for(int i = 0; i < libri.length; i++) {
			int count= i+1;
			System.out.println("Ciao dimmi il titolo");
			String titolo = scan.nextLine();
			System.out.println("Ciao dimmi il numero delle pagine");
			int numeroPagine = scan.nextInt();
			System.out.println("Ciao dimmi l'autore");
			String autore = scan.nextLine();
			System.out.println("Ciao dimmi l'editore");
			String editore = scan.nextLine();
			try {
			libri[i] = new Books(titolo, numeroPagine, autore, editore);
			} catch(NumberPagesException e) {
				System.out.println(e.getMessage());
			
			}catch(TitleException ep) {
				System.out.println(ep.getMessage());
			}catch(AutorException ea){
				System.out.println(ea.getMessage());
			}catch(Exception end) {
				System.out.println("Si e verificato un errore" + end.getMessage());
			}finally {
				System.out.println("fine sessione");
				scan.close();
			}
		}
		for(int i = 0; i < libri.length; i++) {
			int counter = i+1;
			System.out.println("il libro che hai scelto: " + 
					 libri[i].getTitolo() + 
					 libri[i].getPagine() + 
					 libri[i].getAutore() + 
					 libri[i].getEditore());
		}
	
	}
}
