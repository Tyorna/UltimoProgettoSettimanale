package com.example.demo.rilevamento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Controllo {
   protected int controlloId;
   
   public Controllo(int controlloId) {
	   this.controlloId = controlloId;
   }
}
