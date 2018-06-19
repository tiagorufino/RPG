package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_talento")
public class TalentoEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_talento;
	
	@Column(name="prontidao")
	private Integer prontidao;
	
	@Column(name="esporte")
	private Integer esporte;
	
	@Column(name="briga")
	private Integer briga;
	
	@Column(name="esquiva")
	private Integer esquiva;
	
	@Column(name="empatia")
	private Integer empatia;
	
	@Column(name="expressao")
	private Integer expressao;
	
	@Column(name="intimidacao")
	private Integer intimidacao;
	
	@Column(name="lideranca")
	private Integer lideranca;
	
	@Column(name="manha")
	private Integer manha;
	
	@Column(name="labia")
	private Integer labia;

	public Integer getId_talento() {
		return id_talento;
	}

	public void setId_talento(Integer id_talento) {
		this.id_talento = id_talento;
	}

	public Integer getProntidao() {
		return prontidao;
	}

	public void setProntidao(Integer prontidao) {
		this.prontidao = prontidao;
	}

	public Integer getEsporte() {
		return esporte;
	}

	public void setEsporte(Integer esporte) {
		this.esporte = esporte;
	}

	public Integer getBriga() {
		return briga;
	}

	public void setBriga(Integer briga) {
		this.briga = briga;
	}

	public Integer getEsquiva() {
		return esquiva;
	}

	public void setEsquiva(Integer esquiva) {
		this.esquiva = esquiva;
	}

	public Integer getEmpatia() {
		return empatia;
	}

	public void setEmpatia(Integer empatia) {
		this.empatia = empatia;
	}

	public Integer getExpressao() {
		return expressao;
	}

	public void setExpressao(Integer expressao) {
		this.expressao = expressao;
	}

	public Integer getIntimidacao() {
		return intimidacao;
	}

	public void setIntimidacao(Integer intimidacao) {
		this.intimidacao = intimidacao;
	}

	public Integer getLideranca() {
		return lideranca;
	}

	public void setLideranca(Integer lideranca) {
		this.lideranca = lideranca;
	}

	public Integer getManha() {
		return manha;
	}

	public void setManha(Integer manha) {
		this.manha = manha;
	}

	public Integer getLabia() {
		return labia;
	}

	public void setLabia(Integer labia) {
		this.labia = labia;
	}
}