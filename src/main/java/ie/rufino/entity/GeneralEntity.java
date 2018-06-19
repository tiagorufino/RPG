package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_general")
public class GeneralEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_general;

	public Integer getId_general() {
		return id_general;
	}

	public void setId_general(Integer id_general) {
		this.id_general = id_general;
	}
	
}
