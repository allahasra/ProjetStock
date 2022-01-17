/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import basedonnees.BD;
import basedonnees.Parametres;
import basedonnees.ResultSetTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ISRAEL
 */
public class GestionProduits extends javax.swing.JFrame {

    ResultSet rs;
    BD db;
    public GestionProduits() {
        db = new BD(new Parametres().HOST_DB, new Parametres().USERNAME_DB, 
        new Parametres().PASSWORD_DB, new Parametres().IPHOST, new Parametres().PORT);
        initComponents();
        table();
    }

    public void table(){
        String a[] ={"nom","quantite","prix","fournisseur"};
        rs= db.querySelect(a,"produit");
        tableGestion.setModel(new ResultSetTableModel(rs));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableGestion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_quitter = new javax.swing.JButton();
        btn_ajout = new javax.swing.JButton();
        btn_modifier = new javax.swing.JButton();
        btn_supprimer = new javax.swing.JButton();
        btn_recherche = new javax.swing.JButton();
        txt_recherche = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_quantite = new javax.swing.JTextField();
        txt_prix = new javax.swing.JTextField();
        txt_fournisseur = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        btn_rec_ind = new javax.swing.JButton();
        combo_recherche = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableGestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nom Produit", "Quantité", "Prix", "fournisseur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGestionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGestion);
        if (tableGestion.getColumnModel().getColumnCount() > 0) {
            tableGestion.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("VOICI LA LISTE DES PRODUITS");

        btn_quitter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_quitter.setForeground(new java.awt.Color(0, 153, 153));
        btn_quitter.setText("QUITTER");
        btn_quitter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        btn_quitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_quitterMouseClicked(evt);
            }
        });

        btn_ajout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ajout.setForeground(new java.awt.Color(0, 153, 153));
        btn_ajout.setText("Ajouter");
        btn_ajout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        btn_ajout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ajoutMouseClicked(evt);
            }
        });

        btn_modifier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_modifier.setForeground(new java.awt.Color(0, 153, 153));
        btn_modifier.setText("Modifier");
        btn_modifier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        btn_modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modifierMouseClicked(evt);
            }
        });

        btn_supprimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_supprimer.setForeground(new java.awt.Color(0, 153, 153));
        btn_supprimer.setText("Supprimer");
        btn_supprimer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        btn_supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_supprimerMouseClicked(evt);
            }
        });

        btn_recherche.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_recherche.setForeground(new java.awt.Color(0, 153, 153));
        btn_recherche.setText("Rechercher");
        btn_recherche.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        btn_recherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rechercheMouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Actualiser");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Nom");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Quantité");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Prix");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Fournisseur");

        btn_rec_ind.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_rec_ind.setForeground(new java.awt.Color(0, 153, 153));
        btn_rec_ind.setText("Recherche Indexer");
        btn_rec_ind.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        combo_recherche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nom", "Quantite", "Prix", "Fournisseur" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_fournisseur, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(txt_quantite, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_nom, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_prix))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_supprimer))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_rec_ind, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(combo_recherche, 0, 123, Short.MAX_VALUE)
                                            .addComponent(txt_recherche)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_quitter, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_rec_ind, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_quantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Actualiser(){
        txt_nom.setText("");
        txt_quantite.setText("");
        txt_prix.setText("");
        txt_fournisseur.setText("");
    }
    private void btn_quitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quitterMouseClicked
        dispose();
    }//GEN-LAST:event_btn_quitterMouseClicked

    private void btn_ajoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajoutMouseClicked
        if(txt_nom.getText().equals("")|| txt_quantite.getText().equals("")|| 
           txt_prix.getText().equals("") || txt_fournisseur.getText().equals("")){
           JOptionPane.showMessageDialog(this, "veillez remplir tous les champs");
           Actualiser();
        }else{
            String[] colon={"nom","quantite","prix","fournisseur"};
            String[] inf={txt_nom.getText(),txt_quantite.getText(),txt_prix.getText(),
                txt_fournisseur.getText()};
            System.out.println(db.queryInsert("produit", colon, inf));
            table();
            Actualiser();
        }
    }//GEN-LAST:event_btn_ajoutMouseClicked

    private void btn_modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modifierMouseClicked
         if(txt_nom.getText().equals("")|| txt_quantite.getText().equals("")|| 
           txt_prix.getText().equals("") || txt_fournisseur.getText().equals("")){
           JOptionPane.showMessageDialog(this, "veillez remplir tous les champs");
           Actualiser();
        }else{
            String[] colon={"nom","quantite","prix","fournisseur"};
            String[] inf={txt_nom.getText(),txt_quantite.getText(),txt_prix.getText(),txt_fournisseur.getText()};
            String id=String.valueOf(tableGestion.getValueAt(tableGestion.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("produit", colon, inf, "id='"+id+"'"));
            table();
            Actualiser();
        }
    }//GEN-LAST:event_btn_modifierMouseClicked

    private void btn_supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supprimerMouseClicked
        String id=String.valueOf(tableGestion.getValueAt(tableGestion.getSelectedRow(), 0));
        if(JOptionPane.showConfirmDialog(this,"etes vous sûr de vouloir supprimer ce produit?",
                "Attention",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            db.queryDelete("produit", "id="+id);
        }else{
            return;
        }
        table();
    }//GEN-LAST:event_btn_supprimerMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Actualiser();
        table();
    }//GEN-LAST:event_jButton2MouseClicked

    private void tableGestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGestionMouseClicked
        txt_nom.setText(String.valueOf(tableGestion.getValueAt(tableGestion.getSelectedRow(), 1)));
        txt_quantite.setText(String.valueOf(tableGestion.getValueAt(tableGestion.getSelectedRow(), 2)));
        txt_prix.setText(String.valueOf(tableGestion.getValueAt(tableGestion.getSelectedRow(), 3)));
        txt_fournisseur.setText(String.valueOf(tableGestion.getValueAt(tableGestion.getSelectedRow(), 4)));
    }//GEN-LAST:event_tableGestionMouseClicked

    private void btn_rechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rechercheMouseClicked
        if(txt_recherche.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Entrez une information!");
        }else{
            if(combo_recherche.getSelectedItem().equals("nom")){
                rs=db.querySelectAll("produit", "nom LIKE '%"+txt_recherche.getText()+"%'");
                tableGestion.setModel(new ResultSetTableModel(rs));
            }else if(combo_recherche.getSelectedItem().equals("quantite")){
                rs=db.querySelectAll("produit", "quantite LIKE '%"+txt_recherche.getText()+"%'");
                tableGestion.setModel(new ResultSetTableModel(rs));
            }else if(combo_recherche.getSelectedItem().equals("prix")){
                rs=db.querySelectAll("produit", "prix LIKE '%"+txt_recherche.getText()+"%'");
                tableGestion.setModel(new ResultSetTableModel(rs));
            }else if(combo_recherche.getSelectedItem().equals("fournisseur")){
                rs=db.querySelectAll("produit", "fournisseur LIKE '%"+txt_recherche.getText()+"%'");
                tableGestion.setModel(new ResultSetTableModel(rs));
            }
        }
    }//GEN-LAST:event_btn_rechercheMouseClicked

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
            java.util.logging.Logger.getLogger(GestionProduits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProduits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProduits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProduits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProduits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajout;
    private javax.swing.JButton btn_modifier;
    private javax.swing.JButton btn_quitter;
    private javax.swing.JButton btn_rec_ind;
    private javax.swing.JButton btn_recherche;
    private javax.swing.JButton btn_supprimer;
    private javax.swing.JComboBox<String> combo_recherche;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableGestion;
    private javax.swing.JTextField txt_fournisseur;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prix;
    private javax.swing.JTextField txt_quantite;
    private javax.swing.JTextField txt_recherche;
    // End of variables declaration//GEN-END:variables
}
