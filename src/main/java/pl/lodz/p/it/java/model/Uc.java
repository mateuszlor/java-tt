package pl.lodz.p.it.java.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ucs database table.
 * 
 */
@Entity
@Table(name="ucs")
@NamedQuery(name="Uc.findAll", query="SELECT u FROM Uc u")
public class Uc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;

	private String name;

	private String packagetype;

	private String type;

	public Uc() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackagetype() {
		return this.packagetype;
	}

	public void setPackagetype(String packagetype) {
		this.packagetype = packagetype;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}