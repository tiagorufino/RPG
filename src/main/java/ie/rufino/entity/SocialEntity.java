package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_social")
public class SocialEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_social;
	
	@Column(name="carisma")
	private Integer carisma;
	
	@Column(name="manipulacao")
	private Integer manipulacao;
	
	@Column(name="aparencia")
	private Integer aparencia;

	public Integer getId_social() {
		return id_social;
	}

	public void setId_social(Integer id_social) {
		this.id_social = id_social;
	}

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
	
}
