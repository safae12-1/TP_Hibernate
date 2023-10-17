/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entity;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author  hachem safae
 */
@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "marque")
    private String marque;
    @Column(name = "ref")
    private String ref;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "dateAchat")
    private Date dateAchat;
    @Column(name = "prix")
    private int prix;
    @Column(name = "designation")
    private String designation;

    public Produit() {
    }

    public Produit(String marque, String ref, Date dateAchat, int prix, String designation) {
        this.marque = marque;
        this.ref = ref;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getRef() {
        return ref;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public int getPrix() {
        return prix;
    }

    public String getDesignation() {
        return designation;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    
    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", marque=" + marque + ", ref=" + ref + ", dateAchat=" + dateAchat + ", prix=" + prix + ", designation=" + designation + '}';
    }
    
    
    
    
    
}
