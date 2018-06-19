package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_vitalidade")
public class VitalidadeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_vitalidade;
	
	@Column(name="quantity")
	private Integer quantidade;
	
	@OneToOne
	private GeneralEntity generalEntity;

	public Integer getId_vitalidade() {
		return id_vitalidade;
	}

	public void setId_vitalidade(Integer id_vitalidade) {
		this.id_vitalidade = id_vitalidade;
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
