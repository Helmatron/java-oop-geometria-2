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

	public int getBase() {
		return this.base;
	}

	public void setBase(int nuovaBase) {
		this.base = nuovaBase;
	}

	public int getAltezza() {
		return this.altezza;
	}

	public void setAltezza(int nuovaAltezza) {
		this.altezza = nuovaAltezza;
	}

	public void calcoloArea() {
		if (this.base != 0 && this.altezza != 0) {
			System.out.println("L'area del Rettangolo è: " + (this.base * this.altezza));
		} else {
			System.out.println("inserire un valore diverso da zero");
			
		}
		
	}

	public int calcoloPerimetro() {
		return (this.base * 2) + (this.altezza * 2);
	}

}
