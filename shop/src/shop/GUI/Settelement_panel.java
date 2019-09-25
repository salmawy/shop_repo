/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.GUI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import shop.data_source_pkg.DataSourc;
import shop.data_structures_pkg.Table;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.w3c.dom.Attr;
import shop.data_source_pkg.DataSourc;
import shop.data_structures_pkg.Table;

/**
 *
 * @author Ahmed
 */
public class Settelement_panel
        extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel2
     */
    DataSourc data_source;
    JDialog owner;
 private final String[] tables = {"SEASON", "SELLER_LOAN_BAG", "MY_SAFE",
            "SELLER_WEIGHT", "SELLER_ORDER", "PURCHASED_CUSTOMRER_INSTS",
            "SELLER", "OUTCOME_DETAIL", "LOAN_PAYING", "OUTCOME", "INC_LOAN",
            "LOANERS", "LOAN_ACCOUNT", "INSTALMENT", "INCOME_DETAIL", "INCOME",
            "CUSTOMER_ORDER", "CUSTOMER", "CONTRACTOR", "CONTRACTOR_ACCOUNT",
            "CONTRACTOR_ACCOUNT_DETAIL", "SELLER_ORDER"};
    public Settelement_panel(JDialog owner, DataSourc data_source) {
        this.data_source = data_source;
        this.owner = owner;
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

        settelement_FC = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        path_TF = new javax.swing.JTextField();
        browser_btn = new javax.swing.JButton();
        ok_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar(0,99);
        comfirm_btn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 180));

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

        jPanel1.setLayout(new java.awt.CardLayout());

        bar.setOpaque(true);
        jPanel1.add(bar, "card2");

        comfirm_btn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        comfirm_btn.setText("تاكيد رفع البيانات");
        comfirm_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comfirm_btnActionPerformed(evt);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(comfirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(path_TF)
                    .addComponent(browser_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comfirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void browser_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browser_btnActionPerformed
        // TODO add your handling code here:

        settelement_FC = new JFileChooser();
        settelement_FC.setCurrentDirectory(new java.io.File("."));
        settelement_FC.setDialogTitle("Open");
        settelement_FC.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //
        // disable the "All files" option.
        //
        settelement_FC.setAcceptAllFileFilterUsed(false);
        //    
        if (settelement_FC.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): "
                    + settelement_FC.getCurrentDirectory());
            this.path_TF.setText(settelement_FC.getSelectedFile().toString());
        } else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_browser_btnActionPerformed
    boolean validateForm() {

        String path = path_TF.getText();
        if (path.isEmpty()) {
            return false;
        }
        return true;

    }

    private class Worker extends SwingWorker<Boolean, Boolean> {

       

        protected Boolean doInBackground() {
            String dir = path_TF.getText();
            List<Table> tablesData = new ArrayList<>();

            for (String tableName : tables) {
                tablesData.add(data_source.getTables(tableName));

            }
            GenerateXML(tablesData,dir);

            return Boolean.TRUE;
        }

        public void GenerateXML(List<Table> tables,String path) {
            try {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbf.newDocumentBuilder();
                org.w3c.dom.Document doc = dBuilder.newDocument();

                org.w3c.dom.Element rootElement = doc.createElement("DayExport");
                doc.appendChild(rootElement);
                for (Table t : tables) {

                    org.w3c.dom.Element tableElement = doc.createElement("Table");
                    rootElement.appendChild(tableElement);

                    Attr nameAttr = doc.createAttribute("name");
                    nameAttr.setValue(t.getName());//setTableName
                    tableElement.setAttributeNode(nameAttr);

                    org.w3c.dom.Element ColumnsElement = doc.createElement("Columns");

                    for (String columnName : t.getColumns()) {
                        org.w3c.dom.Element columnElement = doc.createElement("Column");

                        columnElement.appendChild(doc.createTextNode(columnName));//setColumnName;
                        ColumnsElement.appendChild(columnElement);
                        //end for loop
                    }
                    tableElement.appendChild(ColumnsElement);

                    org.w3c.dom.Element dataElement = doc.createElement("Data");
                    for (List<String> row : t.getData()) {
                        org.w3c.dom.Element rowElement = doc.createElement("Row");
                        for (String Field : row) {
                            org.w3c.dom.Element FieldElement = doc.createElement("Field");
                            String str = (Field == null) ? " " : Field;
                            FieldElement.appendChild(doc.createTextNode(str));//setRow data
                            rowElement.appendChild(FieldElement);
                        }
                        dataElement.appendChild(rowElement);
                    }

                    tableElement.appendChild(dataElement);
                    rootElement.appendChild(tableElement);

                }

                TransformerFactory tf = TransformerFactory.newInstance();
                Transformer transformer = tf.newTransformer();

                DOMSource source = new DOMSource(doc);

                StreamResult result = new StreamResult(new File(path+"\\data_set.xml"));
                transformer.transform(source, result);

                StreamResult consoleResult = new StreamResult(System.out);
                transformer.transform(source, consoleResult);

            } catch (ParserConfigurationException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        protected void done() {
            ok_btn.setEnabled(true);
            bar.setIndeterminate(false);
            JOptionPane.showMessageDialog(owner, "تم الحفظ");
            owner.dispose();
        }
    }

    private void ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_btnActionPerformed
        // TODO add your handling code here:
        if (validateForm()) {
            ok_btn.setEnabled(false);
            bar.setIndeterminate(true);
            new Settelement_panel.Worker().execute();

        }
    }//GEN-LAST:event_ok_btnActionPerformed

    private void comfirm_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comfirm_btnActionPerformed
        // TODO add your handling code here:
        
      boolean x=  data_source.confirmDataUpload(tables);
        if(x){
        JOptionPane.showMessageDialog(null, "تم التأكيد");
        }
        else {
                JOptionPane.showMessageDialog(null, "لم يتم التأكيد ");

        }
    }//GEN-LAST:event_comfirm_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JButton browser_btn;
    private javax.swing.JButton comfirm_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ok_btn;
    private javax.swing.JTextField path_TF;
    private javax.swing.JFileChooser settelement_FC;
    // End of variables declaration//GEN-END:variables
}
