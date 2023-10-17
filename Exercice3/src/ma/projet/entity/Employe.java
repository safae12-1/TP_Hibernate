/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entity;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author  hachem safae
 */
@Entity
@Table(name = "Employe")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private int telephone;

    @OneToMany(mappedBy="employe")
    private List <Projet> projets;

    public Employe() {
    }

    public Employe(String nom, String prenom, int telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getTelephone() {
        return telephone;
    }

    public List<Projet> getProjets() {
        return projets;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }
    
    
    
    
}
