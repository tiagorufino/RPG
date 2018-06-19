package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_Player")
public class PlayerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_Player;
	
	@Column(name="name")
	private String name_Player;
	
	@Column(name="nick_name")
	private String nick_name;
	
	@Column(name="tipo")
	private Enum<TipoPlayer> tipoPlayer;
	
	@Column(name="id_user")
	private Integer id_user;

	public Integer getId_Player() {
		return id_Player;
	}

	public void setId_Player(Integer id_Player) {
		this.id_Player = id_Player;
	}

	public String getName_Player() {
		return name_Player;
	}

	public void setName_Player(String name_Player) {
		this.name_Player = name_Player;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public Enum<TipoPlayer> getTipoPlayer() {
		return tipoPlayer;
	}

	public void setTipoPlayer(Enum<TipoPlayer> tipoPlayer) {
		this.tipoPlayer = tipoPlayer;
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}
}