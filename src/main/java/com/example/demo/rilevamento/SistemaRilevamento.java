package com.example.demo.rilevamento;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.CentroAssistenza;
import com.example.demo.Sonda;
import com.example.demo.SondaAllert;

public class SistemaRilevamento extends SistemaRilevamentoBase implements SondaAllert{
	private int id;
	private CentroAssistenza cAssistenza;
	
	public SistemaRilevamento(CentroAssistenza cAssistenza) {
		this.cAssistenza = cAssistenza;
	}
	
	@Override
	public void receiveAllert(Sonda sonda) {
		System.out.println("Allarme ricevuto: ");
		if (sonda.getFumo() > 5) {
			System.out.println("Allarme!! livello fumo: " + sonda.getFumo() + ", la sonda " + sonda.getId() + " alle coordinate " + sonda.getCoordinataX() +" " + sonda.getCoordinataY());
			cAssistenza.allerta(sonda);
				} else {
			System.out.println("Attenzione, livello fumo: " + sonda.getFumo() + ", possibile problema alla sonda " + sonda.getId() + " alle coordinate " + sonda.getCoordinataX() +" " + sonda.getCoordinataY());
		}
	}

}
