/*
 * To change this license header, choose License Headers in Projects Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    @NamedQuery(name = "Projects.findById", query = "SELECT p FROM Projects p WHERE p.id = :id")})
public class Projects implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ProjectsIdGen")
    @Column(name = "Id")
    private Integer id;

    @Size(max = 2147483647)
    @Column(name = "Description")
    private String description;

    @Basic(optional = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ProjectStatus status = ProjectStatus.planned;

    @OneToMany(mappedBy = "project")
    private List<Capacitors> capacitors = new ArrayList<>();

    @OneToMany(mappedBy = "project")
    private List<Resistors> resistors = new ArrayList<>();

    @OneToMany(mappedBy = "project")
    private List<UCs> ucs = new ArrayList<>();

    public Projects() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Capacitors> getCapacitors() {
        return capacitors;
    }

    public void setCapacitors(List<Capacitors> capacitors) {
        this.capacitors = capacitors;
    }

    public List<Resistors> getResistors() {
        return resistors;
    }

    public void setResistors(List<Resistors> resistors) {
        this.resistors = resistors;
    }

    public List<UCs> getUcs() {
        return ucs;
    }

    public void setUcs(List<UCs> ucs) {
        this.ucs = ucs;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public void addCapacitor(Capacitors capacitor) {
        this.capacitors.add(capacitor);
    }

    public void addResistor(Resistors resistors) {
        this.resistors.add(resistors);
    }

    public void addUC(UCs uc) {
        this.ucs.add(uc);
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
