/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author margauxmannaerts
 */
@Entity
@Table(name = "bloodSugar")
@NamedQueries({
    @NamedQuery(name = "BloodSugar.findAll", query = "SELECT b FROM BloodSugar b"),
    @NamedQuery(name = "BloodSugar.findByIdBSugar", query = "SELECT b FROM BloodSugar b WHERE b.idBSugar = :idBSugar"),
    @NamedQuery(name = "BloodSugar.findByBloodSugar", query = "SELECT b FROM BloodSugar b WHERE b.bloodSugar = :bloodSugar"),
    @NamedQuery(name = "BloodSugar.findByRegisterDateTime", query = "SELECT b FROM BloodSugar b WHERE b.registerDateTime = :registerDateTime")})
public class BloodSugar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBSugar")
    private Integer idBSugar;
    @Basic(optional = false)
    @Column(name = "bloodSugar")
    private float bloodSugar;
    @Basic(optional = false)
    @Column(name = "registerDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private String registerDateTime;
    @JoinColumn(name = "idPatient", referencedColumnName = "idPatient")
    @ManyToOne(optional = false)
    private Integer idPatient;

    public BloodSugar() {
    }

    public BloodSugar(Integer idBSugar) {
        this.idBSugar = idBSugar;
    }

    public BloodSugar(Integer idBSugar, float bloodSugar, String registerDateTime, Integer idPatient) {
        this.idBSugar = idBSugar;
        this.bloodSugar = bloodSugar;
        this.registerDateTime = registerDateTime;
        this.idPatient = idPatient;
    }

    public Integer getIdBSugar() {
        return idBSugar;
    }

    public void setIdBSugar(Integer idBSugar) {
        this.idBSugar = idBSugar;
    }

    public float getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(float bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBSugar != null ? idBSugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BloodSugar)) {
            return false;
        }
        BloodSugar other = (BloodSugar) object;
        if ((this.idBSugar == null && other.idBSugar != null) || (this.idBSugar != null && !this.idBSugar.equals(other.idBSugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "["  + idBSugar + "] " + bloodSugar + "   [" + idPatient + "]   (" + registerDateTime + ")";
    }
    
    
    
}
