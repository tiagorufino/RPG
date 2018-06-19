package ie.rufino.http;

public class Fisico {
	
	public Fisico(){
	}

	public Fisico(Integer forca, Integer destreza, Integer vigor, Integer nivel){
		this.destreza = destreza;
		this.forca = forca;
		this.vigor = vigor;
		this.nivel = nivel;
	}
	
	private Integer forca;
	
	private Integer destreza;
	
	private Integer vigor;
	
	private Integer nivel;
	
	
	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getForca() {
		return forca;
	}

	public void setForca(Integer forca) {
		this.forca = forca;
	}

	public Integer getDestreza() {
		return destreza;
	}

	public void setDestreza(Integer destreza) {
		this.destreza = destreza;
	}

	public Integer getVigor() {
		return vigor;
	}

	public void setVigor(Integer vigor) {
		this.vigor = vigor;
	}
}
