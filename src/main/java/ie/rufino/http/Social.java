package ie.rufino.http;

public class Social {
	
	public Social(){
		
	}
	
	public Social(Integer carisma, Integer manipulacao, Integer aparencia, Integer nivel) {
		super();
		this.nivel = nivel;
		this.carisma = carisma;
		this.manipulacao = manipulacao;
		this.aparencia = aparencia;
	}

	private Integer nivel;
	
	private Integer carisma;
	
	private Integer manipulacao;
	
	private Integer aparencia;

	public Integer getCarisma() {
		return carisma;
	}

	public void setCarisma(Integer carisma) {
		this.carisma = carisma;
	}

	public Integer getManipulacao() {
		return manipulacao;
	}

	public void setManipulacao(Integer manipulacao) {
		this.manipulacao = manipulacao;
	}

	public Integer getAparencia() {
		return aparencia;
	}

	public void setAparencia(Integer aparencia) {
		this.aparencia = aparencia;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
}
