package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_mental")
public class MentalEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_mental;
	
	@Column(name="percepcao")
	private Integer percepcao;
	
	@Column(name="inteligencia")
	private Integer inteligencia;
	
	@Column(name="raciocinio")
	private Integer raciocinio;

	public Integer getId_mental() {
		return id_mental;
	}

	public void setId_mental(Integer id_mental) {
		this.id_mental = id_mental;
	}

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
	
	
}
