package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_fisico")
public class FisicoEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_fisico;
	
	@Column(name="forca")
	private Integer forca;
	
	@Column(name="destreza")
	private Integer destreza;
	
	@Column(name="vigor")
	private Integer vigor;

	public Integer getId_fisico() {
		return id_fisico;
	}

	public void setId_fisico(Integer id_fisico) {
		this.id_fisico = id_fisico;
	}

	public Integer getForca() {
		return forca;
	}

	public void setForca(Integer forca) {
		this.forca = forca;
	}

	public Integer getDestreza() {
		return destreza;
	}

	public void setDestreza(Integer destreza) {
		this.destreza = destreza;
	}

	public Integer getVigor() {
		return vigor;
	}

	public void setVigor(Integer vigor) {
		this.vigor = vigor;
	}
}
