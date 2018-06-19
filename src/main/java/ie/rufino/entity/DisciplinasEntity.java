package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_disciplinas")
public class DisciplinasEntity {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String nomeDisciplinas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}
	
	
}
