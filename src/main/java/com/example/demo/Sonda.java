package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sonda {
	private Long id;
	private int fumo;
	private int  coordinataX;
	private int  coordinataY;
	
	public Sonda(Long id, int fumo, int coordinataX, int coordinataY) {
		this.id= id;
		this.fumo = fumo;
		this.coordinataX = coordinataX;
		this.coordinataY = coordinataY;
	}
	
	private List<SondaAllert> subscribers = new ArrayList<>();
	public void addSistemaControllo(SondaAllert subscriber) {
		this.subscribers.add(subscriber);
	}

	public void removeSistemaControllo(SondaAllert subscriber) {
		this.subscribers.remove(subscriber);
	}

	public void sendAllert(Sonda sonda) {
		for (SondaAllert subscriber : subscribers) {
			subscriber.receiveAllert(sonda);
		}
	}
}
