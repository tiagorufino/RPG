package ie.rufino.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_vantagem")
public class VantagemEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_vantagem;
	
	@ManyToOne
	private AntecendentesEntity antecendentesEntity;
	
	@ManyToOne
	private DisciplinasEntity disciplinasEntity;
	
	@ManyToOne
	private VirtudesEntity virtudesEntity;

	public Integer getId_vantagem() {
		return id_vantagem;
	}

	public void setId_vantagem(Integer id_vantagem) {
		this.id_vantagem = id_vantagem;
	}

	public AntecendentesEntity getAntecendentesEntity() {
		return antecendentesEntity;
	}

	public void setAntecendentesEntity(AntecendentesEntity antecendentesEntity) {
		this.antecendentesEntity = antecendentesEntity;
	}

	public DisciplinasEntity getDisciplinasEntity() {
		return disciplinasEntity;
	}

	public void setDisciplinasEntity(DisciplinasEntity disciplinasEntity) {
		this.disciplinasEntity = disciplinasEntity;
	}

	public VirtudesEntity getVirtudesEntity() {
		return virtudesEntity;
	}

	public void setVirtudesEntity(VirtudesEntity virtudesEntity) {
		this.virtudesEntity = virtudesEntity;
	}
	
	
	
}
