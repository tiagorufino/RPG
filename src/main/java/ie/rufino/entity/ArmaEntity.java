package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_arma")
public class ArmaEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_arma;
	
	@Column(name="arma_fogo")
	private Integer arma_fogo;
	
	@Column(name="arma_branca")
	private Integer arma_branca;

	public Integer getId_arma() {
		return id_arma;
	}

	public void setId_arma(Integer id_arma) {
		this.id_arma = id_arma;
	}

	public Integer getArma_fogo() {
		return arma_fogo;
	}

	public void setArma_fogo(Integer arma_fogo) {
		this.arma_fogo = arma_fogo;
	}

	public Integer getArma_branca() {
		return arma_branca;
	}

	public void setArma_branca(Integer arma_branca) {
		this.arma_branca = arma_branca;
	}
	
}
