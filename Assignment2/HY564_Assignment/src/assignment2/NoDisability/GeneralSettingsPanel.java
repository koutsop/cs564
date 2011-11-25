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
public class GeneralSettingsPanel extends javax.swing.JPanel {

    /** Creates new form GeneralSettingsPanel */
    public GeneralSettingsPanel() {
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

        leftPanel = new widgets.panel.AdaptivePanel();
        centerPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        startupCheckBox = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptiveComboBox1 = new widgets.combobox.AdaptiveComboBox();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptiveComboBox2 = new widgets.combobox.AdaptiveComboBox();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        adaptiveSpinner1 = new widgets.spinner.AdaptiveSpinner();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        previewLabel = new widgets.label.AdaptiveLabel();
        rightPanel = new widgets.panel.AdaptivePanel();

        setPreferredSize(new java.awt.Dimension(999, 300));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        leftPanel.setPreferredSize(new java.awt.Dimension(100, 600));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        add(leftPanel);

        centerPanel.setLayout(new javax.swing.BoxLayout(centerPanel, javax.swing.BoxLayout.PAGE_AXIS));

        adaptivePanel4.setPreferredSize(new java.awt.Dimension(943, 50));

        startupCheckBox.setHorizontalAlignment(0);
        startupCheckBox.setText("Έναρξη εφαρμογής κατά την εκκίνηση του λειτουργικού");

        javax.swing.GroupLayout adaptivePanel4Layout = new javax.swing.GroupLayout(adaptivePanel4);
        adaptivePanel4.setLayout(adaptivePanel4Layout);
        adaptivePanel4Layout.setHorizontalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptivePanel4Layout.createSequentialGroup()
                .addComponent(startupCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
        );
        adaptivePanel4Layout.setVerticalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adaptivePanel4Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(startupCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        centerPanel.add(adaptivePanel4);

        adaptivePanel1.setMaximumSize(new java.awt.Dimension(1000, 20));
        adaptivePanel1.setPreferredSize(new java.awt.Dimension(470, 20));
        adaptivePanel1.setLayout(new javax.swing.BoxLayout(adaptivePanel1, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveLabel1.setText("Γραμματοσειρά: ");
        adaptivePanel1.add(adaptiveLabel1);

        adaptiveComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arial", "Comic Sans MS", "Dialog", "Magneto", "Papyrus", "Times New Roman", "" }));
        adaptiveComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveComboBox1ActionPerformed(evt);
            }
        });
        adaptivePanel1.add(adaptiveComboBox1);

        adaptivePanel2.setPreferredSize(new java.awt.Dimension(19, 20));

        javax.swing.GroupLayout adaptivePanel2Layout = new javax.swing.GroupLayout(adaptivePanel2);
        adaptivePanel2.setLayout(adaptivePanel2Layout);
        adaptivePanel2Layout.setHorizontalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        adaptivePanel2Layout.setVerticalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        adaptivePanel1.add(adaptivePanel2);

        adaptiveLabel2.setText("Στύλ: ");
        adaptivePanel1.add(adaptiveLabel2);

        adaptiveComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plain", "Bold", "Italic", "Bold Italic" }));
        adaptivePanel1.add(adaptiveComboBox2);

        adaptivePanel3.setPreferredSize(new java.awt.Dimension(19, 20));

        javax.swing.GroupLayout adaptivePanel3Layout = new javax.swing.GroupLayout(adaptivePanel3);
        adaptivePanel3.setLayout(adaptivePanel3Layout);
        adaptivePanel3Layout.setHorizontalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        adaptivePanel3Layout.setVerticalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        adaptivePanel1.add(adaptivePanel3);

        adaptiveLabel3.setText("Μέγεθος: ");
        adaptivePanel1.add(adaptiveLabel3);

        adaptiveSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 60, 1));
        adaptivePanel1.add(adaptiveSpinner1);

        centerPanel.add(adaptivePanel1);

        adaptivePanel7.setPreferredSize(new java.awt.Dimension(943, 100));

        previewLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        previewLabel.setText("Έτσι θα φαίνεται το κείμενό σας!");

        javax.swing.GroupLayout adaptivePanel7Layout = new javax.swing.GroupLayout(adaptivePanel7);
        adaptivePanel7.setLayout(adaptivePanel7Layout);
        adaptivePanel7Layout.setHorizontalGroup(
            adaptivePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
            .addGroup(adaptivePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adaptivePanel7Layout.createSequentialGroup()
                    .addGap(0, 261, Short.MAX_VALUE)
                    .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 261, Short.MAX_VALUE)))
        );
        adaptivePanel7Layout.setVerticalGroup(
            adaptivePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
            .addGroup(adaptivePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adaptivePanel7Layout.createSequentialGroup()
                    .addGap(0, 144, Short.MAX_VALUE)
                    .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 144, Short.MAX_VALUE)))
        );

        centerPanel.add(adaptivePanel7);

        add(centerPanel);

        rightPanel.setPreferredSize(new java.awt.Dimension(100, 600));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        add(rightPanel);
    }// </editor-fold>//GEN-END:initComponents

private void adaptiveComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveComboBox1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_adaptiveComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.combobox.AdaptiveComboBox adaptiveComboBox1;
    private widgets.combobox.AdaptiveComboBox adaptiveComboBox2;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.spinner.AdaptiveSpinner adaptiveSpinner1;
    private widgets.panel.AdaptivePanel centerPanel;
    private widgets.panel.AdaptivePanel leftPanel;
    private widgets.label.AdaptiveLabel previewLabel;
    private widgets.panel.AdaptivePanel rightPanel;
    private widgets.checkbox.AdaptiveCheckBox startupCheckBox;
    // End of variables declaration//GEN-END:variables
}
