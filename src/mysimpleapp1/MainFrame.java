/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysimpleapp1;

/**
 *
 * @author Administrator
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        lbMinus = new javax.swing.JLabel();
        txtDivA = new javax.swing.JTextField();
        txtMinusB = new javax.swing.JTextField();
        lbDiv = new javax.swing.JLabel();
        lbEqual1 = new javax.swing.JLabel();
        txtDivB = new javax.swing.JTextField();
        txtMinusC = new javax.swing.JTextField();
        lbEqual3 = new javax.swing.JLabel();
        bnMinus = new javax.swing.JButton();
        txtDivC = new javax.swing.JTextField();
        txtMulA = new javax.swing.JTextField();
        bnDiv = new javax.swing.JButton();
        lbMultiply = new javax.swing.JLabel();
        txtMulB = new javax.swing.JTextField();
        lbEqual2 = new javax.swing.JLabel();
        txtPA = new javax.swing.JTextField();
        lbPlus = new javax.swing.JLabel();
        txtPB = new javax.swing.JTextField();
        lbEqual = new javax.swing.JLabel();
        txtPC = new javax.swing.JTextField();
        bnPlus = new javax.swing.JButton();
        txtMulC = new javax.swing.JTextField();
        txtMinusA = new javax.swing.JTextField();
        bnMultuply = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello World");

        lbMinus.setText("-");

        txtDivA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivAActionPerformed(evt);
            }
        });

        lbDiv.setText("/");

        lbEqual1.setText("=");

        txtMinusC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinusCActionPerformed(evt);
            }
        });

        lbEqual3.setText("=");

        bnMinus.setText("-");
        bnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnMinusActionPerformed(evt);
            }
        });

        txtDivC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivCActionPerformed(evt);
            }
        });

        txtMulA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMulAActionPerformed(evt);
            }
        });

        bnDiv.setText("/");
        bnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDivActionPerformed(evt);
            }
        });

        lbMultiply.setText("*");

        lbEqual2.setText("=");

        txtPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAActionPerformed(evt);
            }
        });

        lbPlus.setText("+");

        lbEqual.setText("=");

        txtPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPCActionPerformed(evt);
            }
        });

        bnPlus.setText("+");
        bnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPlusActionPerformed(evt);
            }
        });

        txtMulC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMulCActionPerformed(evt);
            }
        });

        txtMinusA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinusAActionPerformed(evt);
            }
        });

        bnMultuply.setText("*");
        bnMultuply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnMultuplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtDivA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbDiv)
                            .addGap(18, 18, 18)
                            .addComponent(txtDivB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbEqual3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDivC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(bnPlus)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMulA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbMultiply)
                        .addGap(18, 18, 18)
                        .addComponent(txtMulB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMulC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bnMultuply, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbPlus)
                            .addGap(18, 18, 18)
                            .addComponent(txtPB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtMinusA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbMinus)
                            .addGap(18, 18, 18)
                            .addComponent(txtMinusB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbEqual1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtMinusC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus)
                    .addComponent(txtPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual)
                    .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnPlus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinusA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMinus)
                    .addComponent(txtMinusB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual1)
                    .addComponent(txtMinusC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnMinus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMulA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMultiply)
                    .addComponent(txtMulB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual2)
                    .addComponent(txtMulC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnMultuply))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDivA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiv)
                    .addComponent(txtDivB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual3)
                    .addComponent(txtDivC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnDiv))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDivAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDivAActionPerformed

    private void txtMinusCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinusCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinusCActionPerformed

    private void bnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnMinusActionPerformed
        // TODO add your handling code here:
        String a = txtMinusA.getText();
        String b = txtMinusB.getText();

        int intA = new Integer (a);
        int intB = new Integer (b);
        int intC = intA-intB;

        String c = Integer.toString(intC);

        txtMinusC.setText(c);
    }//GEN-LAST:event_bnMinusActionPerformed

    private void txtDivCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDivCActionPerformed

    private void txtMulAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMulAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMulAActionPerformed

    private void bnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDivActionPerformed
        // TODO add your handling code here:
        String a = txtDivA.getText();
        String b = txtDivB.getText();

        int intA = new Integer (a);
        int intB = new Integer (b);
        int intC = intA/intB;

        String c = Integer.toString(intC);

        txtDivC.setText(c);

    }//GEN-LAST:event_bnDivActionPerformed

    private void txtPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPAActionPerformed

    private void txtPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPCActionPerformed

    private void bnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPlusActionPerformed
        // TODO add your handling code here:
        String a = txtPA.getText();
        String b = txtPB.getText();

        int intA = new Integer (a);
        int intB = new Integer (b);
        int intC = intA+intB;

        String c = Integer.toString(intC);

        txtPC.setText(c);
    }//GEN-LAST:event_bnPlusActionPerformed

    private void txtMulCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMulCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMulCActionPerformed

    private void txtMinusAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinusAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinusAActionPerformed

    private void bnMultuplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnMultuplyActionPerformed
        // TODO add your handling code here:
        String a = txtMulA.getText();
        String b = txtMulB.getText();

        int intA = new Integer (a);
        int intB = new Integer (b);
        int intC = intA*intB;

        String c = Integer.toString(intC);

        txtMulC.setText(c);

    }//GEN-LAST:event_bnMultuplyActionPerformed

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
    private javax.swing.JButton bnDiv;
    private javax.swing.JButton bnMinus;
    private javax.swing.JButton bnMultuply;
    private javax.swing.JButton bnPlus;
    private javax.swing.JLabel lbDiv;
    private javax.swing.JLabel lbEqual;
    private javax.swing.JLabel lbEqual1;
    private javax.swing.JLabel lbEqual2;
    private javax.swing.JLabel lbEqual3;
    private javax.swing.JLabel lbMinus;
    private javax.swing.JLabel lbMultiply;
    private javax.swing.JLabel lbPlus;
    private javax.swing.JTextField txtDivA;
    private javax.swing.JTextField txtDivB;
    private javax.swing.JTextField txtDivC;
    private javax.swing.JTextField txtMinusA;
    private javax.swing.JTextField txtMinusB;
    private javax.swing.JTextField txtMinusC;
    private javax.swing.JTextField txtMulA;
    private javax.swing.JTextField txtMulB;
    private javax.swing.JTextField txtMulC;
    private javax.swing.JTextField txtPA;
    private javax.swing.JTextField txtPB;
    private javax.swing.JTextField txtPC;
    // End of variables declaration//GEN-END:variables
}
