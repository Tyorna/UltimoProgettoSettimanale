package com.example.demo;

import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.rilevamento.SistemaRilevamento;

@Component
public class obsRunner implements CommandLineRunner{
	@Override
	public void run(String... args) throws Exception {
//		Sonda sonda = new Sonda(1, 3, 60, 50);
		CentroAssistenza cn = new CentroAssistenza();
		SistemaRilevamento sr = new SistemaRilevamento(cn);
//		
//		Sonda sonda2 = new Sonda(3, 9, 60, 50);
//		sonda2.addSistemaControllo(sr);
//		sonda2.sendAllert(sonda2);
//
//		sonda.addSistemaControllo(sr);
//		sonda.sendAllert(sonda);
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
