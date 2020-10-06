/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbancaires;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zakaria Nabil
 */
public class gestionClient extends javax.swing.JFrame {
   int pos = -1;
    /**
     * Creates new form gestionClient
     */
    static List <client>l=new ArrayList<client>();
    String [] metiers={"Ingénieur","Medecin","Commercant","Artisan","Agriculteur","Fonctionnaire Secteur Public",
        "Fonctionnaire Secteur Privé"};
    DefaultComboBoxModel  box=new DefaultComboBoxModel(metiers);
    DefaultTableModel ml=new DefaultTableModel();
    String [] col={"ID Client","Nom Du Client","Type","Fonction","Email","Tel","Date De Naissance","Adresse"};
    public gestionClient() {
        initComponents();
        this.cmb_fonction.setModel(box);
        ml.setColumnIdentifiers(col);
        this.jTable1.setModel(ml);
        this.buttonGroup1.add(this.particulier);
        this.buttonGroup1.add(this.entreprise);
        ///Import
                FileInputStream f=null;
              ObjectInputStream ff=null;
      
               try {
           
             f=new FileInputStream ("Liste Clients Banque.txt");
        } catch (FileNotFoundException ex) {
        }
       try {
          ff=new ObjectInputStream(f);
        } catch (IOException ex) {
        }
        try {
       l=(List<client>)ff.readObject();
          SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
       for(client e:l)
       {
      ml.addRow(new Object[]{e.getId(),e.getNom(),e.getTypeClient(),e.getFonction(),e.getEmail(),e.getTel(),df.format(e.getDateNaissance()),e.getAdresse()});
       
        }} catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
        try {
            ff.close();
        } catch (IOException ex) {
            Logger.getLogger(gestionClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_trier = new javax.swing.JButton();
        btn_supprimer = new javax.swing.JButton();
        btn_modifier = new javax.swing.JButton();
        btn_ajouter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_adresse = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        datenaissance = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cmb_fonction = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        particulier = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        entreprise = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Client", "Nom Du Client ", "Type ", "Fonction", "E-mail", "Num Télephone", "Date Naissance", "Adresse"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(0, 90, 740, 150);

        btn_trier.setBackground(new java.awt.Color(0, 102, 204));
        btn_trier.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btn_trier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbancaires/icons8-trier-les-réponses-32.png"))); // NOI18N
        btn_trier.setText("Trier");
        btn_trier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trierActionPerformed(evt);
            }
        });
        jPanel3.add(btn_trier);
        btn_trier.setBounds(590, 20, 140, 50);

