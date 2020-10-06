/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_Transaction;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Zakaria Nabil
 */
public class transaction implements Serializable {
  private String nomemeteur,nomrecepteur,numcompte1,numcompte2;
  private Date datetransaction;
  private double montant;

    public transaction(String nomemeteur, String numcompte1, String nomrecepteur, String numcompte2, double montant, Date datetransaction) {
        this.nomemeteur = nomemeteur;
        this.nomrecepteur = nomrecepteur;
        this.numcompte1 = numcompte1;
        this.numcompte2 = numcompte2;
        this.datetransaction = datetransaction;
        this.montant = montant;
    }

  
  
    public String getNomemeteur() {
        return nomemeteur;
    }

    public void setNomemeteur(String nomemeteur) {
        this.nomemeteur = nomemeteur;
    }

    public String getNomrecepteur() {
        return nomrecepteur;
    }

    public void setNomrecepteur(String nomrecepteur) {
        this.nomrecepteur = nomrecepteur;
    }

    public String getNumcompte1() {
        return numcompte1;
    }

    public void setNumcompte1(String numcompte1) {
        this.numcompte1 = numcompte1;
    }

    public String getNumcompte2() {
        return numcompte2;
    }

    public void setNumcompte2(String numcompte2) {
        this.numcompte2 = numcompte2;
    }

    public Date getDatetransaction() {
        return datetransaction;
    }

    public void setDatetransaction(Date datetransaction) {
        this.datetransaction = datetransaction;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
  
  
  
  
          }
