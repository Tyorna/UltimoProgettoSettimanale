package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sonda {
	
	private int fumo;
	private int  coordinataX;
	private int  coordinataY;
	
	public Sonda(int fumo, int coordinataX, int coordinataY) {
		this.fumo = fumo;
		this.coordinataX = coordinataX;
		this.coordinataY = coordinataY;
	}
}
