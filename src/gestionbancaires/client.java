/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbancaires;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Zakaria
 */
public class client implements Comparable<client>, Serializable {
    
    private int id;
    private String nom,fonction,adresse,tel,email,typeClient;
    private Date dateNaissance;
    static int compteur=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public client(String nom,String typeClient, String fonction, String email, String tel,  Date dateNaissance, String adresse) {
       
        compteur+=1;
        this.id = compteur;
        this.nom = nom;
        this.fonction = fonction;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.typeClient = typeClient;
        this.dateNaissance = dateNaissance;
    }
    
    public int compareTo(client o) {
        
        return typeClient.compareTo(o.typeClient);
        
        
        

   }
    
}
