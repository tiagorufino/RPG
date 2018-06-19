package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_humanidade")
public class HumanidadeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_humanidade;
	
	@Column(name="quantity")
	private Integer quantidade;
	
	@OneToOne
	private GeneralEntity generalEntity;

	public Integer getId_humanidade() {
		return id_humanidade;
	}

	public void setId_humanidade(Integer id_humanidade) {
		this.id_humanidade = id_humanidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public GeneralEntity getGeneralEntity() {
		return generalEntity;
	}

	public void setGeneralEntity(GeneralEntity generalEntity) {
		this.generalEntity = generalEntity;
	}
	
	
}
