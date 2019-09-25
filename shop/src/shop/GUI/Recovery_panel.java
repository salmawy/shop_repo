/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.GUI;

import javax.swing.JFileChooser;

/**
 *
 * @author Ahmed
 */
public class Recovery_panel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel1
     */
    public Recovery_panel() {
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

        recovery_FC = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        path_TF = new javax.swing.JTextField();
        browser_btn = new javax.swing.JButton();
        ok_btn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("المسار:");

        path_TF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        path_TF.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        browser_btn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        browser_btn.setText("إختيار");
        browser_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browser_btnActionPerformed(evt);
            }
        });

        ok_btn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ok_btn.setText("تم");
        ok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(browser_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(path_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(path_TF)
                    .addComponent(browser_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(ok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void browser_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browser_btnActionPerformed
        // TODO add your handling code here:
         recovery_FC = new JFileChooser(); 
    recovery_FC.setCurrentDirectory(new java.io.File("."));
    recovery_FC.setDialogTitle("Open");
    recovery_FC.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
    // disable the "All files" option.
    //
    recovery_FC.setAcceptAllFileFilterUsed(false);
    //    
    if (recovery_FC.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      System.out.println("getCurrentDirectory(): " 
         +  recovery_FC.getCurrentDirectory());
             this.path_TF.setText( recovery_FC.getSelectedFile().toString());

      }
    else {
      System.out.println("No Selection ");
      }
    }//GEN-LAST:event_browser_btnActionPerformed

    private void ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ok_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browser_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ok_btn;
    private javax.swing.JTextField path_TF;
    private javax.swing.JFileChooser recovery_FC;
    // End of variables declaration//GEN-END:variables
}
