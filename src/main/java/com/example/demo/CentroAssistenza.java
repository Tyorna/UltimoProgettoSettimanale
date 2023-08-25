package com.example.demo;

public class CentroAssistenza {
	private Long id;
	
	public void allerta(Sonda sonda) {
		System.out.println("Emergenza:");
		System.out.println("http://hostialarm/?idsonda" + sonda.getId() + "&lat=" + sonda.getCoordinataX() +
				"&lon=" + sonda.getCoordinataY() + "&smokelevel=" + sonda.getFumo());
}
}
