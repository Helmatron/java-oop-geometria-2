package org.lessons.java.geometria;

import java.util.Scanner;

import java.security.PublicKey;

public class Rettangolo {
	
	
	private int base;
	private int altezza;

	public Rettangolo(int base, int altezza) {
			this.base = base;
			this.altezza = altezza;
	}

	public void setBase() {
		if (this.base == 0) {
			this.base = scanner.nextInt();
		} else {
			this.base = 0;
		}
		
	}

	public void setAltezza(int nuovaAltezza) {
		if (nuovaAltezza != 0) {
			this.altezza = nuovaAltezza;
		}
	}

	public void calcoloArea() {
		if (this.base != 0 && this.altezza != 0) {
			int area = this.base * this.altezza;
			System.out.println("L'area del rettangolo è: " + area);
		}
	}
	
	public void calcoloPerimetro() {
		if (this.base != 0 && this.altezza != 0) {
			int perimetro = (this.base * 2) + (this.altezza * 2);
			System.out.println("Il perimetro del rettangolo è: " + perimetro);
		}
	}
	
}
