/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.GUI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.PlainDocument;
import shop.Validation_pkg.DoubleInputValidator;
import shop.Validation_pkg.IntegerInputValidator;
import shop.data_source_pkg.DataSourc;
import shop.data_structures_pkg.Pair;
import shop.data_structures_pkg.Person;

/**
 *
 * @author ahmed
 */
public class OrderForm_panel extends javax.swing.JPanel {

    /**
     * Creates new form OrderForm_panel
     */
    int fridageNumber; 
    JFrame myFrame;
    DataSourc data_source;
    Map<String, String> orderDataMap;
    Map<String, Double> orderWithDrawalQuantity;
    List< String> customersOrdersTags;
    JDialog owner;
    boolean ok_btn_flage;

    public OrderForm_panel(JFrame myFrame, DataSourc data_source, JDialog owner) {
        this.data_source = data_source;
        this.myFrame = myFrame;
        this.owner = owner;
        initComponents();
        weight_TF.getDocument().addDocumentListener(new WeightValueTracker());
        UnitePrice_TF.getDocument().addDocumentListener(new CostValueTracker());
         packageNumber_TF.getDocument().addDocumentListener(new PackageNumberTracker());
orderWithDrawalQuantity=new HashMap<>();
        intiateForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notes_TA = new javax.swing.JTextArea();
        weight_label = new javax.swing.JLabel();
        weight_TF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        product_cB = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        UnitePrice_TF = new javax.swing.JTextField();
        net_label = new javax.swing.JLabel();
        netWeight_TF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        customeName_label = new javax.swing.JLabel();
        totalCost_TF = new javax.swing.JTextField();
        cancel_btn = new javax.swing.JButton();
        ok_btn = new javax.swing.JButton();
        warning_label = new javax.swing.JLabel();
        packageNumber_TF = new javax.swing.JTextField();
        number_label = new javax.swing.JLabel();
        unite_label = new javax.swing.JLabel();
        customerOrderTags_CB = new javax.swing.JComboBox();
        storeID_label = new javax.swing.JLabel();
        storeID_CB = new javax.swing.JComboBox();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ملاحظات", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane2.setWheelScrollingEnabled(false);

        notes_TA.setColumns(20);
        notes_TA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        notes_TA.setLineWrap(true);
        notes_TA.setRows(5);
        notes_TA.setToolTipText("ملاحظات");
        notes_TA.setWrapStyleWord(true);
        notes_TA.setBorder(null);
        jScrollPane2.setViewportView(notes_TA);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        weight_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weight_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        weight_label.setText("الوزن القائم:");

        weight_TF.setFont(new java.awt.Font("B Fantezy", 0, 20)); // NOI18N
        weight_TF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        weight_TF.setText("55");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("المنتج:");

        product_cB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        product_cB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "موز بلدي", "موز مستورد", "قوطاع", "عيوشي" }));
        product_cB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                product_cBItemStateChanged(evt);
            }
        });
        product_cB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_cBActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("الفئه:");

        UnitePrice_TF.setFont(new java.awt.Font("B Fantezy", 0, 20)); // NOI18N
        UnitePrice_TF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        net_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        net_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        net_label.setText("الصافي:");

        netWeight_TF.setEditable(false);
        netWeight_TF.setFont(new java.awt.Font("B Fantezy", 0, 20)); // NOI18N
        netWeight_TF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("المبلغ:");

        customeName_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customeName_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        customeName_label.setText("اسم العميل:");

        totalCost_TF.setFont(new java.awt.Font("B Fantezy", 0, 20)); // NOI18N
        totalCost_TF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        cancel_btn.setText("إلغاء");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        ok_btn.setText("تم");
        ok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_btnActionPerformed(evt);
            }
        });

        warning_label.setBackground(new java.awt.Color(204, 204, 255));
        warning_label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        warning_label.setForeground(new java.awt.Color(255, 0, 51));
        warning_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        packageNumber_TF.setColumns(8);
        packageNumber_TF.setFont(new java.awt.Font("B Fantezy", 0, 20)); // NOI18N
        packageNumber_TF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        packageNumber_TF.setText("0.0");

        number_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        number_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        number_label.setText("عدد:");

        unite_label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        unite_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unite_label.setText("قفص");

        customerOrderTags_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        storeID_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        storeID_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        storeID_label.setText("رقم الثلاجة:");

        storeID_CB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        storeID_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ثلاجة رقم 1", "ثلاجة رقم 2", "ثلاجة رقم 3", "ثلاجة رقم 4", "ثلاجة رقم 5" }));
        storeID_CB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                storeID_CBItemStateChanged(evt);
            }
        });
        storeID_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeID_CBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(netWeight_TF)
                            .addComponent(UnitePrice_TF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customerOrderTags_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalCost_TF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(net_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customeName_label, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(warning_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ok_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel_btn)
                        .addGap(0, 183, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_cB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(unite_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(packageNumber_TF))
                            .addComponent(weight_TF)
                            .addComponent(storeID_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(weight_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(2, 2, 2))
                                        .addComponent(number_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(storeID_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(product_cB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeID_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeID_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weight_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageNumber_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_label)
                    .addComponent(unite_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(UnitePrice_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(net_label)
                    .addComponent(netWeight_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(totalCost_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customeName_label)
                    .addComponent(customerOrderTags_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn)
                    .addComponent(ok_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warning_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        PlainDocument weight_TF_doc = (PlainDocument)weight_TF .getDocument();
        weight_TF_doc.setDocumentFilter(new DoubleInputValidator(this.weight_TF , this.warning_label));
        PlainDocument UnitePrice_TF_doc = (PlainDocument)UnitePrice_TF.getDocument();
        UnitePrice_TF_doc.setDocumentFilter(new DoubleInputValidator(this.UnitePrice_TF, this.warning_label));
        PlainDocument netWeight_TF_doc = (PlainDocument)netWeight_TF .getDocument();
        netWeight_TF_doc.setDocumentFilter(new DoubleInputValidator(this.netWeight_TF, this.warning_label));
        PlainDocument totalCost_TF_doc = (PlainDocument)totalCost_TF.getDocument();
        totalCost_TF_doc.setDocumentFilter(new DoubleInputValidator(this.totalCost_TF , this.warning_label));
        PlainDocument packageNumber_TF_doc = (PlainDocument)packageNumber_TF.getDocument();
        packageNumber_TF_doc .setDocumentFilter(new IntegerInputValidator(this.packageNumber_TF, this.warning_label));
    }// </editor-fold>//GEN-END:initComponents

    private void product_cBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_cBActionPerformed
        // TODO add your handling code here:
        int index = product_cB.getSelectedIndex();
        switch (index) {

            case 0:
                zeroMode();
                break;
            case 1:
                oneMode();
                break;
            case 2:
                twoMode();
                break;
            case 3:
                threeMode();
                break;
        }
    }//GEN-LAST:event_product_cBActionPerformed

    private void product_cBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_product_cBItemStateChanged
        // TODO add your handling code here:

        JComboBox cb = (JComboBox) evt.getSource();
        Object item = evt.getItem();

        if (evt.getStateChange() == evt.SELECTED) {
            int index = product_cB.getSelectedIndex();
            switch (index) {

                case 0:
                    zeroMode();
                    break;
                case 1:
                    oneMode();
                    break;
                case 2:
                    twoMode();
                    break;
                case 3:
                    threeMode();
                    break;

            }

        } else if (evt.getStateChange() == evt.DESELECTED) {
            // Item is no longer selected
        }
    }//GEN-LAST:event_product_cBItemStateChanged

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        // TODO add your handling code here:
        owner.dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_btnActionPerformed
        // TODO add your handling code here:

        String product = product_cB.getSelectedItem().toString();
        if (validateForm()) {
            String weight = weight_TF.getText();
            String package_number = packageNumber_TF.getText();
            String netWeight = netWeight_TF.getText();
            String UnitePrice = UnitePrice_TF.getText();
            String OrderTag = "";// customerNames_CB.getSelectedItem().toString();
            String totalCost = totalCost_TF.getText();
            totalCost = String.valueOf(Math.rint(Double.parseDouble(totalCost)));
            int index = product_cB.getSelectedIndex();
            switch (index) {

                case 0:
                    OrderTag = customerOrderTags_CB.getSelectedItem().toString();
                    addOrderWithDrawalQuantity(OrderTag, Double.parseDouble(weight));
                    break;

                case 1:
                    weight = String.valueOf("");
                    netWeight = "";
                    OrderTag = customerOrderTags_CB.getSelectedItem().toString();
                 addOrderWithDrawalQuantity(OrderTag, Double.parseDouble(package_number));

                    break;
                case 2:
                    weight = String.valueOf("");
                    netWeight = "";
                    OrderTag = "";

                    break;
                case 3:
                    OrderTag = "";

                    break;

            }

            orderDataMap.put("product", product);

            orderDataMap.put("weight", weight);
            orderDataMap.put("packageNumber", package_number);
            orderDataMap.put("netWeight", netWeight);
            orderDataMap.put("UnitePrice", UnitePrice);
            orderDataMap.put("orderTag", OrderTag);
            orderDataMap.put("totalCost", totalCost);
            ok_btn_flage = true;
            owner.dispose();
        }
    }//GEN-LAST:event_ok_btnActionPerformed

    private void storeID_CBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_storeID_CBItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_storeID_CBItemStateChanged

    private void storeID_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeID_CBActionPerformed
        // TODO add your handling code here:
        int productID = product_cB.getSelectedIndex() + 1;
        if (productID == 1 || productID == 2) {

            fillCustomerNames_CB(productID);

        }


    }//GEN-LAST:event_storeID_CBActionPerformed
    void addOrderWithDrawalQuantity(String name, Double quantity) {

        if (orderWithDrawalQuantity.containsKey(name)) {

            Double tempQuantity = orderWithDrawalQuantity.get(name);
            tempQuantity += quantity;
            orderWithDrawalQuantity.put(name, tempQuantity);

        } else {
            orderWithDrawalQuantity.put(name, quantity);

        }

    }

    public void removeOrderWithDrawalQuantity(String name, Double quantity) {

        if (orderWithDrawalQuantity.containsKey(name)) {

            Double tempQuantity = orderWithDrawalQuantity.get(name);
            tempQuantity -= quantity;
            orderWithDrawalQuantity.put(name, tempQuantity);

        }

    }

    double getOrderWithDrawalQuantity(String name) {

        if (orderWithDrawalQuantity.containsKey(name)) {

            Double tempQuantity = orderWithDrawalQuantity.get(name);

            return tempQuantity;

        } else {
            return 0;
        }

    }

    void zeroMode() {

        this.number_label.setVisible(true);
        this.packageNumber_TF.setVisible(true);
        this.unite_label.setVisible(true);
        unite_label.setText("سباطة");
        this.weight_TF.setVisible(true);
        this.weight_label.setVisible(true);
        this.net_label.setVisible(true);
        this.netWeight_TF.setVisible(true);
        this.customerOrderTags_CB.setVisible(true);
        this.customeName_label.setVisible(true);

        this.storeID_CB.setVisible(true);
        this.storeID_label.setVisible(true);
        fillCustomerNames_CB(1);
    }

    void oneMode() {

        this.weight_TF.setVisible(false);
        this.weight_label.setVisible(false);
        this.net_label.setVisible(false);
        this.netWeight_TF.setVisible(false);

        this.number_label.setVisible(true);
        this.packageNumber_TF.setVisible(true);
        this.unite_label.setVisible(true);
        this.customerOrderTags_CB.setVisible(true);
        this.customeName_label.setVisible(true);
        this.storeID_CB.setVisible(true);
        this.storeID_label.setVisible(true);
        this.number_label.setText("كرتونه");
        fillCustomerNames_CB(2);
    }

    void twoMode() {

        this.weight_TF.setVisible(false);
        this.weight_label.setVisible(false);
        this.net_label.setVisible(false);
        this.netWeight_TF.setVisible(false);
        this.customerOrderTags_CB.setVisible(false);
        this.customeName_label.setVisible(false);

        this.number_label.setVisible(true);
        this.packageNumber_TF.setVisible(true);
        this.unite_label.setVisible(true);
        this.storeID_CB.setVisible(false);
        this.storeID_label.setVisible(false);
        this.number_label.setText("عدايه");

    }

    void threeMode() {

        this.weight_TF.setVisible(true);
        this.weight_label.setVisible(true);
        this.net_label.setVisible(true);
        this.netWeight_TF.setVisible(true);
        this.customerOrderTags_CB.setVisible(false);
        this.customeName_label.setVisible(false);
        this.storeID_CB.setVisible(false);
        this.storeID_label.setVisible(false);

        this.number_label.setVisible(true);
        this.packageNumber_TF.setVisible(true);
        this.unite_label.setVisible(true);

        this.number_label.setText("قفص");

    }

    public class WeightValueTracker implements DocumentListener {

        public WeightValueTracker() {

        }

        void track() {
            if (!weight_TF.getText().isEmpty()) {
                double weight = Double.parseDouble(weight_TF.getText());

                if (weight != 0) {
                    int index = product_cB.getSelectedIndex();
                    double commission = 0.0;
                    switch (index) {
                        case 0:
                            commission = .935;
                    netWeight_TF.setText(String.valueOf(Math.rint(weight * commission)));
                            break;
                        case 1:
                            commission = 0;
                             netWeight_TF.setText(String.valueOf(Math.rint(weight * 1)));
                            break;
                        case 2:
                            netWeight_TF.setText(String.valueOf(Math.rint(weight * 1)));
                            break;
                      

                    }
                  

                }
            }

        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            track();

        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            track();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            track();
        }

    }

    public class CostValueTracker implements DocumentListener {

        public CostValueTracker() {

        }

        void track() {
            int index = product_cB.getSelectedIndex();
            switch (index) {

                case 0:
                    if (!netWeight_TF.getText().isEmpty() && !UnitePrice_TF.getText().isEmpty()) {
                        double netWeight = Double.parseDouble(netWeight_TF.getText());
                        double unitePrice = Double.parseDouble(UnitePrice_TF.getText());

                        if (netWeight != 0 && unitePrice != 0) {

                            double x = netWeight * unitePrice;
                            x = Math.rint(x);
                            totalCost_TF.setText(String.valueOf(x));

                        }
                    }

                    break;
                case 1:
                    if (!packageNumber_TF.getText().isEmpty() && !UnitePrice_TF.getText().isEmpty()) {
                        double number = Double.parseDouble(packageNumber_TF.getText());
                        double unitePrice = Double.parseDouble(UnitePrice_TF.getText());

                        if (number != 0 && unitePrice != 0) {

                            double x = number * unitePrice;
                            totalCost_TF.setText(String.valueOf(x));

                        }
                    }
                    break;
                case 2:
                    if (!packageNumber_TF.getText().isEmpty() && !UnitePrice_TF.getText().isEmpty()) {
                        double number = Double.parseDouble(packageNumber_TF.getText());
                        double unitePrice = Double.parseDouble(UnitePrice_TF.getText());

                        if (number != 0 && unitePrice != 0) {

                            double x = number * unitePrice;
                            totalCost_TF.setText(String.valueOf(x));

                        }
                    }
                    break;

                case 3:
                    if (!netWeight_TF.getText().isEmpty() && !UnitePrice_TF.getText().isEmpty()) {
                        double netWeight = Double.parseDouble(netWeight_TF.getText());
                        double unitePrice = Double.parseDouble(UnitePrice_TF.getText());

                        if (netWeight != 0 && unitePrice != 0) {

                            double x = netWeight * unitePrice;
                            totalCost_TF.setText(String.valueOf(x));

                        }
                    }

                    break;

            }

        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            track();

        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            track();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            track();
        }

    }
  public class PackageNumberTracker implements DocumentListener {

        public PackageNumberTracker() {

        }

        void track() {
            
            
            if(product_cB.getSelectedIndex()==3){
           String weight=weight_TF.getText();
        String number=packageNumber_TF.getText();
        if(!weight.isEmpty()&&!number.isEmpty()){
       
                             int packageNumber=Integer.parseInt(packageNumber_TF.getText());
                             int x=packageNumber*3;
                              int gross_weight = Integer.parseInt(weight_TF.getText());
                              int netWeight=gross_weight-x;
                              netWeight_TF.setText(String.valueOf(Math.rint(netWeight)));}
        }
        }
        @Override
        public void insertUpdate(DocumentEvent e) {
            track();

        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            track();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            track();
        }

    }
    
  public void intiateForm() {

        orderDataMap = new HashMap<>();
        
        this.weight_TF.setText("");
        this.packageNumber_TF.setText("");
        this.netWeight_TF.setText("");
        this.UnitePrice_TF.setText("");
        this.totalCost_TF.setText("");

        this.product_cB.setSelectedIndex(0);
        ok_btn_flage = false;
        //    fillCustomerNames_CB();

    }

    int getOrderID() {
        String[] customerTag = customerOrderTags_CB.getSelectedItem().toString().split("_");
        java.util.Date date;
      
            String orderID=customerTag[customerTag.length-1].replace(" ", "");
          
            return Integer.parseInt(orderID);
      

     

    }

    void fillCustomerNames_CB(int id) {
        customerOrderTags_CB.removeAllItems();
        int storeNumber = storeID_CB.getSelectedIndex() + 1;
        customersOrdersTags= data_source.getAllCustomersOrdersTags(id, storeNumber,fridageNumber);
        //DateFormat df = new SimpleDateFormat("dd-MMMMMM-YYYY HH:mm:ss aaaa", new Locale("ar", "AE", "Arabic"));

        for (int i = 0; i < customersOrdersTags.size(); i++) {
            String orderTag = (customersOrdersTags.get(i));
            customerOrderTags_CB.addItem(orderTag);

        }

    }

    boolean validateForm() {

        String weight = weight_TF.getText();
        String packageNumber = packageNumber_TF.getText();
        String UnitePrice = UnitePrice_TF.getText();

        int index = product_cB.getSelectedIndex();

        switch (index) {
            case 0:

                if (weight.isEmpty()) {

                    this.warning_label.setText("يجب إدخال الوزن");
                    return false;
                }
                if (UnitePrice.isEmpty()) {

                    this.warning_label.setText("يجب إدخال الفئة");
                    return false;

                }
                DateFormat df = new SimpleDateFormat("dd-MM HH:mm:ss", Locale.ENGLISH);// DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.FULL, new Locale("ar","AE","Arabic"));

                int orderid = getOrderID();
                double avaliable = data_source.getProductavaliableAmount(orderid, 1);
                double d_weight = Double.parseDouble(weight);
                
                d_weight += getOrderWithDrawalQuantity(customerOrderTags_CB.getSelectedItem().toString());
                if (d_weight > avaliable && avaliable != -10000000) {
                    avaliable-=getOrderWithDrawalQuantity(customerOrderTags_CB.getSelectedItem().toString());
                    this.warning_label.setText("الوزن اكبر من المتاح" + avaliable);

                    return false;
                } else {

                    this.warning_label.setText("");
                    return true;

                }

            case 1:
                if (packageNumber.isEmpty()) {

                    this.warning_label.setText("يجب إدخال العدد");
                    return false;

                }
                if (UnitePrice.isEmpty()) {

                    this.warning_label.setText("يجب القئة");
                    return false;

                }

                df = new SimpleDateFormat("dd-MM HH:mm:ss", Locale.ENGLISH);// DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.FULL, new Locale("ar","AE","Arabic"));
              
                orderid = getOrderID();
                avaliable = data_source.getProductavaliableAmount(orderid, 2);
                d_weight = Double.parseDouble(packageNumber);
                d_weight+= getOrderWithDrawalQuantity(customerOrderTags_CB.getSelectedItem().toString());
                if (d_weight > avaliable) {
                   avaliable-=getOrderWithDrawalQuantity(customerOrderTags_CB.getSelectedItem().toString());
                    this.warning_label.setText(" :العدد اكبر من المتاح" + avaliable);

                    return false;
                } else {

                    this.warning_label.setText("");
                    return true;

                }
            case 2:

                if (packageNumber.isEmpty()) {

                    this.warning_label.setText("يجب إدخال العدد");
                    return false;

                }
                if (UnitePrice.isEmpty()) {

                    this.warning_label.setText("يجب إدخال الفئة");
                    return false;

                } else {

                    this.warning_label.setText("");
                    return true;
                }

            case 3:

                if (weight.isEmpty()) {

                    this.warning_label.setText("يجب إدخال الوزن");
                    return false;
                }
                if (packageNumber.isEmpty()) {

                    this.warning_label.setText("يجب إدخال العدد");
                    return false;

                }
                if (UnitePrice.isEmpty()) {

                    this.warning_label.setText("يجب إدخال الفئة");
                    return false;

                } else {

                    this.warning_label.setText("");
                    return true;

                }

        }

        return true;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UnitePrice_TF;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel customeName_label;
    private javax.swing.JComboBox customerOrderTags_CB;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField netWeight_TF;
    private javax.swing.JLabel net_label;
    private javax.swing.JTextArea notes_TA;
    private javax.swing.JLabel number_label;
    private javax.swing.JButton ok_btn;
    public javax.swing.JTextField packageNumber_TF;
    private javax.swing.JComboBox product_cB;
    private javax.swing.JComboBox storeID_CB;
    private javax.swing.JLabel storeID_label;
    private javax.swing.JTextField totalCost_TF;
    private javax.swing.JLabel unite_label;
    private javax.swing.JLabel warning_label;
    private javax.swing.JTextField weight_TF;
    private javax.swing.JLabel weight_label;
    // End of variables declaration//GEN-END:variables
}
