/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GeneralSettingsPanel.java
 *
 * Created on Nov 25, 2011, 1:25:47 PM
 */
package assignment2.NoDisability;

/**
 *
 * @author Marigianna
 */
public class NotificationsSettingsPanel extends javax.swing.JPanel {

    /** Creates new form GeneralSettingsPanel */
    public NotificationsSettingsPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptiveCheckBox8 = new widgets.checkbox.AdaptiveCheckBox();
        leftPanel = new widgets.panel.AdaptivePanel();
        centerPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox1 = new widgets.checkbox.AdaptiveCheckBox();
        adaptiveCheckBox2 = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox3 = new widgets.checkbox.AdaptiveCheckBox();
        adaptiveCheckBox4 = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel11 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox5 = new widgets.checkbox.AdaptiveCheckBox();
        adaptiveCheckBox7 = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel6 = new widgets.panel.AdaptivePanel();
        adaptiveLabel4 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox6 = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveCheckBox9 = new widgets.checkbox.AdaptiveCheckBox();
        rightPanel = new widgets.panel.AdaptivePanel();

        adaptiveCheckBox8.setText("Προβολή ειδοποιήσεων");

        javax.swing.GroupLayout adaptivePanel5Layout = new javax.swing.GroupLayout(adaptivePanel5);
        adaptivePanel5.setLayout(adaptivePanel5Layout);
        adaptivePanel5Layout.setHorizontalGroup(
            adaptivePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptivePanel5Layout.createSequentialGroup()
                .addComponent(adaptiveCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(653, Short.MAX_VALUE))
        );
        adaptivePanel5Layout.setVerticalGroup(
            adaptivePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptivePanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adaptiveCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setMaximumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(999, 500));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        leftPanel.setMaximumSize(new java.awt.Dimension(100, 300));
        leftPanel.setMinimumSize(new java.awt.Dimension(100, 300));
        leftPanel.setPreferredSize(new java.awt.Dimension(100, 300));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(leftPanel);

        centerPanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        centerPanel.setPreferredSize(new java.awt.Dimension(943, 300));
        centerPanel.setLayout(new java.awt.GridLayout(5, 1, 20, 20));

        adaptivePanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        adaptivePanel2.setPreferredSize(new java.awt.Dimension(790, 65));
        adaptivePanel2.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        adaptiveLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel1.setText("Ειδοποιήσεις Chat");
        adaptivePanel2.add(adaptiveLabel1);

        adaptiveCheckBox1.setText("Αναπαραγωγή ήχου");
        adaptivePanel2.add(adaptiveCheckBox1);

        adaptiveCheckBox2.setText("Προβολή ειδοποποιήσεων");
        adaptivePanel2.add(adaptiveCheckBox2);

        centerPanel.add(adaptivePanel2);

        adaptivePanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        adaptivePanel3.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        adaptiveLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel2.setText("Ειδοποιήσεις Κλήσης");
        adaptivePanel3.add(adaptiveLabel2);

        adaptiveCheckBox3.setText("Αναπαραγωγή ήχου");
        adaptivePanel3.add(adaptiveCheckBox3);

        adaptiveCheckBox4.setText("Προβολή ειδοποιήσεων");
        adaptivePanel3.add(adaptiveCheckBox4);

        centerPanel.add(adaptivePanel3);

        adaptivePanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        adaptivePanel11.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        adaptiveLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel3.setText("Ειδοποιήσεις Κλήσης");
        adaptivePanel11.add(adaptiveLabel3);

        adaptiveCheckBox5.setText("Αναπαραγωγή ήχου");
        adaptivePanel11.add(adaptiveCheckBox5);

        adaptiveCheckBox7.setText("Προβολή ειδοποιήσεων");
        adaptivePanel11.add(adaptiveCheckBox7);

        centerPanel.add(adaptivePanel11);

        adaptivePanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        adaptivePanel6.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        adaptiveLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel4.setText("Ειδοποιήσεις Εισόδου Επαφών");
        adaptivePanel6.add(adaptiveLabel4);

        adaptiveCheckBox6.setText("Ενεργοποίηση όλων των ειδοποιήσεων");
        adaptivePanel6.add(adaptiveCheckBox6);

        centerPanel.add(adaptivePanel6);

        adaptiveCheckBox9.setText("Προβολή ειδοποιήσεων");

        javax.swing.GroupLayout adaptivePanel4Layout = new javax.swing.GroupLayout(adaptivePanel4);
        adaptivePanel4.setLayout(adaptivePanel4Layout);
        adaptivePanel4Layout.setHorizontalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptivePanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adaptiveCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(733, Short.MAX_VALUE))
        );
        adaptivePanel4Layout.setVerticalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptivePanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adaptiveCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        centerPanel.add(adaptivePanel4);

        add(centerPanel);

        rightPanel.setPreferredSize(new java.awt.Dimension(100, 300));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        add(rightPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox1;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox2;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox3;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox4;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox5;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox6;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox7;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox8;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox9;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.label.AdaptiveLabel adaptiveLabel4;
    private widgets.panel.AdaptivePanel adaptivePanel11;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel6;
    private widgets.panel.AdaptivePanel centerPanel;
    private widgets.panel.AdaptivePanel leftPanel;
    private widgets.panel.AdaptivePanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
