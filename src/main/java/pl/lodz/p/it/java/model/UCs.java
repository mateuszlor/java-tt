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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "UCs")
@TableGenerator(name = "UCsIdGen", table = "generator", pkColumnName = "class_name", valueColumnName = "id_range", pkColumnValue = "UCs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UCs.findAll", query = "SELECT u FROM UCs u"),
    @NamedQuery(name = "UCs.findById", query = "SELECT u FROM UCs u WHERE u.id = :id"),
    @NamedQuery(name = "UCs.findByName", query = "SELECT u FROM UCs u WHERE u.name = :name"),
    @NamedQuery(name = "UCs.findByPackageType", query = "SELECT u FROM UCs u WHERE u.packageType = :packageType"),
    @NamedQuery(name = "UCs.findByType", query = "SELECT u FROM UCs u WHERE u.type = :type")})
public class UCs implements Serializable, Element {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "UCsIdGen")
    @Column(name = "Id")
    private Integer id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Name")
    private String name;

    @Basic(optional = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "PackageType")
    private PackageType packageType;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Type")
    private String type;

    @NotNull
    @Column(name = "used")
    private boolean used = false;

    @JoinTable(name = "projectuc", joinColumns = {
        @JoinColumn(name = "uc", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "project", referencedColumnName = "id")})
    private Projects project;

    public UCs() {
    }

    public UCs(Integer id) {
        this.id = id;
    }

    public UCs(Integer id, String name, PackageType packageType, String type) {
        this.id = id;
        this.name = name;
        this.packageType = packageType;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        if (!(object instanceof UCs)) {
            return false;
        }
        UCs other = (UCs) object;
        if ((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.lodz.p.it.java.model.UCs[ id=" + id + " ]";
    }

}
