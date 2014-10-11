/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author song
 */
@Entity
@Table(name = "fulltime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fulltime.findAll", query = "SELECT f FROM Fulltime f"),
    @NamedQuery(name = "Fulltime.findById", query = "SELECT f FROM Fulltime f WHERE f.id = :id"),
    @NamedQuery(name = "Fulltime.findByName", query = "SELECT f FROM Fulltime f WHERE f.name = :name"),
    @NamedQuery(name = "Fulltime.findByCity", query = "SELECT f FROM Fulltime f WHERE f.city = :city")})
public class Fulltime implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;

    public Fulltime() {
    }

    public Fulltime(Integer id) {
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        if (!(object instanceof Fulltime)) {
            return false;
        }
        Fulltime other = (Fulltime) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javafxapplication2.Fulltime[ id=" + id + " ]";
    }
    
}
