/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddContactResults.java
 *
 * Created on Nov 26, 2011, 9:40:23 PM
 */
package assignment2.NoDisability;

import javax.swing.JPanel;
import utilities.Adaptation;

/**
 *
 * @author Marigianna
 */
public class AddContactResults extends javax.swing.JPanel {
    /** Creates new form AddContactResults */
    public AddContactResults() {
        initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		adaptivePanel5.add(new PagesNavigationButtons());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        adaptiveLabel4 = new widgets.label.AdaptiveLabel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel8 = new widgets.panel.AdaptivePanel();
        picturePanel2 = new widgets.panel.AdaptivePanel();
        descrPanel2 = new widgets.panel.AdaptivePanel();
        adaptiveLabel11 = new widgets.label.AdaptiveLabel();
        adaptiveLabel12 = new widgets.label.AdaptiveLabel();
        adaptiveButton4 = new widgets.button.AdaptiveButton();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        picturePanel1 = new widgets.panel.AdaptivePanel();
        descrPanel1 = new widgets.panel.AdaptivePanel();
        adaptiveLabel9 = new widgets.label.AdaptiveLabel();
        adaptiveLabel10 = new widgets.label.AdaptiveLabel();
        adaptiveButton3 = new widgets.button.AdaptiveButton();
        adaptivePanel9 = new widgets.panel.AdaptivePanel();
        picturePanel3 = new widgets.panel.AdaptivePanel();
        descrPanel3 = new widgets.panel.AdaptivePanel();
        adaptiveLabel13 = new widgets.label.AdaptiveLabel();
        adaptiveLabel14 = new widgets.label.AdaptiveLabel();
        adaptiveButton5 = new widgets.button.AdaptiveButton();
        adaptivePanel10 = new widgets.panel.AdaptivePanel();
        picturePanel4 = new widgets.panel.AdaptivePanel();
        descrPanel4 = new widgets.panel.AdaptivePanel();
        adaptiveLabel15 = new widgets.label.AdaptiveLabel();
        adaptiveLabel16 = new widgets.label.AdaptiveLabel();
        adaptiveButton6 = new widgets.button.AdaptiveButton();
        adaptivePanel11 = new widgets.panel.AdaptivePanel();
        picturePanel5 = new widgets.panel.AdaptivePanel();
        descrPanel5 = new widgets.panel.AdaptivePanel();
        adaptiveLabel17 = new widgets.label.AdaptiveLabel();
        adaptiveLabel18 = new widgets.label.AdaptiveLabel();
        adaptiveButton7 = new widgets.button.AdaptiveButton();
        adaptivePanel12 = new widgets.panel.AdaptivePanel();
        picturePanel6 = new widgets.panel.AdaptivePanel();
        descrPanel6 = new widgets.panel.AdaptivePanel();
        adaptiveLabel19 = new widgets.label.AdaptiveLabel();
        adaptiveLabel20 = new widgets.label.AdaptiveLabel();
        adaptiveButton8 = new widgets.button.AdaptiveButton();
        adaptivePanel13 = new widgets.panel.AdaptivePanel();
        picturePanel7 = new widgets.panel.AdaptivePanel();
        descrPanel7 = new widgets.panel.AdaptivePanel();
        adaptiveLabel21 = new widgets.label.AdaptiveLabel();
        adaptiveLabel22 = new widgets.label.AdaptiveLabel();
        adaptiveButton9 = new widgets.button.AdaptiveButton();
        adaptivePanel14 = new widgets.panel.AdaptivePanel();
        picturePanel8 = new widgets.panel.AdaptivePanel();
        descrPanel8 = new widgets.panel.AdaptivePanel();
        adaptiveLabel23 = new widgets.label.AdaptiveLabel();
        adaptiveLabel24 = new widgets.label.AdaptiveLabel();
        adaptiveButton10 = new widgets.button.AdaptiveButton();
        adaptivePanel15 = new widgets.panel.AdaptivePanel();
        picturePanel9 = new widgets.panel.AdaptivePanel();
        descrPanel9 = new widgets.panel.AdaptivePanel();
        adaptiveLabel25 = new widgets.label.AdaptiveLabel();
        adaptiveLabel26 = new widgets.label.AdaptiveLabel();
        adaptiveButton11 = new widgets.button.AdaptiveButton();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        contentPanel.setLayout(new java.awt.BorderLayout());

        adaptivePanel1.setLayout(new java.awt.GridLayout(2, 1, 20, 20));

        adaptivePanel3.setLayout(new javax.swing.BoxLayout(adaptivePanel3, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        adaptiveLabel2.setText("Βρέθηκαν περισσότερα από 200 αποτελέσματα ");
        adaptivePanel3.add(adaptiveLabel2);

        adaptiveLabel1.setText("για");
        adaptivePanel3.add(adaptiveLabel1);

        adaptiveLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel3.setText("Νικόλαος");
        adaptivePanel3.add(adaptiveLabel3);

        adaptiveLabel4.setText(",εμφάνιση αποτελεσμάτων 1-10 από τα 200.");
        adaptivePanel3.add(adaptiveLabel4);

        adaptivePanel1.add(adaptivePanel3);

        adaptivePanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        adaptiveButton1.setText("Νέα Αναζήτηση");
        adaptiveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton1ActionPerformed(evt);
            }
        });
        adaptivePanel4.add(adaptiveButton1);

