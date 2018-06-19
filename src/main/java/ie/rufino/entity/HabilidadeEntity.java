package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_habilidade")
public class HabilidadeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_habilidade;
	
	@ManyToOne
	private TalentoEntity talentoEntity;
	
	@ManyToOne
	private ConhecimentoEntity conhecimentoEntity;
	
	@ManyToOne
	private PericiaEntity periciaEntity;

	public Integer getId_habilidade() {
		return id_habilidade;
	}

	public void setId_habilidade(Integer id_habilidade) {
		this.id_habilidade = id_habilidade;
	}

	public TalentoEntity getTalentoEntity() {
		return talentoEntity;
	}

	public void setTalentoEntity(TalentoEntity talentoEntity) {
		this.talentoEntity = talentoEntity;
	}

	public ConhecimentoEntity getConhecimentoEntity() {
		return conhecimentoEntity;
	}

	public void setConhecimentoEntity(ConhecimentoEntity conhecimentoEntity) {
		this.conhecimentoEntity = conhecimentoEntity;
	}

	public PericiaEntity getPericiaEntity() {
		return periciaEntity;
	}

	public void setPericiaEntity(PericiaEntity periciaEntity) {
		this.periciaEntity = periciaEntity;
	}
}
