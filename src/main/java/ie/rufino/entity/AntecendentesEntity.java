package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_antecedentes")
public class AntecendentesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_antecendente;
	
	@Column(name="name")
	private String nameAntecendente;

	public Integer getId_antecendente() {
		return id_antecendente;
	}

	public void setId_antecendente(Integer id_antecendente) {
		this.id_antecendente = id_antecendente;
	}

	public String getNameAntecendente() {
		return nameAntecendente;
	}

	public void setNameAntecendente(String nameAntecendente) {
		this.nameAntecendente = nameAntecendente;
	}
}
