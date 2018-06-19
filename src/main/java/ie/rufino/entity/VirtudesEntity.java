package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_virtudes")
public class VirtudesEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_virtudes;
	
	@Column(name="consciencia")
	private Integer consicencia;
	
	@Column(name="instinto")
	private Integer instinto;
	
	@Column(name="coragem")
	private Integer coragem;

	public Integer getId_virtudes() {
		return id_virtudes;
	}

	public void setId_virtudes(Integer id_virtudes) {
		this.id_virtudes = id_virtudes;
	}

	public Integer getConsicencia() {
		return consicencia;
	}

	public void setConsicencia(Integer consicencia) {
		this.consicencia = consicencia;
	}

	public Integer getInstinto() {
		return instinto;
	}

	public void setInstinto(Integer instinto) {
		this.instinto = instinto;
	}

	public Integer getCoragem() {
		return coragem;
	}

	public void setCoragem(Integer coragem) {
		this.coragem = coragem;
	}
	
}
