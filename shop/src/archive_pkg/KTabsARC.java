/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archive_pkg;

import javax.swing.JFrame;
import shop.data_source_pkg.DataSourc;

/**
 *
 * @author Comu City
 */
public class KTabsARC extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel3
     */
    DataSourc data_source;
    JFrame myFrame;
    int seasonID;
    KVariatiesARC K_VariatiesARC;
    KChmicalARC K_ChmicalARC;
    KLabourARC K_LabourARC;

    public KTabsARC(JFrame myFrame, DataSourc data_source, int seasonID) {
        this.data_source = data_source;
        this.myFrame = myFrame;
        this.seasonID = seasonID;
        K_VariatiesARC = new KVariatiesARC(myFrame, data_source, seasonID);
        K_ChmicalARC = new KChmicalARC(myFrame, data_source, seasonID);
        K_LabourARC = new KLabourARC(myFrame, data_source, seasonID);

        initComponents();

        CHSupplier_tab.add(K_ChmicalARC);
        Varaites_tab.add(K_VariatiesARC);
        labour_tab.add(K_LabourARC);
    }

    public void refrish(int seasonID) {

        K_VariatiesARC.inatiatePage(seasonID);
        K_ChmicalARC.inatiatePage(seasonID);
        K_LabourARC.inatiatePage(seasonID);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        labour_tab = new javax.swing.JPanel();
        CHSupplier_tab = new javax.swing.JPanel();
        Varaites_tab = new javax.swing.JPanel();

        setLayout(new javax.swing.OverlayLayout(this));

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labour_tab.setLayout(new javax.swing.OverlayLayout(labour_tab));
        jTabbedPane1.addTab("العمالة", labour_tab);

        CHSupplier_tab.setLayout(new javax.swing.OverlayLayout(CHSupplier_tab));
        jTabbedPane1.addTab("موردين الكيماوي", CHSupplier_tab);

        Varaites_tab.setLayout(new javax.swing.OverlayLayout(Varaites_tab));
        jTabbedPane1.addTab("منوعات كريم", Varaites_tab);

        add(jTabbedPane1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CHSupplier_tab;
    private javax.swing.JPanel Varaites_tab;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel labour_tab;
    // End of variables declaration//GEN-END:variables
}
