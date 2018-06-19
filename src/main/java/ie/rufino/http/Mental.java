package ie.rufino.http;

public class Mental {
	
	public Mental(){
		
	}
	
	public Mental(Integer percepcao, Integer inteligencia, Integer raciocinio, Integer nivel) {
		super();
		this.percepcao = percepcao;
		this.inteligencia = inteligencia;
		this.raciocinio = raciocinio;
		this.nivel = nivel;
	}

	private Integer percepcao;
	
	private Integer inteligencia;
	
	private Integer raciocinio;
	
	private Integer nivel;

	public Integer getPercepcao() {
		return percepcao;
	}

	public void setPercepcao(Integer percepcao) {
		this.percepcao = percepcao;
	}

	public Integer getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Integer getRaciocinio() {
		return raciocinio;
	}

	public void setRaciocinio(Integer raciocinio) {
		this.raciocinio = raciocinio;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
}
