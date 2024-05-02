package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Rettangolo dati = new Rettangolo(0, 0);
		
		System.out.println("Inserire la dimensione della base del rettangolo");
		int base = input.nextInt();
		
		System.out.println("Inserire la dimensione dell'altezza del rettangolo");
		int altezza = input.nextInt();
		
		dati.setBase(base);
		dati.setAltezza(altezza);
//		System.out.println(dati.getBase());
//		System.out.println(dati.getAltezza());
		
		dati.calcoloArea();
		System.out.println("Il Perimetro del Rettangolo è: " + dati.calcoloPerimetro());
		
		
		
	}

}
