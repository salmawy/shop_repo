/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.GUI;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import shop.data_source_pkg.DataSourc;

/**
 *
 * @author ahmed
 */
public class loginSetting_panel extends javax.swing.JPanel {

    /**
     * Creates new form loginSetting_panel
     */
    boolean flag;
    DataSourc data_source;
    String oldPassword;
    String oldUeserName;
JDialog owner; 
    public loginSetting_panel(JDialog owner ,DataSourc data_source) {
        this.data_source = data_source;
        this.owner=owner;
        initComponents();
       intiatePage();
    }

    void intiatePage() {

        flag = true;
        this.password_TF1.setVisible(false);
        this.password_label1.setVisible(false);
        this.password_TF.setText("");
        this.userName_TF.setText("");
        this.password_TF1.setText("");
        this.massegging_label.setText("يرجي تسجيل الدخول أولا");
        this.warnning_label.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userName_TF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password_TF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        password_label1 = new javax.swing.JLabel();
        password_TF1 = new javax.swing.JPasswordField();
        massegging_label = new javax.swing.JLabel();
        ok_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        warnning_label = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        setLayout(new javax.swing.OverlayLayout(this));

        userName_TF.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        userName_TF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        userName_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userName_TFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم المستخدم");

        password_TF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password_TF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        password_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_TFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("كلمة المرور");

        password_label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        password_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password_label1.setText("إعادة كتابة كلمة المرور");

        password_TF1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password_TF1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        massegging_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        massegging_label.setForeground(new java.awt.Color(43, 153, 11));
        massegging_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ok_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ok_btn.setText("تم");
        ok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_btnActionPerformed(evt);
            }
        });

        cancel_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancel_btn.setText("إعادة");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        warnning_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        warnning_label.setForeground(new java.awt.Color(191, 16, 16));
        warnning_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warnning_label.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_TF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userName_TF)
                            .addComponent(warnning_label, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(password_TF1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancel_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ok_btn)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password_label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(massegging_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(massegging_label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_TF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_label1))
                .addGap(10, 10, 10)
                .addComponent(warnning_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_btn)
                    .addComponent(cancel_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void userName_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userName_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userName_TFActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        // TODO add your handling code here:

        intiatePage();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_btnActionPerformed
        // TODO add your handling code here:
        String userName = userName_TF.getText();
        char[] pass = password_TF.getPassword();
 char[] pass2 = password_TF1.getPassword();
        String passeord = "";
        for (int i = 0; i < pass.length; i++) {
            passeord += pass[i];

        }
        if (userName.isEmpty()) {
            this.warnning_label.setText("يجب إدخال اسم المستخدم");
        } else if (passeord.isEmpty()) {
            this.warnning_label.setText("يجب إدخال كلمة المرور");
        }
        if (flag) {
            if (data_source.authenticateUser(userName, passeord)) {

                SignUpMode(userName, passeord);

            } else {
                this.warnning_label.setText("كلمة السر او اسم المستخدم خطأ");
                 this.password_TF.setText("");
            }
        } else {
            String password2="";
            
              for (int i = 0; i < pass.length; i++) {
            password2 += pass2[i];

        }
              if(userName_TF.getText().isEmpty()){
              
               this.warnning_label.setText("يجب إدخال اسم المستخدم");
              }
              else if(password_TF.getPassword().length==0){
              
              this.warnning_label.setText("يجب إدخال كلمة المرور");
              }else if(password_TF1.getPassword().length==0){
              this.warnning_label.setText("يجب إدخال إعادة كتابة كلمة المرور");
              
              }
              else if (userName.length() < 5) {

                this.warnning_label.setText("يجب ان تكون اسم المستخدم اكبر خمسة احرف");

            } else if (passeord.length() < 8) {
                this.warnning_label.setText("يجب ان تكون كلمة السر اكبر  مانية احرف ");

            } else if (!passeord.equals(password2)){
            
            this.warnning_label.setText("يجب ان تكون كلمتا السر متطابقتان");
            
            
            }else {
                
                data_source.signup(userName, passeord, oldUeserName, oldPassword);
                  JOptionPane.showMessageDialog(owner,"تم تغيير اسم المستخدم ورقم الجلوس بنجاح");
              this.password_TF.setText("");
              this.password_TF1.setText("");
              this.warnning_label.setText("");
              owner.dispose();
            }

        }

    }//GEN-LAST:event_ok_btnActionPerformed

    private void password_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_TFActionPerformed
    void SignUpMode(String userName, String password) {

        this.oldPassword = password;
        this.oldUeserName = userName;
        this.userName_TF.setText("");
        this.password_TF.setText("");
        this.flag = false;
        this.massegging_label.setText("يرجي إدخال اسم المستخدم وكلمة السر الجديدة");
        this.warnning_label.setText("");
        this.password_TF1.setVisible(true);
        this.password_label1.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel massegging_label;
    private javax.swing.JButton ok_btn;
    private javax.swing.JPasswordField password_TF;
    private javax.swing.JPasswordField password_TF1;
    private javax.swing.JLabel password_label1;
    private javax.swing.JTextField userName_TF;
    private javax.swing.JLabel warnning_label;
    // End of variables declaration//GEN-END:variables
}