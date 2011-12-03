/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddContactResults.java
 *
 * Created on Nov 26, 2011, 9:40:23 PM
 */
package assignment2.LowVision;

import assignment2.NoDisability.Groups;
import assignment2.NoDisability.PagesNavigationButtons;
import javax.swing.JPanel;
import utilities.Adaptation;

/**
 *
 * @author Marigianna
 */
public class AddContactsInTeam extends javax.swing.JPanel {
    /** Creates new form AddContactResults */
    public AddContactsInTeam() {
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
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel13 = new widgets.panel.AdaptivePanel();
        picturePanel7 = new widgets.panel.AdaptivePanel();
        descrPanel7 = new widgets.panel.AdaptivePanel();
        adaptiveLabel21 = new widgets.label.AdaptiveLabel();
        adaptiveButton9 = new widgets.button.AdaptiveButton();
        adaptivePanel14 = new widgets.panel.AdaptivePanel();
        picturePanel8 = new widgets.panel.AdaptivePanel();
        descrPanel8 = new widgets.panel.AdaptivePanel();
        adaptiveLabel23 = new widgets.label.AdaptiveLabel();
        adaptiveButton10 = new widgets.button.AdaptiveButton();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        picturePanel1 = new widgets.panel.AdaptivePanel();
        descrPanel1 = new widgets.panel.AdaptivePanel();
        adaptiveLabel9 = new widgets.label.AdaptiveLabel();
        adaptiveButton3 = new widgets.button.AdaptiveButton();
        adaptivePanel12 = new widgets.panel.AdaptivePanel();
        picturePanel6 = new widgets.panel.AdaptivePanel();
        descrPanel6 = new widgets.panel.AdaptivePanel();
        adaptiveLabel19 = new widgets.label.AdaptiveLabel();
        adaptiveButton8 = new widgets.button.AdaptiveButton();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        contentPanel.setLayout(new java.awt.BorderLayout());

        adaptivePanel1.setLayout(new java.awt.GridLayout(2, 1, 20, 20));

        adaptivePanel3.setLayout(new javax.swing.BoxLayout(adaptivePanel3, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        adaptiveLabel2.setText("Επιλέξτε τις επαφές που θέλετε να προσθέσετε ή να αφαιρέσετε από την ομάδα");
        adaptivePanel3.add(adaptiveLabel2);

        adaptivePanel1.add(adaptivePanel3);

        adaptivePanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        adaptiveButton1.setText("Πίσω στις ομάδες");
        adaptiveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton1ActionPerformed(evt);
            }
        });
        adaptivePanel4.add(adaptiveButton1);

        adaptivePanel1.add(adaptivePanel4);

        contentPanel.add(adaptivePanel1, java.awt.BorderLayout.NORTH);

        adaptivePanel2.setLayout(new java.awt.GridLayout(3, 3, 20, 20));

        adaptivePanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
            .addGap(0, 98, Short.MAX_VALUE)
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

        adaptiveButton9.setText("Αφαίρεση");
        descrPanel7.add(adaptiveButton9);

        adaptivePanel13.add(descrPanel7, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel13);

        adaptivePanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
            .addGap(0, 98, Short.MAX_VALUE)
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

        adaptiveButton10.setText("Αφαίρεση");
        descrPanel8.add(adaptiveButton10);

        adaptivePanel14.add(descrPanel8, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel14);

        adaptivePanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 153)));
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
            .addGap(0, 90, Short.MAX_VALUE)
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

        adaptiveButton3.setText("Προσθήκη");
        descrPanel1.add(adaptiveButton3);

        adaptivePanel7.add(descrPanel1, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel7);

        adaptivePanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
            .addGap(0, 98, Short.MAX_VALUE)
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

        adaptiveButton8.setText("Αφαίρεση");
        descrPanel6.add(adaptiveButton8);

        adaptivePanel12.add(descrPanel6, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel12);

        contentPanel.add(adaptivePanel2, java.awt.BorderLayout.CENTER);

        adaptivePanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        adaptivePanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        contentPanel.add(adaptivePanel5, java.awt.BorderLayout.PAGE_END);

        add(contentPanel);
    }// </editor-fold>//GEN-END:initComponents

private void adaptiveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton1ActionPerformed
	JPanel myParent = (JPanel)getParent();
	Groups r = new Groups();
	r.setVisible(true);
	myParent.removeAll();
	myParent.add(r);
	myParent.repaint();
	myParent.validate();
}//GEN-LAST:event_adaptiveButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.button.AdaptiveButton adaptiveButton10;
    private widgets.button.AdaptiveButton adaptiveButton3;
    private widgets.button.AdaptiveButton adaptiveButton8;
    private widgets.button.AdaptiveButton adaptiveButton9;
    private widgets.label.AdaptiveLabel adaptiveLabel19;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel21;
    private widgets.label.AdaptiveLabel adaptiveLabel23;
    private widgets.label.AdaptiveLabel adaptiveLabel9;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel12;
    private widgets.panel.AdaptivePanel adaptivePanel13;
    private widgets.panel.AdaptivePanel adaptivePanel14;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel contentPanel;
    private widgets.panel.AdaptivePanel descrPanel1;
    private widgets.panel.AdaptivePanel descrPanel6;
    private widgets.panel.AdaptivePanel descrPanel7;
    private widgets.panel.AdaptivePanel descrPanel8;
    private widgets.panel.AdaptivePanel picturePanel1;
    private widgets.panel.AdaptivePanel picturePanel6;
    private widgets.panel.AdaptivePanel picturePanel7;
    private widgets.panel.AdaptivePanel picturePanel8;
    // End of variables declaration//GEN-END:variables
}
