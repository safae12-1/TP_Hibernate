/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author hachem safae
 */
@Embeddable
public class EmployeTachePK implements Serializable{
    private int employe;
    private int tache;

    public EmployeTachePK() {
    }

    public EmployeTachePK(int employe, int tache) {
        this.employe = employe;
        this.tache = tache;
    }

    public int getEmploye() {
        return employe;
    }

    public int getTache() {
        return tache;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }

    public void setTache(int tache) {
        this.tache = tache;
    }
    
}
