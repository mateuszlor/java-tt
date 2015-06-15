/*
 * To change this license header, choose License Headers in Projects Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mateusz
 */
@Entity
@Table(name = "Projects")
@TableGenerator(name = "ProjectsIdGen", table = "generator", pkColumnName = "class_name", valueColumnName = "id_range", pkColumnValue = "Projects")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "Projects.findAll", query = "SELECT p FROM Projects p"),
		@NamedQuery(name = "Projects.findByDescription", query = "SELECT p FROM Projects p WHERE p.description = :description"),
		@NamedQuery(name = "Projects.findById", query = "SELECT p FROM Projects p WHERE p.id = :id") })
public class Projects implements Serializable {
	private static final long serialVersionUID = 1L;
	@Size(max = 2147483647)
	@Column(name = "Description")
	private String description;
	@Id
	@Basic(optional = false)
	@NotNull
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "ProjectsIdGen")
	@Column(name = "Id")
	private Integer id;

	// bi-directional many-to-one association to Projectcapacitor
	@OneToMany(mappedBy = "projectBean")
	private List<Projectcapacitor> projectcapacitors;

	// bi-directional many-to-one association to Projectuc
	@OneToMany(mappedBy = "projectBean")
	private List<Projectuc> projectucs;

	// bi-directional many-to-one association to Projectresistor
	@OneToMany(mappedBy = "projectBean")
	private List<Projectresistor> projectresistors;

	public Projects() {
	}

	public Projects(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Projectcapacitor> getProjectcapacitors() {
		return this.projectcapacitors;
	}

	public void setProjectcapacitors(List<Projectcapacitor> projectcapacitors) {
		this.projectcapacitors = projectcapacitors;
	}

	public Projectcapacitor addProjectcapacitor(
			Projectcapacitor projectcapacitor) {
		getProjectcapacitors().add(projectcapacitor);
		projectcapacitor.setProjectBean(this);

		return projectcapacitor;
	}

	public Projectcapacitor removeProjectcapacitor(
			Projectcapacitor projectcapacitor) {
		getProjectcapacitors().remove(projectcapacitor);
		projectcapacitor.setProjectBean(null);

		return projectcapacitor;
	}

	public List<Projectuc> getProjectucs() {
		return this.projectucs;
	}

	public void setProjectucs(List<Projectuc> projectucs) {
		this.projectucs = projectucs;
	}

	public Projectuc addProjectuc(Projectuc projectuc) {
		getProjectucs().add(projectuc);
		projectuc.setProjectBean(this);

		return projectuc;
	}

	public Projectuc removeProjectuc(Projectuc projectuc) {
		getProjectucs().remove(projectuc);
		projectuc.setProjectBean(null);

		return projectuc;
	}

	public List<Projectresistor> getProjectresistors() {
		return this.projectresistors;
	}

	public void setProjectresistors(List<Projectresistor> projectresistors) {
		this.projectresistors = projectresistors;
	}

	public Projectresistor addProjectresistor(Projectresistor projectresistor) {
		getProjectresistors().add(projectresistor);
		projectresistor.setProjectBean(this);

		return projectresistor;
	}

	public Projectresistor removeProjectresistor(Projectresistor projectresistor) {
		getProjectresistors().remove(projectresistor);
		projectresistor.setProjectBean(null);

		return projectresistor;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Projects)) {
			return false;
		}
		Projects other = (Projects) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "pl.lodz.p.it.java.model.Projects[ id=" + id + " ]";
	}

}
