/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_CarteBancaire;

import gestionbancaires.client;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Zakaria Nabil
 */
public class infos_carte implements Comparable<infos_carte>,Serializable{
    private String civilité,nom,numcompte,type,style;
    private Date dateexpiration;

    public infos_carte(String civilité, String nom, Date dateexpiration, String numcompte, String type, String style) {
        this.civilité = civilité;
        this.nom = nom;
        this.numcompte = numcompte;
        this.type = type;
        this.style = style;
        this.dateexpiration = dateexpiration;
    }

    public String getCivilité() {
        return civilité;
    }

    public void setCivilité(String civilité) {
        this.civilité = civilité;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(String numcompte) {
        this.numcompte = numcompte;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Date getDateexpiration() {
        return dateexpiration;
    }

    public void setDateexpiration(Date dateexpiration) {
        this.dateexpiration = dateexpiration;
    }
    
      
    public int compareTo(infos_carte o) {
        
        return type.compareTo(o.type);
        
        
        

   }
}
