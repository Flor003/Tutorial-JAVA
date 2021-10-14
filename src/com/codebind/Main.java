/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.codebind;

/**
 *
 * @author STE
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlabelbutton = new javax.swing.JButton();
        jtextfieldbutton = new javax.swing.JButton();
        jbutton = new javax.swing.JButton();
        jpanel = new javax.swing.JButton();
        jtextareabutton = new javax.swing.JButton();
        jcheckboxbutton = new javax.swing.JButton();
        jradiobutton = new javax.swing.JButton();
        jlistbutton = new javax.swing.JButton();
        jcomboboxbutton = new javax.swing.JButton();
        jtablebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(153, 255, 153));
        bg.setPreferredSize(new java.awt.Dimension(820, 498));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setText("TUTORIAL DE JAVA");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 364, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/java.png"))); // NOI18N
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 230, 180));

        jlabelbutton.setBackground(new java.awt.Color(255, 153, 153));
        jlabelbutton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jlabelbutton.setText("JLabel");
        jlabelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlabelbuttonActionPerformed(evt);
            }
        });
        bg.add(jlabelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, 50));

        jtextfieldbutton.setBackground(new java.awt.Color(255, 153, 153));
        jtextfieldbutton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jtextfieldbutton.setText("JTextField");
        jtextfieldbutton.setPreferredSize(new java.awt.Dimension(200, 25));
        jtextfieldbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfieldbuttonActionPerformed(evt);
            }
        });
        bg.add(jtextfieldbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 140, 50));

        jbutton.setBackground(new java.awt.Color(255, 153, 153));
        jbutton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jbutton.setText("JButton");
        jbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonActionPerformed(evt);
            }
        });
        bg.add(jbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 140, 50));

        jpanel.setBackground(new java.awt.Color(255, 153, 153));
        jpanel.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jpanel.setText("JPanel");
        jpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpanelActionPerformed(evt);
            }
        });
        bg.add(jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 140, 50));

        jtextareabutton.setBackground(new java.awt.Color(255, 153, 153));
        jtextareabutton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jtextareabutton.setText("JTextArea");
        jtextareabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextareabuttonActionPerformed(evt);
            }
        });
        bg.add(jtextareabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 140, 50));

        jcheckboxbutton.setBackground(new java.awt.Color(255, 153, 153));
        jcheckboxbutton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jcheckboxbutton.setText("JCheckBox");
        jcheckboxbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckboxbuttonActionPerformed(evt);
            }
        });
        bg.add(jcheckboxbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 140, 50));

        jradiobutton.setBackground(new java.awt.Color(255, 153, 153));
        jradiobutton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jradiobutton.setText("JRadioButton");
        jradiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradiobuttonActionPerformed(evt);
            }
        });
        bg.add(jradiobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 140, 50));

        jlistbutton.setBackground(new java.awt.Color(255, 153, 153));
        jlistbutton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jlistbutton.setText("JList");
        jlistbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlistbuttonActionPerformed(evt);
            }
        });
        bg.add(jlistbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 140, 50));

        jcomboboxbutton.setBackground(new java.awt.Color(255, 153, 153));
        jcomboboxbutton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jcomboboxbutton.setText("JComboBox");
        jcomboboxbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboboxbuttonActionPerformed(evt);
            }
        });
        bg.add(jcomboboxbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 140, 50));

        jtablebutton.setBackground(new java.awt.Color(255, 153, 153));
        jtablebutton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jtablebutton.setText("JTable");
        jtablebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtablebuttonActionPerformed(evt);
            }
        });
        bg.add(jtablebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlabelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlabelbuttonActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyLabel().setVisible(true);
            }
        });
    }//GEN-LAST:event_jlabelbuttonActionPerformed

    private void jtextfieldbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfieldbuttonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyTextfield().setVisible(true);
            }
        });
    }//GEN-LAST:event_jtextfieldbuttonActionPerformed

    private void jbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyButton().setVisible(true);
            }
        });
    }//GEN-LAST:event_jbuttonActionPerformed

    private void jpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpanelActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyPanel().setVisible(true);
            }
        });
    }//GEN-LAST:event_jpanelActionPerformed

    private void jtextareabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextareabuttonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyTextarea().setVisible(true);
            }
        });
    }//GEN-LAST:event_jtextareabuttonActionPerformed

    private void jcheckboxbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckboxbuttonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCheckbox().setVisible(true);
            }
        });
    }//GEN-LAST:event_jcheckboxbuttonActionPerformed

    private void jradiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradiobuttonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyRadiobutton().setVisible(true);
            }
        });
    }//GEN-LAST:event_jradiobuttonActionPerformed

    private void jlistbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlistbuttonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyList().setVisible(true);
            }
        });
    }//GEN-LAST:event_jlistbuttonActionPerformed

    private void jcomboboxbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboboxbuttonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCombobox().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_jcomboboxbuttonActionPerformed

    private void jtablebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtablebuttonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyTable().setVisible(true);
            }
        });
    }//GEN-LAST:event_jtablebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbutton;
    private javax.swing.JButton jcheckboxbutton;
    private javax.swing.JButton jcomboboxbutton;
    private javax.swing.JButton jlabelbutton;
    private javax.swing.JButton jlistbutton;
    private javax.swing.JButton jpanel;
    private javax.swing.JButton jradiobutton;
    private javax.swing.JButton jtablebutton;
    private javax.swing.JButton jtextareabutton;
    private javax.swing.JButton jtextfieldbutton;
    // End of variables declaration//GEN-END:variables
}
