package ie.rufino.http;

public class Atributos {

	private Fisico fisico;
	
	private Social social;
	
	private Mental mental;
	
	private Integer total;
	
	private Integer nivel;
	
	public Integer getNivel(){
		return nivel;
	}
	
	public void setNivel(Integer nivel){
		this.nivel = nivel;
	}
	
	public Integer getTotal(){
		return total;
	}

	public void setTotal(Integer total){
		this.total = total;
	}
	
	public Fisico getFisico() {
		return fisico;
	}

	public void setFisico(Fisico fisico) {
		this.fisico = fisico;
	}

	public Social getSocial() {
		return social;
	}

	public void setSocial(Social social) {
		this.social = social;
	}

	public Mental getMental() {
		return mental;
	}

	public void setMental(Mental mental) {
		this.mental = mental;
	}
	
}
