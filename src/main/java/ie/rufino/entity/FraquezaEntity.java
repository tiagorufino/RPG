package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_fraqueza")
public class FraquezaEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_fraqueza;
	
	@Column(name="descricao")
	private String descricao;
	
	@ManyToOne
	private GeneralEntity generalEntity;

	public Integer getId_fraqueza() {
		return id_fraqueza;
	}

	public void setId_fraqueza(Integer id_fraqueza) {
		this.id_fraqueza = id_fraqueza;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public GeneralEntity getGeneralEntity() {
		return generalEntity;
	}

	public void setGeneralEntity(GeneralEntity generalEntity) {
		this.generalEntity = generalEntity;
	}

}