        adaptivePanel1.add(adaptivePanel4);

        contentPanel.add(adaptivePanel1, java.awt.BorderLayout.NORTH);

        adaptivePanel2.setLayout(new java.awt.GridLayout(3, 3, 20, 20));

        adaptivePanel8.setMaximumSize(new java.awt.Dimension(150, 100));
        adaptivePanel8.setMinimumSize(new java.awt.Dimension(150, 100));
        adaptivePanel8.setPreferredSize(new java.awt.Dimension(150, 100));
        adaptivePanel8.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel2.setFunction("koutsopImg");
        picturePanel2.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel2.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel2Layout = new javax.swing.GroupLayout(picturePanel2);
        picturePanel2.setLayout(picturePanel2Layout);
        picturePanel2Layout.setHorizontalGroup(
            picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel2Layout.setVerticalGroup(
            picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        adaptivePanel8.add(picturePanel2, java.awt.BorderLayout.WEST);

        descrPanel2.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel2.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel2.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel2.setLayout(new javax.swing.BoxLayout(descrPanel2, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel11.setText("Νικόλαος Κουτσόπουλος");
        descrPanel2.add(adaptiveLabel11);

        adaptiveLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        adaptiveLabel12.setText("Ελλάδα");
        descrPanel2.add(adaptiveLabel12);

        adaptiveButton4.setText("Προσθήκη");
        adaptiveButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton4ActionPerformed(evt);
            }
        });
        descrPanel2.add(adaptiveButton4);

        adaptivePanel8.add(descrPanel2, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel8);

        adaptivePanel7.setMaximumSize(new java.awt.Dimension(150, 100));
        adaptivePanel7.setMinimumSize(new java.awt.Dimension(150, 100));
        adaptivePanel7.setPreferredSize(new java.awt.Dimension(150, 100));
        adaptivePanel7.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel1.setFunction("koutsopImg");
        picturePanel1.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel1.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel1Layout = new javax.swing.GroupLayout(picturePanel1);
        picturePanel1.setLayout(picturePanel1Layout);
        picturePanel1Layout.setHorizontalGroup(
            picturePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel1Layout.setVerticalGroup(
            picturePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        adaptivePanel7.add(picturePanel1, java.awt.BorderLayout.WEST);

        descrPanel1.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel1.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel1.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel1.setLayout(new javax.swing.BoxLayout(descrPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel9.setText("Νικόλαος Κουτσόπουλος");
        descrPanel1.add(adaptiveLabel9);

        adaptiveLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        adaptiveLabel10.setText("Ελλάδα");
        descrPanel1.add(adaptiveLabel10);

        adaptiveButton3.setText("Προσθήκη");
        adaptiveButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton3ActionPerformed(evt);
            }
        });
        descrPanel1.add(adaptiveButton3);

        adaptivePanel7.add(descrPanel1, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel7);

        adaptivePanel9.setMaximumSize(new java.awt.Dimension(150, 100));
        adaptivePanel9.setMinimumSize(new java.awt.Dimension(150, 100));
        adaptivePanel9.setPreferredSize(new java.awt.Dimension(150, 100));
        adaptivePanel9.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel3.setFunction("koutsopImg");
        picturePanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel3.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel3Layout = new javax.swing.GroupLayout(picturePanel3);
        picturePanel3.setLayout(picturePanel3Layout);
        picturePanel3Layout.setHorizontalGroup(
            picturePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel3Layout.setVerticalGroup(
            picturePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        adaptivePanel9.add(picturePanel3, java.awt.BorderLayout.WEST);

        descrPanel3.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel3.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel3.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel3.setLayout(new javax.swing.BoxLayout(descrPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel13.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel13.setText("Νικόλαος Κουτσόπουλος");
        descrPanel3.add(adaptiveLabel13);

        adaptiveLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        adaptiveLabel14.setText("Ελλάδα");
        descrPanel3.add(adaptiveLabel14);

        adaptiveButton5.setText("Προσθήκη");
        adaptiveButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton5ActionPerformed(evt);
            }
        });
        descrPanel3.add(adaptiveButton5);

        adaptivePanel9.add(descrPanel3, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel9);

        adaptivePanel10.setMaximumSize(new java.awt.Dimension(150, 100));
        adaptivePanel10.setMinimumSize(new java.awt.Dimension(150, 100));
        adaptivePanel10.setPreferredSize(new java.awt.Dimension(150, 100));
        adaptivePanel10.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel4.setFunction("koutsopImg");
        picturePanel4.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel4.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel4Layout = new javax.swing.GroupLayout(picturePanel4);
        picturePanel4.setLayout(picturePanel4Layout);
        picturePanel4Layout.setHorizontalGroup(
            picturePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel4Layout.setVerticalGroup(
            picturePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        adaptivePanel10.add(picturePanel4, java.awt.BorderLayout.WEST);

        descrPanel4.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel4.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel4.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel4.setLayout(new javax.swing.BoxLayout(descrPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel15.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel15.setText("Νικόλαος Κουτσόπουλος");
        descrPanel4.add(adaptiveLabel15);

        adaptiveLabel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        adaptiveLabel16.setText("Ελλάδα");
        descrPanel4.add(adaptiveLabel16);

        adaptiveButton6.setText("Προσθήκη");
        adaptiveButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton6ActionPerformed(evt);
            }
        });
        descrPanel4.add(adaptiveButton6);

        adaptivePanel10.add(descrPanel4, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel10);

        adaptivePanel11.setMaximumSize(new java.awt.Dimension(150, 100));
        adaptivePanel11.setMinimumSize(new java.awt.Dimension(150, 100));
        adaptivePanel11.setPreferredSize(new java.awt.Dimension(150, 100));
        adaptivePanel11.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel5.setFunction("koutsopImg");
        picturePanel5.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel5.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel5Layout = new javax.swing.GroupLayout(picturePanel5);
        picturePanel5.setLayout(picturePanel5Layout);
        picturePanel5Layout.setHorizontalGroup(
            picturePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel5Layout.setVerticalGroup(
            picturePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        adaptivePanel11.add(picturePanel5, java.awt.BorderLayout.WEST);

        descrPanel5.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel5.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel5.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel5.setLayout(new javax.swing.BoxLayout(descrPanel5, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel17.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel17.setText("Νικόλαος Κουτσόπουλος");
        descrPanel5.add(adaptiveLabel17);

        adaptiveLabel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        adaptiveLabel18.setText("Ελλάδα");
        descrPanel5.add(adaptiveLabel18);

        adaptiveButton7.setText("Προσθήκη");
        adaptiveButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton7ActionPerformed(evt);
            }
        });
        descrPanel5.add(adaptiveButton7);

        adaptivePanel11.add(descrPanel5, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel11);

        adaptivePanel12.setMaximumSize(new java.awt.Dimension(150, 100));
        adaptivePanel12.setMinimumSize(new java.awt.Dimension(150, 100));
        adaptivePanel12.setPreferredSize(new java.awt.Dimension(150, 100));
        adaptivePanel12.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel6.setFunction("koutsopImg");
        picturePanel6.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel6.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel6Layout = new javax.swing.GroupLayout(picturePanel6);
        picturePanel6.setLayout(picturePanel6Layout);
        picturePanel6Layout.setHorizontalGroup(
            picturePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel6Layout.setVerticalGroup(
            picturePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        adaptivePanel12.add(picturePanel6, java.awt.BorderLayout.WEST);

        descrPanel6.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel6.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel6.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel6.setLayout(new javax.swing.BoxLayout(descrPanel6, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel19.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel19.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel19.setText("Νικόλαος Κουτσόπουλος");
        descrPanel6.add(adaptiveLabel19);

        adaptiveLabel20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        adaptiveLabel20.setText("Ελλάδα");
        descrPanel6.add(adaptiveLabel20);

        adaptiveButton8.setText("Προσθήκη");
        adaptiveButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton8ActionPerformed(evt);
            }
        });
        descrPanel6.add(adaptiveButton8);

        adaptivePanel12.add(descrPanel6, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel12);

        adaptivePanel13.setMaximumSize(new java.awt.Dimension(150, 100));
        adaptivePanel13.setMinimumSize(new java.awt.Dimension(150, 100));
        adaptivePanel13.setPreferredSize(new java.awt.Dimension(150, 100));
        adaptivePanel13.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel7.setFunction("koutsopImg");
        picturePanel7.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel7.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel7Layout = new javax.swing.GroupLayout(picturePanel7);
        picturePanel7.setLayout(picturePanel7Layout);
        picturePanel7Layout.setHorizontalGroup(
            picturePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel7Layout.setVerticalGroup(
            picturePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        adaptivePanel13.add(picturePanel7, java.awt.BorderLayout.WEST);

        descrPanel7.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel7.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel7.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel7.setLayout(new javax.swing.BoxLayout(descrPanel7, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel21.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel21.setText("Νικόλαος Κουτσόπουλος");
        descrPanel7.add(adaptiveLabel21);

        adaptiveLabel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        adaptiveLabel22.setText("Ελλάδα");
        descrPanel7.add(adaptiveLabel22);

        adaptiveButton9.setText("Προσθήκη");
        adaptiveButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton9ActionPerformed(evt);
            }
        });
        descrPanel7.add(adaptiveButton9);

        adaptivePanel13.add(descrPanel7, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel13);

        adaptivePanel14.setMaximumSize(new java.awt.Dimension(150, 100));
        adaptivePanel14.setMinimumSize(new java.awt.Dimension(150, 100));
        adaptivePanel14.setPreferredSize(new java.awt.Dimension(150, 100));
        adaptivePanel14.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel8.setFunction("koutsopImg");
        picturePanel8.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel8.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel8Layout = new javax.swing.GroupLayout(picturePanel8);
        picturePanel8.setLayout(picturePanel8Layout);
        picturePanel8Layout.setHorizontalGroup(
            picturePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel8Layout.setVerticalGroup(
            picturePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        adaptivePanel14.add(picturePanel8, java.awt.BorderLayout.WEST);

        descrPanel8.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel8.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel8.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel8.setLayout(new javax.swing.BoxLayout(descrPanel8, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel23.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel23.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel23.setText("Νικόλαος Κουτσόπουλος");
        descrPanel8.add(adaptiveLabel23);

        adaptiveLabel24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        adaptiveLabel24.setText("Ελλάδα");
        descrPanel8.add(adaptiveLabel24);

        adaptiveButton10.setText("Προσθήκη");
        adaptiveButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton10ActionPerformed(evt);
            }
        });
        descrPanel8.add(adaptiveButton10);

        adaptivePanel14.add(descrPanel8, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel14);

        adaptivePanel15.setMaximumSize(new java.awt.Dimension(150, 100));
        adaptivePanel15.setMinimumSize(new java.awt.Dimension(150, 100));
        adaptivePanel15.setPreferredSize(new java.awt.Dimension(150, 100));
        adaptivePanel15.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel9.setFunction("koutsopImg");
        picturePanel9.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel9.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel9Layout = new javax.swing.GroupLayout(picturePanel9);
        picturePanel9.setLayout(picturePanel9Layout);
        picturePanel9Layout.setHorizontalGroup(
            picturePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel9Layout.setVerticalGroup(
            picturePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        adaptivePanel15.add(picturePanel9, java.awt.BorderLayout.WEST);

        descrPanel9.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel9.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel9.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel9.setLayout(new javax.swing.BoxLayout(descrPanel9, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel25.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel25.setFont(new java.awt.Font("Tahoma", 1, 11));
        adaptiveLabel25.setText("Νικόλαος Κουτσόπουλος");
        descrPanel9.add(adaptiveLabel25);

        adaptiveLabel26.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 5, 5));
        adaptiveLabel26.setText("Ελλάδα");
        descrPanel9.add(adaptiveLabel26);

        adaptiveButton11.setText("Προσθήκη");
        adaptiveButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton11ActionPerformed(evt);
            }
        });
        descrPanel9.add(adaptiveButton11);

        adaptivePanel15.add(descrPanel9, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel15);

        contentPanel.add(adaptivePanel2, java.awt.BorderLayout.CENTER);

        adaptivePanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        adaptivePanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        contentPanel.add(adaptivePanel5, java.awt.BorderLayout.PAGE_END);

        add(contentPanel);
    }// </editor-fold>//GEN-END:initComponents

	private void AddContact () {
		JPanel myParent = (JPanel)getParent();

		// Instantiate the new screen
		AddContactRequest r = new AddContactRequest();
		r.setVisible(true);

		// Remove the contents of the content panel & add the new screen
		myParent.removeAll();
		myParent.add(r);
		myParent.repaint();
		myParent.validate();		
	}
	
private void adaptiveButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton3ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton3ActionPerformed

private void adaptiveButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton4ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton4ActionPerformed

private void adaptiveButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton5ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton5ActionPerformed

private void adaptiveButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton6ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton6ActionPerformed

private void adaptiveButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton7ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton7ActionPerformed

private void adaptiveButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton8ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton8ActionPerformed

private void adaptiveButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton9ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton9ActionPerformed

private void adaptiveButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton10ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton10ActionPerformed

private void adaptiveButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton11ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton11ActionPerformed

	private void adaptiveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton1ActionPerformed
		JPanel myParent = (JPanel)getParent();

		// Instantiate the new screen
		SearchForNewContact c	= new SearchForNewContact(); 
		c.setVisible(true);

		// Remove the contents of the content panel & add the new screen
		myParent.removeAll();
		myParent.add(c);
		myParent.repaint();
		myParent.validate();			
	}//GEN-LAST:event_adaptiveButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.button.AdaptiveButton adaptiveButton10;
    private widgets.button.AdaptiveButton adaptiveButton11;
    private widgets.button.AdaptiveButton adaptiveButton3;
    private widgets.button.AdaptiveButton adaptiveButton4;
    private widgets.button.AdaptiveButton adaptiveButton5;
    private widgets.button.AdaptiveButton adaptiveButton6;
    private widgets.button.AdaptiveButton adaptiveButton7;
    private widgets.button.AdaptiveButton adaptiveButton8;
    private widgets.button.AdaptiveButton adaptiveButton9;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel10;
    private widgets.label.AdaptiveLabel adaptiveLabel11;
    private widgets.label.AdaptiveLabel adaptiveLabel12;
    private widgets.label.AdaptiveLabel adaptiveLabel13;
    private widgets.label.AdaptiveLabel adaptiveLabel14;
    private widgets.label.AdaptiveLabel adaptiveLabel15;
    private widgets.label.AdaptiveLabel adaptiveLabel16;
    private widgets.label.AdaptiveLabel adaptiveLabel17;
    private widgets.label.AdaptiveLabel adaptiveLabel18;
    private widgets.label.AdaptiveLabel adaptiveLabel19;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel20;
    private widgets.label.AdaptiveLabel adaptiveLabel21;
    private widgets.label.AdaptiveLabel adaptiveLabel22;
    private widgets.label.AdaptiveLabel adaptiveLabel23;
    private widgets.label.AdaptiveLabel adaptiveLabel24;
    private widgets.label.AdaptiveLabel adaptiveLabel25;
    private widgets.label.AdaptiveLabel adaptiveLabel26;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.label.AdaptiveLabel adaptiveLabel4;
    private widgets.label.AdaptiveLabel adaptiveLabel9;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel10;
    private widgets.panel.AdaptivePanel adaptivePanel11;
    private widgets.panel.AdaptivePanel adaptivePanel12;
    private widgets.panel.AdaptivePanel adaptivePanel13;
    private widgets.panel.AdaptivePanel adaptivePanel14;
    private widgets.panel.AdaptivePanel adaptivePanel15;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel adaptivePanel8;
    private widgets.panel.AdaptivePanel adaptivePanel9;
    private widgets.panel.AdaptivePanel contentPanel;
    private widgets.panel.AdaptivePanel descrPanel1;
    private widgets.panel.AdaptivePanel descrPanel2;
    private widgets.panel.AdaptivePanel descrPanel3;
    private widgets.panel.AdaptivePanel descrPanel4;
    private widgets.panel.AdaptivePanel descrPanel5;
    private widgets.panel.AdaptivePanel descrPanel6;
    private widgets.panel.AdaptivePanel descrPanel7;
    private widgets.panel.AdaptivePanel descrPanel8;
    private widgets.panel.AdaptivePanel descrPanel9;
    private widgets.panel.AdaptivePanel picturePanel1;
    private widgets.panel.AdaptivePanel picturePanel2;
    private widgets.panel.AdaptivePanel picturePanel3;
    private widgets.panel.AdaptivePanel picturePanel4;
    private widgets.panel.AdaptivePanel picturePanel5;
    private widgets.panel.AdaptivePanel picturePanel6;
    private widgets.panel.AdaptivePanel picturePanel7;
    private widgets.panel.AdaptivePanel picturePanel8;
    private widgets.panel.AdaptivePanel picturePanel9;
    // End of variables declaration//GEN-END:variables
}
