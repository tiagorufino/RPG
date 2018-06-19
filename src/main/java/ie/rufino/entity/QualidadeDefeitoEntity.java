package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_quantidade_defeito")
public class QualidadeDefeitoEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_quantidade_defeito;
	
	@Column(name="descricao")
	private String descricao;
	
	@ManyToOne
	private GeneralEntity generalEntity;

	public Integer getId_quantidade_defeito() {
		return id_quantidade_defeito;
	}

	public void setId_quantidade_defeito(Integer id_quantidade_defeito) {
		this.id_quantidade_defeito = id_quantidade_defeito;
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
