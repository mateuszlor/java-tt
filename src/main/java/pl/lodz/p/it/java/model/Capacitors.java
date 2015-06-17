/*
 * To change this license header, choose License Headers in Projects Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "Capacitors")
@TableGenerator(name = "CapacitorsIdGen", table = "generator", pkColumnName = "class_name", valueColumnName = "id_range", pkColumnValue = "Capacitors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Capacitors.findAll", query = "SELECT c FROM Capacitors c"),
    @NamedQuery(name = "Capacitors.findById", query = "SELECT c FROM Capacitors c WHERE c.id = :id"),
    @NamedQuery(name = "Capacitors.findByC", query = "SELECT c FROM Capacitors c WHERE c.c = :c"),
    @NamedQuery(name = "Capacitors.findByUnit", query = "SELECT c FROM Capacitors c WHERE c.unit = :unit")})
public class Capacitors implements Serializable, Element {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "CapacitorsIdGen")
    @Column(name = "Id")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "C")
    private int c;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 2147483647)
    @Column(name = "Unit")
    private String unit;
    
    @NotNull
    @Column(name = "used")
    private boolean used = false;

    @JoinTable(name = "projectcapacitor", joinColumns = {
        @JoinColumn(name = "capacitor", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "project", referencedColumnName = "id")})
    private Projects project;

    public Capacitors() {
    }

    public Capacitors(Integer id) {
        this.id = id;
    }

    public Capacitors(Integer id, int c, String unit) {
        this.id = id;
        this.c = c;
        this.unit = unit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(CapacityUnit unit) {
        this.unit = unit.toString();
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Capacitors)) {
            return false;
        }
        Capacitors other = (Capacitors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.lodz.p.it.java.model.Capacitors[ id=" + id + " ]";
    }

}
