package com.example.demo.rilevamento;

import com.example.demo.CentroAssistenza;

public abstract class ComunicazioneFactory {

	public Controllo contollo() {
		Controllo c = creaControllo();
		return c;
	}	
	public abstract Controllo creaControllo();
}
