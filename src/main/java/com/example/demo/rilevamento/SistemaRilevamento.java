package com.example.demo.rilevamento;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.CentroAssistenza;
import com.example.demo.Sonda;
import com.example.demo.SondaAllert;

import lombok.ToString;

@ToString 
public class SistemaRilevamento extends Controllo implements SondaAllert{
	private CentroAssistenza cAssistenza;
	
	public SistemaRilevamento(int controlloId, CentroAssistenza cAssistenza) {
		super (controlloId);
		this.cAssistenza = cAssistenza;
	}
	
	public SistemaRilevamento(int controlloId) {
		super (controlloId);
	}
	
	@Override
	public void receiveAllert(Sonda sonda) {
		System.out.println("Allarme ricevuto: ");
		if (sonda.getFumo() > 5) {
			System.out.println(" Allarme!! livello fumo: " + sonda.getFumo() + ", la sonda " + sonda.getId() + " alle coordinate " + sonda.getCoordinataX() +" " + sonda.getCoordinataY());
			cAssistenza.allerta(sonda);
				} else if(sonda.getFumo() == 0){
					System.out.println(" Livelli normali");
				} else {
			System.out.println(" Attenzione, livello fumo: " + sonda.getFumo() + ", possibile problema alla sonda " + sonda.getId() + " alle coordinate " + sonda.getCoordinataX() +" " + sonda.getCoordinataY());
		}
	}
}
