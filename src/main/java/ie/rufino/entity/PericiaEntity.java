package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_pericia")
public class PericiaEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_pericia;
	
	@Column(name="empatia_animal")
	private Integer empatia_animal; 
	
	@Column(name="oficio")
	private Integer oficio;
	
	@Column(name="conducao")
	private Integer conducao;
	
	@Column(name="etiqueta")
	private Integer etiqueta;
	
	@ManyToOne
	private ArmaEntity id_arma;
	
	@Column(name="performace")
	private Integer performace;
	
	@Column(name="seguranca")
	private Integer seguranca;
	
	@Column(name="furtividade")
	private Integer furtividade;
	
	@Column(name="sobrevivencia")
	private Integer sobrevivencia;

	public Integer getId_pericia() {
		return id_pericia;
	}

	public void setId_pericia(Integer id_pericia) {
		this.id_pericia = id_pericia;
	}

	public Integer getEmpatia_animal() {
		return empatia_animal;
	}

	public void setEmpatia_animal(Integer empatia_animal) {
		this.empatia_animal = empatia_animal;
	}

	public Integer getOficio() {
		return oficio;
	}

	public void setOficio(Integer oficio) {
		this.oficio = oficio;
	}

	public Integer getConducao() {
		return conducao;
	}

	public void setConducao(Integer conducao) {
		this.conducao = conducao;
	}

	public Integer getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Integer etiqueta) {
		this.etiqueta = etiqueta;
	}

	public ArmaEntity getId_arma() {
		return id_arma;
	}

	public void setId_arma(ArmaEntity id_arma) {
		this.id_arma = id_arma;
	}

	public Integer getPerformace() {
		return performace;
	}

	public void setPerformace(Integer performace) {
		this.performace = performace;
	}

	public Integer getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(Integer seguranca) {
		this.seguranca = seguranca;
	}

	public Integer getFurtividade() {
		return furtividade;
	}

	public void setFurtividade(Integer furtividade) {
		this.furtividade = furtividade;
	}

	public Integer getSobrevivencia() {
		return sobrevivencia;
	}

	public void setSobrevivencia(Integer sobrevivencia) {
		this.sobrevivencia = sobrevivencia;
	}
	
}