package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_atributos")
public class AtributosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_atributos;
	
	@ManyToOne
	private FisicoEntity fisico;
	
	@ManyToOne
	private SocialEntity social;
	
	@ManyToOne
	private MentalEntity mentalEntity;

	public Integer getId_atributos() {
		return id_atributos;
	}

	public void setId_atributos(Integer id_atributos) {
		this.id_atributos = id_atributos;
	}

	public FisicoEntity getFisico() {
		return fisico;
	}

	public void setFisico(FisicoEntity fisico) {
		this.fisico = fisico;
	}

	public SocialEntity getSocial() {
		return social;
	}

	public void setSocial(SocialEntity social) {
		this.social = social;
	}

	public MentalEntity getMentalEntity() {
		return mentalEntity;
	}

	public void setMentalEntity(MentalEntity mentalEntity) {
		this.mentalEntity = mentalEntity;
	}
}
