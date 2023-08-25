package com.example.demo;

public class SistameRilevamento implements SondaAllert{

	@Override
	public void receiveAllert(Sonda sonda) {
		System.out.println("Allarme ricevuto: ");
		if (sonda.getFumo() > 5) {
			System.out.println("Allarme!! livello fumo: " + sonda.getFumo() + ", la sonda " + sonda.getId() + " alle coordinate " + sonda.getCoordinataX() +" " + sonda.getCoordinataY());
		} else {
			System.out.println("Attenzione, livello fumo: " + sonda.getFumo() + ", possibile problema alla sonda " + sonda.getId() + " alle coordinate " + sonda.getCoordinataX() +" " + sonda.getCoordinataY());
		}
	}

}
