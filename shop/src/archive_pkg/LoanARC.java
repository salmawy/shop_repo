/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archive_pkg;

import java.util.Arrays;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import shop.GUI_attachement_pkg.PersonName_STF;
import shop.data_source_pkg.DataSourc;

/**
 *
 * @author Ahmed
 */
public class LoanARC extends javax.swing.JPanel {

    /**
     * Creates new form LoanARC
     */
    DataSourc data_source;
    JFrame myFrame;
    Vector<Object> orderHeaderData;

    int seasonID;
    int fridageNumber;

    public LoanARC(JFrame myFrame, DataSourc data_source, int seasonID, int fridageNumber) {
        this.data_source = data_source;
        this.myFrame = myFrame;

        this.seasonID = seasonID;
        this.fridageNumber = fridageNumber;

        initComponents();
    }
void refrishPage(int seasonID ,int fridageNumber){
this.seasonID=seasonID;
this.fridageNumber=fridageNumber;


}
    String NormalizeinArabic(String str) {

        char[] arabicChars = {'٠', '١', '٢', '٣', '٤', '٥', '٦', '٧', '٨', '٩'};
        if (str == null) {
            return str;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                builder.append(arabicChars[(int) (str.charAt(i)) - 48]);
            } else {
                builder.append(str.charAt(i));
            }
        }
//        System.out.println("Number in English : " + str);
//        System.out.println("Number In Arabic : " + builder.toString());
        return builder.toString();
    }

    Vector<Object> deepCopy(Vector<Object> source) {
        Vector<Object> temp_source;
        Vector<Object> temp_destination;
        Object x;
        Vector<Object> distination = new Vector<>();
        for (int i = 0; i < source.size(); i++) {
            temp_source = (Vector<Object>) source.get(i);
            //distination.add(temp);
            temp_destination = new Vector<>();
            for (int k = 0; k < temp_source.size(); k++) {

                x = temp_source.get(k);
                temp_destination.add(x);

            }
            distination.add(temp_destination);

        }
        return distination;
    }

    void searchForSeller(String name) {
        
        
        double sellerLoan = data_source.getSellerLoan(data_source.sellerSelectAll(name).getId(), seasonID);
        double totalPrice = data_source.getSellerOrderTotalPrice(name, seasonID);

        if (sellerLoan == -1) {
            JOptionPane.showMessageDialog(null, "لا توجد نتائج ");

        } else {
            DefaultTableModel dtm = (DefaultTableModel) sellerLoans_table.getModel();
            Vector<Object> row = new Vector();
            row.add(new Vector<Object>(Arrays.asList(String.valueOf(totalPrice),NormalizeinArabic(String.valueOf(sellerLoan)), name)));
            dtm.setDataVector(row, VsellersLoans_columnTitles);

            sellerLoans_table.setModel(dtm);
            Vector<Object> data = data_source.getSellerOrders(name, 1, 1, seasonID);
            orderHeaderData = deepCopy(data);

            dtm = (DefaultTableModel) orderHeader_table.getModel();
            dtm.setDataVector(data, orderHeader_columnTitles);
            orderHeader_table.setModel(dtm);
//getSellerInstallement

            Vector<Object> data2 = data_source.getSellerInstallement(name, 1, seasonID);

            DefaultTableModel dtm2 = (DefaultTableModel) inst_table.getModel();
            dtm2.setDataVector(data2, inst_columnTitles);
            inst_table.setModel(dtm2);
        }
    }

    void setOrderDetail_tableSize() {
//detail_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumn column = null;
        for (int i = 0; i < orderDetail_table.getColumnModel().getColumnCount(); i++) {
            column = orderDetail_table.getColumnModel().getColumn(i);

            switch (i) {
                case 0:
                    column.setPreferredWidth(200);
                    break;
                case 1:
                    column.setPreferredWidth(100);
                    break;
                case 2:
                    column.setPreferredWidth(80);
                    break;
                case 3:
                    column.setPreferredWidth(80);
                    break;
                case 4:
                    column.setPreferredWidth(100);
                    break;
                case 5:
                    column.setPreferredWidth(100);
                    break;
                case 6:
                    column.setPreferredWidth(150);
                    break;
            }
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

        jScrollPane5 = new javax.swing.JScrollPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sellerLoans_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Permenant_RB = new javax.swing.JRadioButton();
        temp_RB = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        search_btn = new javax.swing.JButton();
        name_TF1 = new PersonName_STF(myFrame, "seller", data_source);
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderDetail_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderHeader_table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inst_table = new javax.swing.JTable();

        setLayout(new javax.swing.OverlayLayout(this));

        jSplitPane2.setDividerLocation(300);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 165, 46), 3), "البحث عن بياع", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        sellerLoans_table.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sellerLoans_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "إجمالي ثمن الموز", "المبلغ المستحق", "اسم البياع"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sellerLoans_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        sellerLoans_table.setRowHeight(25);
        sellerLoans_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerLoans_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(sellerLoans_table);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        Permenant_RB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Permenant_RB.setText("دائم");
        Permenant_RB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Permenant_RB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Permenant_RB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Permenant_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Permenant_RBActionPerformed(evt);
            }
        });

        temp_RB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        temp_RB.setText("مؤقت");
        temp_RB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temp_RB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        temp_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temp_RBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Permenant_RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temp_RB)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Permenant_RB)
                    .addComponent(temp_RB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        search_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        search_btn.setText("بحث");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        name_TF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name_TF1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("اسم البياع:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name_TF1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_TF1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane2.setTopComponent(jPanel2);

        orderDetail_table.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        orderDetail_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "اسم الفاتورة", "المبلغ", "فئة", "الغدد", "الصافي", "الوزن القائم", "المنتج"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderDetail_table.setRowHeight(25);
        jScrollPane4.setViewportView(orderDetail_table);

        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        jSplitPane3.setDividerLocation(600);

        jPanel5.setLayout(new javax.swing.OverlayLayout(jPanel5));

        orderHeader_table.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        orderHeader_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "إجمالي المبلغ", "رقم الثلاجة", "تاريخ الطلب"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderHeader_table.setRowHeight(25);
        orderHeader_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderHeader_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(orderHeader_table);

        jPanel5.add(jScrollPane3);

        jSplitPane3.setRightComponent(jPanel5);

        jPanel7.setLayout(new javax.swing.OverlayLayout(jPanel7));

        inst_table.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        inst_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ملاحظات", "المبلغ", "تاريخ الدفع"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inst_table.setRowHeight(25);
        jScrollPane1.setViewportView(inst_table);

        jPanel7.add(jScrollPane1);

        jSplitPane3.setLeftComponent(jPanel7);

        jPanel1.add(jSplitPane3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setBottomComponent(jPanel6);

        jScrollPane5.setViewportView(jSplitPane2);

        add(jScrollPane5);
    }// </editor-fold>//GEN-END:initComponents

    private void sellerLoans_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerLoans_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) sellerLoans_table.getModel();
        Vector<Object> row = (Vector<Object>) dtm.getDataVector().get(sellerLoans_table.getSelectedRow());
        String sellerName = (row.get(2).toString());
        searchForSeller(sellerName);
    }//GEN-LAST:event_sellerLoans_tableMouseClicked

    private void Permenant_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Permenant_RBActionPerformed
        // TODO add your handling code here:
        //PERMENANT
        if (Permenant_RB.isSelected()) {
            Object[][] data = data_source.getSellersLoans("PERMENANT", this.seasonID);

            if (data == null) {
                JOptionPane.showMessageDialog(null, "لا توجد نتائج ");

            } else {
                DefaultTableModel dtm = (DefaultTableModel) sellerLoans_table.getModel();
                dtm.setDataVector(data, sellersLoans_columnTitles);
                sellerLoans_table.setModel(dtm);
            }
        }
    }//GEN-LAST:event_Permenant_RBActionPerformed

    private void temp_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temp_RBActionPerformed
        // TODO add your handling code here:
        //TEMPERORY
        if (temp_RB.isSelected()) {
            Object[][] data = data_source.getSellersLoans("TEMPERORY", this.seasonID);

            if (data == null) {
                JOptionPane.showMessageDialog(null, "لا توجد نتائج ");

            } else {
                DefaultTableModel dtm = (DefaultTableModel) sellerLoans_table.getModel();
                dtm.setDataVector(data, sellersLoans_columnTitles);
                sellerLoans_table.setModel(dtm);
            }
        }
    }//GEN-LAST:event_temp_RBActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
        String sellerName = name_TF1.getText();
        searchForSeller(sellerName);
    }//GEN-LAST:event_search_btnActionPerformed

    private void orderHeader_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHeader_tableMouseClicked
        // TODO add your handling code here:
        int index = orderHeader_table.getSelectedRow();
        Object fridageNumber = ((Vector<Object>) (((DefaultTableModel) (orderHeader_table.getModel())).getDataVector().get(index))).get(1);
        if (!fridageNumber.toString().isEmpty()) {
            Vector<Object> row = (Vector<Object>) orderHeaderData.get(index);

            int id = Integer.parseInt(row.get(3).toString());

           Vector<Object>data = data_source.getSellerOrderDetail(id);
            if (data != null) {

                DefaultTableModel dtm = (DefaultTableModel) orderDetail_table.getModel();
                dtm.setDataVector(data, orderDetail_columnTitles);
                orderDetail_table.setModel(dtm);
                setOrderDetail_tableSize();
            }
        }
    }//GEN-LAST:event_orderHeader_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Permenant_RB;
    private javax.swing.JTable inst_table;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTextField name_TF1;
    private javax.swing.JTable orderDetail_table;
    private javax.swing.JTable orderHeader_table;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton search_btn;
    private javax.swing.JTable sellerLoans_table;
    private javax.swing.JRadioButton temp_RB;
    // End of variables declaration//GEN-END:variables

    String[] sellersLoans_columnTitles = new String[]{
      "إجمالي ثمن الموز",  "المبلغ المستحق", "اسم البياع"
    };
    Vector<String> VsellersLoans_columnTitles = new Vector(Arrays.asList("إجمالي ثمن الموز",  "المبلغ المستحق", "اسم البياع"));

    Vector<String>orderDetail_columnTitles =  new Vector<String>(Arrays.asList(
        "اسم العميل", "المبلغ", "فئة", "الغدد", "الصافي", "الوزن القائم", "المنتج"
    ));
    Vector<String> orderHeader_columnTitles = new Vector<String>(Arrays.asList("إجمالي المبلغ", "رقم الثلاجة", "تاريخ الطلب"));

    Vector<String> inst_columnTitles = new Vector<String>(Arrays.asList("ملاحظات", "المبلغ", "تاريخ الدفع"));

}
