package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.rilevamento.ComunicazioneFactory;
import com.example.demo.rilevamento.Controllo;
import com.example.demo.rilevamento.SistemaRilevamento;

@Component
public class obsRunner implements CommandLineRunner{
	
	private final ComunicazioneFactory cFactory;
	
	@Autowired
	public obsRunner (ComunicazioneFactory cFactory) {
		this.cFactory = cFactory;
	}
	
	@Override
	public void run(String... args) throws Exception {
		CentroAssistenza cn = new CentroAssistenza(1);
		SistemaRilevamento sr = new SistemaRilevamento(1, cn);
		Controllo cont = cFactory.creaControllo();
		System.out.println(cn);
		System.out.println(cont);
		Random rnd = new Random();
		for (int i = 0; i < 11; i++) {
			Long randomN = rnd.nextLong(100000);
			int randomN1 = rnd.nextInt(9);
			int randomNX = rnd.nextInt(100) +1;
			int randomNY = rnd.nextInt(100) + 1;
			Long id = randomN;
			int liv = randomN1;
			int cordX = randomNX;
			int cordY = randomNY;
			Sonda nSonda = new Sonda (id, liv, cordX, cordY);
			nSonda.addSistemaControllo(sr);
			nSonda.sendAllert(nSonda);
		}
	}
}
