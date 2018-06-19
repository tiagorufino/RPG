package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_conhecimento")
public class ConhecimentoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_conhecimento;
	
	@Column(name="academico")
	private Integer academico;
	
	@Column(name="computador")
	private Integer computador;
	
	@Column(name="financa")
	private Integer financa;
	
	@Column(name="investigacao")
	private Integer investigacao;
	
	@Column(name="direito")
	private Integer direito;
	
	@Column(name="linguistica")
	private Integer linguistica;
	
	@Column(name="medicina")
	private Integer medicina;
	
	@Column(name="ocultismo")
	private Integer ocultismo;
	
	@Column(name="politica")
	private Integer politica;
	
	@Column(name="ciencias")
	private Integer ciencias;

	public Integer getId_conhecimento() {
		return id_conhecimento;
	}

	public void setId_conhecimento(Integer id_conhecimento) {
		this.id_conhecimento = id_conhecimento;
	}

	public Integer getAcademico() {
		return academico;
	}

	public void setAcademico(Integer academico) {
		this.academico = academico;
	}

	public Integer getComputador() {
		return computador;
	}

	public void setComputador(Integer computador) {
		this.computador = computador;
	}

	public Integer getFinanca() {
		return financa;
	}

	public void setFinanca(Integer financa) {
		this.financa = financa;
	}

	public Integer getInvestigacao() {
		return investigacao;
	}

	public void setInvestigacao(Integer investigacao) {
		this.investigacao = investigacao;
	}

	public Integer getDireito() {
		return direito;
	}

	public void setDireito(Integer direito) {
		this.direito = direito;
	}

	public Integer getLinguistica() {
		return linguistica;
	}

	public void setLinguistica(Integer linguistica) {
		this.linguistica = linguistica;
	}

	public Integer getMedicina() {
		return medicina;
	}

	public void setMedicina(Integer medicina) {
		this.medicina = medicina;
	}

	public Integer getOcultismo() {
		return ocultismo;
	}

	public void setOcultismo(Integer ocultismo) {
		this.ocultismo = ocultismo;
	}

	public Integer getPolitica() {
		return politica;
	}

	public void setPolitica(Integer politica) {
		this.politica = politica;
	}

	public Integer getCiencias() {
		return ciencias;
	}

	public void setCiencias(Integer ciencias) {
		this.ciencias = ciencias;
	}
}
