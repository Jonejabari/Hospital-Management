/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endassessment;

import javax.swing.JOptionPane;

/**
 *
 * @author office
 */
public class Complain_Clerk extends javax.swing.JFrame {

    /**
     * Creates new form Complain_Clerk
     */
    public Complain_Clerk() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameDispaly = new javax.swing.JPanel();
        btnrespond = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnProf = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnlogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameDispaly.setBackground(new java.awt.Color(255, 255, 204));

        btnrespond.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrespond.setText("Respond to citizen");
        btnrespond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrespondActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnView.setText("View Complaint ");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnProf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProf.setText("View Profile");
        btnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameDispalyLayout = new javax.swing.GroupLayout(frameDispaly);
        frameDispaly.setLayout(frameDispalyLayout);
        frameDispalyLayout.setHorizontalGroup(
            frameDispalyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameDispalyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameDispalyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnrespond)
                    .addComponent(btnProf)
                    .addComponent(btnView))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameDispalyLayout.setVerticalGroup(
            frameDispalyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameDispalyLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnProf)
                .addGap(104, 104, 104)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnrespond)
                .addGap(143, 143, 143))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 172, 233));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/endassessment/images/Notes.png"))); // NOI18N
        jLabel1.setText("Complain");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/endassessment/images/View.png"))); // NOI18N
        jLabel2.setText("View");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/endassessment/images/Boss.png"))); // NOI18N
        jLabel3.setText("Profile");

        btnlogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/endassessment/images/Exit.png"))); // NOI18N
        btnlogOut.setText("Log Out");
        btnlogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(111, 111, 111)
                .addComponent(jLabel2)
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addContainerGap(697, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogOut)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btnlogOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(frameDispaly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(frameDispaly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfActionPerformed
        // TODO add your handling code here
        
        new Clerk_View_Profile_form().setVisible(true);
        this.toBack();
        
    }//GEN-LAST:event_btnProfActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnrespondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrespondActionPerformed
        // TODO add your handling code here:
        
        new Response_to_citizen().setVisible(true);
        this.toBack();
    }//GEN-LAST:event_btnrespondActionPerformed

    private void btnlogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogOutActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btnlogOutActionPerformed

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
            java.util.logging.Logger.getLogger(Complain_Clerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Complain_Clerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Complain_Clerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Complain_Clerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Complain_Clerk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProf;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnlogOut;
    private javax.swing.JButton btnrespond;
    private javax.swing.JPanel frameDispaly;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
