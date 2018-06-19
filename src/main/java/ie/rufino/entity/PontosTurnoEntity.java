package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_pontos_turno")
public class PontosTurnoEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_pontos_turno;
	
	@Column(name="quantity")
	private Integer quantidade;
	
	@OneToOne
	private GeneralEntity generalEntity;

	public Integer getId_pontos_turno() {
		return id_pontos_turno;
	}

	public void setId_pontos_turno(Integer id_pontos_turno) {
		this.id_pontos_turno = id_pontos_turno;
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