        btn_supprimer.setBackground(new java.awt.Color(0, 102, 204));
        btn_supprimer.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btn_supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbancaires/user1-delete.png"))); // NOI18N
        btn_supprimer.setText("Supprimer");
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });
        jPanel3.add(btn_supprimer);
        btn_supprimer.setBounds(210, 20, 170, 50);

        btn_modifier.setBackground(new java.awt.Color(0, 102, 204));
        btn_modifier.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btn_modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbancaires/icons8-modifier-l'utilisateur-homme-32.png"))); // NOI18N
        btn_modifier.setText("Modifier");
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });
        jPanel3.add(btn_modifier);
        btn_modifier.setBounds(410, 20, 150, 50);

        btn_ajouter.setBackground(new java.awt.Color(0, 102, 204));
        btn_ajouter.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btn_ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbancaires/user1-add.png"))); // NOI18N
        btn_ajouter.setText("Ajouter");
        btn_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouterActionPerformed(evt);
            }
        });
        jPanel3.add(btn_ajouter);
        btn_ajouter.setBounds(10, 20, 160, 50);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 740, 260));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Adresse : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 364, 160, 50);

        txt_adresse.setColumns(20);
        txt_adresse.setRows(5);
        txt_adresse.setBorder(null);
        jScrollPane1.setViewportView(txt_adresse);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 360, 390, 70);

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Numéro De Télephone :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(5, 320, 150, 30);

        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-##-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(160, 320, 110, 30);

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jLabel6.setText("Date De Naissance :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 320, 130, 27);

        datenaissance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(datenaissance);
        datenaissance.setBounds(410, 320, 140, 30);

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sa Fonction :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 270, 130, 27);

        cmb_fonction.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        cmb_fonction.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingénieur", "Medecin", "Commercant", "Artisan", "Agriculteur", "Fonctionnaire Secteur Public", "Fonctionnaire Secteur Privé" }));
        cmb_fonction.setBorder(null);
        jPanel1.add(cmb_fonction);
        cmb_fonction.setBounds(120, 270, 150, 27);

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jLabel4.setText("Adresse Email     :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 270, 110, 30);

        txt_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(txt_email);
        txt_email.setBounds(410, 270, 140, 30);

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Type Du Client :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-3, 224, 130, 30);

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nom Du Client :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 180, 120, 30);

        txt_nom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(txt_nom);
        txt_nom.setBounds(130, 180, 160, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 204));
        jButton3.setText("Rechercher");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(300, 180, 110, 30);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbancaires/icons8-rendez-vous-périodique-24.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 390, 57, 33);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(null);

        particulier.setBackground(new java.awt.Color(255, 255, 255));
        particulier.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        particulier.setText("Particulier");
        jPanel2.add(particulier);
        particulier.setBounds(10, 10, 83, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(130, 220, 140, 40);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Gestion De La Clientèle ");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 0, 690, 140);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(null);

        entreprise.setBackground(new java.awt.Color(255, 255, 255));
        entreprise.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        entreprise.setText("Entreprise");
        entreprise.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(entreprise);
        entreprise.setBounds(10, 10, 90, 20);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(300, 220, 110, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbancaires/icons8-accueil-30.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 0, 50, 50);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouterActionPerformed
            
    String  tel =this.jFormattedTextField1.getText();
       
    boolean b=true;    
    
     
          for(client p:l)
        {
            if(p.getTel().equalsIgnoreCase(tel))
            {   
                b=false;
              
                JOptionPane.showMessageDialog(this, "Le Client Portant Le Numéro De Télephone "+tel+" Est Déjà Ajouté", "Remarque", 
                               JOptionPane.ERROR_MESSAGE);
                
            }
          
            
            
        }
          
            String nom = this.txt_nom.getText();
       
        String cat=null;
        if(this.entreprise.isSelected())
        cat="Entreprise";
        else
            if(this.particulier.isSelected())
        cat="Particulier";
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
         String fonction = (String) cmb_fonction.getSelectedItem();
         String email = this.txt_email.getText();
         Date datenaissance = this.datenaissance.getDate();
         String adresse = this.txt_adresse.getText();
         
      
         
      
        if(this.txt_nom.getText().equals("")||this.cmb_fonction.getSelectedItem().equals("")||this.txt_email.getText().equals("")||this.datenaissance.getDate()==null||this.txt_adresse.getText()==null)

        { JOptionPane.showMessageDialog(this,"Veuillez Remplir Tous Les Champs","Erreur Lors De La Saisie",JOptionPane.ERROR_MESSAGE);b=false;}

       
      
        
   
    client e =null;
     
        if(b)
         {
             e=new  client(nom,cat,fonction,email,tel,datenaissance,adresse);
            l.add(e);
            ml.addRow(new Object[]{e.getId(),e.getNom(),e.getTypeClient(),e.getFonction(),e.getEmail(),e.getTel(),df.format(e.getDateNaissance()),e.getAdresse()});
        }
           //// Save
          FileOutputStream f=null;
        ObjectOutputStream ff=null;
    
        

        try
        {
            f=new FileOutputStream ("Liste Clients Banque.txt");
            ff= new ObjectOutputStream(f);
            ff.writeObject(l);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        finally
        {
            try {
                 
                ff.close();
               
           }catch (IOException ex) {
            }
        
        }
    }//GEN-LAST:event_btn_ajouterActionPerformed
public int Rechercher()
    {  String nom = this.txt_nom.getText();
        int pos = -1;
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i).getNom().equalsIgnoreCase(nom))
                pos = i ;  
        }
          return pos ; 
    }  
    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
          int ligneselectionne=this.jTable1.getSelectedRow();
        int rep=JOptionPane.showConfirmDialog(this, "Étes Vous Sur De Vouloir Supprimer Le Client Portant Le Nom "+txt_nom.getText()+" ?","Suppression",JOptionPane.YES_NO_OPTION);
        if(rep==JOptionPane.YES_OPTION) 
        {ml.removeRow(ligneselectionne);
            l.remove(ligneselectionne);} 
        //// Save
          FileOutputStream f=null;
        ObjectOutputStream ff=null;
    
        

        try
        {
            f=new FileOutputStream ("Liste Clients Banque.txt");
            ff= new ObjectOutputStream(f);
            ff.writeObject(l);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        finally
        {
            try {
                 
                ff.close();
                
           }catch (IOException ex) {
            }
        
        }
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
                  
    String  tel =this.jFormattedTextField1.getText();
       
    boolean b=true;    
    
     
          for(client p:l)
        {
            if(p.getTel().equalsIgnoreCase(tel))
            {   
                b=false;
              
                JOptionPane.showMessageDialog(this, "Le Client Portant Le Numéro De Télephone "+tel+" Est Déjà Ajouté", "Remarque", 
                               JOptionPane.ERROR_MESSAGE);
                
            }
          
            
            
        }
          
            String nom = this.txt_nom.getText();
       
        String cat=null;
        if(this.entreprise.isSelected())
        cat="Entreprise";
        else
            if(this.particulier.isSelected())
        cat="Particulier";
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
         String fonction = (String) cmb_fonction.getSelectedItem();
         String email = this.txt_email.getText();
         Date datenaissance = this.datenaissance.getDate();
         String adresse = this.txt_adresse.getText();
         
      
         
      
       
     if(b==true)
        if(pos==-1)
  if (pos != -1)
{
  this.jTable1.removeRowSelectionInterval(pos, pos);
  pos = Rechercher();
}
if(pos ==-1)
{
    JOptionPane.showMessageDialog(this," Le Client Portant Le Nom \t"+txt_nom.getText()+"\t Est Introuvable ","Échec De La Modification",JOptionPane.ERROR_MESSAGE);
}
else
    
        {
            l.get(pos).setNom(nom);
            l.get(pos).setTypeClient(cat);
            l.get(pos).setFonction(fonction);
            l.get(pos).setEmail(email);
            l.get(pos).setTel(tel);
            l.get(pos).setDateNaissance(datenaissance);
            l.get(pos).setAdresse(adresse);
            
          
          ml.setValueAt(nom, pos, 1);
          ml.setValueAt(cat, pos, 2);
          ml.setValueAt(fonction, pos, 3);
          ml.setValueAt(email, pos, 4);
          ml.setValueAt(tel, pos, 5);
          ml.setValueAt(new SimpleDateFormat("dd/MM/yyyy").format(datenaissance), pos, 6);
          ml.setValueAt(adresse, pos,7 );

          
          
                                        
            
        }
  //// Save
          FileOutputStream f=null;
        ObjectOutputStream ff=null;
    
        

        try
        {
            f=new FileOutputStream ("Liste Clients Banque.txt");
            ff= new ObjectOutputStream(f);
            ff.writeObject(l);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        finally
        {
            try {
                 
                ff.close();
                JOptionPane.showMessageDialog(this, "Modification Enregistrée Dans Le Fichier ","Sauvegarde réussie", JOptionPane.INFORMATION_MESSAGE);
                 
           }catch (IOException ex) {
            }
        
        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void btn_trierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trierActionPerformed
      Collections.sort(l);
      Collections.reverse(l);

      ml.setRowCount(0);
         SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
          
      for(client e:l)
      {
          ml.addRow(new Object[]{e.getId(),e.getNom(),e.getTypeClient(),e.getFonction(),e.getEmail(),e.getTel(),df.format(e.getDateNaissance()),e.getAdresse()});
      }       
        //// Save
          FileOutputStream f=null;
        ObjectOutputStream ff=null;
    
        

        try
        {
            f=new FileOutputStream ("Liste Clients Banque.txt");
            ff= new ObjectOutputStream(f);
            ff.writeObject(l);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        finally
        {
            try {
                 
                ff.close();
                
           }catch (IOException ex) {
            }
        
        }
    }//GEN-LAST:event_btn_trierActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jFormattedTextField1.setText(null);
        this.txt_nom.setText(null);
   this. cmb_fonction.setSelectedIndex(0);
         this.txt_email.setText(null);
        this.datenaissance.setDate(null);
     this.txt_adresse.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          if(pos!=-1)
        this.jTable1.removeRowSelectionInterval(pos, pos);

    pos=Rechercher();
   if(pos==-1)
   {
       JOptionPane.showMessageDialog(this,"Client introuvable","Echec Recherche",JOptionPane.ERROR_MESSAGE);
   }
   else
   {
       
       this.txt_nom.setText(String.valueOf(l.get(pos).getNom()));
       this.cmb_fonction.setSelectedItem(String.valueOf(l.get(pos).getFonction()));
       this.txt_email.setText(l.get(pos).getEmail());
       this.jFormattedTextField1.setText(l.get(pos).getTel());
       this.datenaissance.setDate(l.get(pos).getDateNaissance());
       this.txt_adresse.setText(l.get(pos).getAdresse());
       if(l.get(pos).getTypeClient().equalsIgnoreCase("Entreprise"))
           this.entreprise.setSelected(true);
       else
           if(l.get(pos).getTypeClient().equalsIgnoreCase("Particulier")) 
           this.particulier.setSelected(true);
        this.jTable1.addRowSelectionInterval(pos, pos);
      
   }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    gestion_CarteBancaire.Menu m = new gestion_CarteBancaire.Menu();
    m.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajouter;
    private javax.swing.JButton btn_modifier;
    private javax.swing.JButton btn_supprimer;
    private javax.swing.JButton btn_trier;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_fonction;
    private com.toedter.calendar.JDateChooser datenaissance;
    private javax.swing.JRadioButton entreprise;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton particulier;
    private javax.swing.JTextArea txt_adresse;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nom;
    // End of variables declaration//GEN-END:variables
}