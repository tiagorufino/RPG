package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class FichaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_ficha;
	
	@Column(name="tipo")
	private Enum<TipoPlayer> tipoPlayer;
	
	@OneToOne
	private AtributosEntity atributosEntity;
	
	@OneToOne
	private VantagemEntity vantagemEntity;
	
	@OneToOne
	private HabilidadeEntity habilidadeEntity;
	
	@OneToOne
	private GeneralEntity generalEntity;

	public Integer getId_ficha() {
		return id_ficha;
	}

	public void setId_ficha(Integer id_ficha) {
		this.id_ficha = id_ficha;
	}

	public Enum<TipoPlayer> getTipoPlayer() {
		return tipoPlayer;
	}

	public void setTipoPlayer(Enum<TipoPlayer> tipoPlayer) {
		this.tipoPlayer = tipoPlayer;
	}

	public AtributosEntity getAtributosEntity() {
		return atributosEntity;
	}

	public void setAtributosEntity(AtributosEntity atributosEntity) {
		this.atributosEntity = atributosEntity;
	}

	public VantagemEntity getVantagemEntity() {
		return vantagemEntity;
	}

	public void setVantagemEntity(VantagemEntity vantagemEntity) {
		this.vantagemEntity = vantagemEntity;
	}

	public HabilidadeEntity getHabilidadeEntity() {
		return habilidadeEntity;
	}

	public void setHabilidadeEntity(HabilidadeEntity habilidadeEntity) {
		this.habilidadeEntity = habilidadeEntity;
	}

	public GeneralEntity getGeneralEntity() {
		return generalEntity;
	}

	public void setGeneralEntity(GeneralEntity generalEntity) {
		this.generalEntity = generalEntity;
	}	
}
