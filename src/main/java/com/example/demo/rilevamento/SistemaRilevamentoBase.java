package com.example.demo.rilevamento;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.example.demo.Sonda;

@Component
public class SistemaRilevamentoBase extends ComunicazioneFactory{
	@Override
	public Controllo creaControllo() {
	 Random rnd = new Random();
	 SistemaRilevamento sr = new SistemaRilevamento(rnd.nextInt(1000));
	 return sr;
	}
}
