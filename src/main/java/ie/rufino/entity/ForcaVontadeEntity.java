package ie.rufino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_forca_vontade")
public class ForcaVontadeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_forca_vontade;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@OneToOne
	private GeneralEntity generalEntity;

	public Integer getId_forca_vontade() {
		return id_forca_vontade;
	}

	public void setId_forca_vontade(Integer id_forca_vontade) {
		this.id_forca_vontade = id_forca_vontade;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public GeneralEntity getGeneralEntity() {
		return generalEntity;
	}

	public void setGeneralEntity(GeneralEntity generalEntity) {
		this.generalEntity = generalEntity;
	}
}
