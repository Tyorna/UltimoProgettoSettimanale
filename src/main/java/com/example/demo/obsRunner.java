package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class obsRunner implements CommandLineRunner{
	@Override
	public void run(String... args) throws Exception {
		Sonda sonda = new Sonda(1, 3, 60, 50);
		CentroAssistenza cn = new CentroAssistenza();
		SistameRilevamento sr = new SistameRilevamento();

		sonda.addSistemaControllo(sr);
		sonda.sendAllert(sonda);
	}
}
