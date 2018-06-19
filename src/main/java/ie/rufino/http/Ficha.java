package ie.rufino.http;

import ie.rufino.entity.TipoPlayer;

public class Ficha {

	public Ficha (){
		
	}
	
	public Ficha (String result){
		this.result = result;
	}
	
	private Enum<TipoPlayer> tipoPlayer;
	
	private Atributos atributos;
	
	private Integer nivel;
	
	private String result;
	
	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Enum<TipoPlayer> getTipoPlayer() {
		return tipoPlayer;
	}

	public void setTipoPlayer(Enum<TipoPlayer> tipoPlayer) {
		this.tipoPlayer = tipoPlayer;
	}

	public Atributos getAtributos() {
		return atributos;
	}

	public void setAtributos(Atributos atributos) {
		this.atributos = atributos;
	}
}
