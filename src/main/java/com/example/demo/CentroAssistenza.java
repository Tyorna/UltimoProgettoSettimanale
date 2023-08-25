package com.example.demo;

public class CentroAssistenza {
	private int id;
	
	public CentroAssistenza(int id) {
		this.id = id;
	}

	public void allerta(Sonda sonda) {
		System.out.println("Emergenza:");
		System.out.println("http://hostialarm/?idsonda" + sonda.getId() + "&lat=" + sonda.getCoordinataX() +
				"&lon=" + sonda.getCoordinataY() + "&smokelevel=" + sonda.getFumo());
}

	@Override
	public String toString() {
		return "CentroAssistenza [id=" + id + "]";
	}
	
}
