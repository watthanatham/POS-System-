/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theerawen.project;

/**
 *
 * @author Windows10
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        ChangPanel chpanel = new ChangPanel();
        this.add(chpanel);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrMain = new javax.swing.JScrollPane();
        scrMenu = new javax.swing.JScrollPane();
        pnlMenu = new javax.swing.JPanel();
        btnWen = new javax.swing.JButton();
        btnChang = new javax.swing.JButton();
        btnBank = new javax.swing.JButton();
        btnNumm = new javax.swing.JButton();
        btnPae = new javax.swing.JButton();
        btnPloy = new javax.swing.JButton();
        btnJeab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnWen.setText("Wen");
        btnWen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWenActionPerformed(evt);
            }
        });

        btnChang.setText("Chang");
        btnChang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangActionPerformed(evt);
            }
        });

        btnBank.setText("Bank");
        btnBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBankActionPerformed(evt);
            }
        });

        btnNumm.setText("Numm");
        btnNumm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNummActionPerformed(evt);
            }
        });

        btnPae.setText("Pae");
        btnPae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaeActionPerformed(evt);
            }
        });

        btnPloy.setText("Ploy");
        btnPloy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPloyActionPerformed(evt);
            }
        });

        btnJeab.setText("Jeab");
        btnJeab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJeabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChang, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnBank, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnNumm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnPae, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnPloy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnJeab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnWen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNumm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPloy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJeab)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        scrMenu.setViewportView(pnlMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scrMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrMain, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrMain)
            .addComponent(scrMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWenActionPerformed
        scrMain.setViewportView(new WenPanel());
    }//GEN-LAST:event_btnWenActionPerformed

    private void btnChangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangActionPerformed
        scrMain.setViewportView(new ChangPanel());
    }//GEN-LAST:event_btnChangActionPerformed

    private void btnBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBankActionPerformed

    private void btnNummActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNummActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNummActionPerformed

    private void btnPaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaeActionPerformed

    private void btnPloyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPloyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPloyActionPerformed

    private void btnJeabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJeabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJeabActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBank;
    private javax.swing.JButton btnChang;
    private javax.swing.JButton btnJeab;
    private javax.swing.JButton btnNumm;
    private javax.swing.JButton btnPae;
    private javax.swing.JButton btnPloy;
    private javax.swing.JButton btnWen;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JScrollPane scrMain;
    private javax.swing.JScrollPane scrMenu;
    // End of variables declaration//GEN-END:variables
}
