/*
 * To change this license header, choose License Headers in Project Properties.
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
@Table(name = "resistors")
@TableGenerator(name = "ResistorsIdGen", table = "generator", pkColumnName = "class_name", valueColumnName = "id_range", pkColumnValue = "Resistors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resistors.findAll", query = "SELECT r FROM Resistors r"),
    @NamedQuery(name = "Resistors.findById", query = "SELECT r FROM Resistors r WHERE r.id = :id"),
    @NamedQuery(name = "Resistors.findByR", query = "SELECT r FROM Resistors r WHERE r.r = :r"),
    @NamedQuery(name = "Resistors.findByUnit", query = "SELECT r FROM Resistors r WHERE r.unit = :unit")})
public class Resistors implements Serializable, Element {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ResistorsIdGen")
    @Column(name = "Id")

    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "R")

    private int r;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Unit")
    private String unit;

    @NotNull
    @Column(name = "used")
    private boolean used = false;

    @JoinTable(name = "projectresistor", joinColumns = {
        @JoinColumn(name = "resistor", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "project", referencedColumnName = "id")})
    private Projects project;

    public Resistors() {
    }

    public Resistors(Integer id) {
        this.id = id;
    }

    public Resistors(Integer id, int r, String unit) {
        this.id = id;
        this.r = r;
        this.unit = unit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setUnit(ResistanceUnit unit) {
        this.unit = unit.toString();
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
        // TODO: Warning - this method won't work in the case the id fields are
        // not set
        if (!(object instanceof Resistors)) {
            return false;
        }
        Resistors other = (Resistors) object;
        if ((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.lodz.p.it.java.model.Resistors[ id=" + id + " ]";
    }

}
