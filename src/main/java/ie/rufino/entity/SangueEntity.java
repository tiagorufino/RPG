package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_sangue")
public class SangueEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_sangue;
	
	@Column(name="quantity")
	private Integer quantidade;
	
	@OneToOne
	private GeneralEntity generalEntity;

	public Integer getId_sangue() {
		return id_sangue;
	}

	public void setId_sangue(Integer id_sangue) {
		this.id_sangue = id_sangue;
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
