package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.rilevamento.SistemaRilevamento;

@Component
public class obsRunner implements CommandLineRunner{
	@Override
	public void run(String... args) throws Exception {
		Sonda sonda = new Sonda(1, 3, 60, 50);
		CentroAssistenza cn = new CentroAssistenza();
		SistemaRilevamento sr = new SistemaRilevamento(cn);
		
		Sonda sonda2 = new Sonda(3, 9, 60, 50);
		sonda2.addSistemaControllo(sr);
		sonda2.sendAllert(sonda2);

		sonda.addSistemaControllo(sr);
		sonda.sendAllert(sonda);
	}
}
