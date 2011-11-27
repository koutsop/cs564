/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddContactSuccess.java
 *
 * Created on Nov 27, 2011, 12:30:29 PM
 */
package assignment2.NoDisability;

/**
 *
 * @author Marigianna
 */
public class AddContactSuccess extends javax.swing.JPanel {
    javax.swing.JPanel myParent;
    /** Creates new form AddContactSuccess */
    public AddContactSuccess(javax.swing.JPanel parent) {
        initComponents();
        this.myParent = parent;
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
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();

        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 500));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        contentPanel.setPreferredSize(new java.awt.Dimension(400, 200));
        contentPanel.setLayout(new java.awt.BorderLayout(1, 1));

        adaptiveLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        adaptiveLabel1.setText("Το μήνυμά σας εστάλη επιτυχώς στο χρήστη: ");

        javax.swing.GroupLayout adaptivePanel3Layout = new javax.swing.GroupLayout(adaptivePanel3);
        adaptivePanel3.setLayout(adaptivePanel3Layout);
        adaptivePanel3Layout.setHorizontalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adaptivePanel3Layout.createSequentialGroup()
                    .addGap(0, 292, Short.MAX_VALUE)
                    .addComponent(adaptiveLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 293, Short.MAX_VALUE)))
        );
        adaptivePanel3Layout.setVerticalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
            .addGroup(adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adaptivePanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(adaptiveLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        contentPanel.add(adaptivePanel3, java.awt.BorderLayout.NORTH);

        adaptivePanel2.setLayout(new javax.swing.BoxLayout(adaptivePanel2, javax.swing.BoxLayout.PAGE_AXIS));

        adaptivePanel4.setFunction("KoutsopImage");
        adaptivePanel4.setMaximumSize(new java.awt.Dimension(80, 80));
        adaptivePanel4.setMinimumSize(new java.awt.Dimension(80, 80));
        adaptivePanel4.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout adaptivePanel4Layout = new javax.swing.GroupLayout(adaptivePanel4);
        adaptivePanel4.setLayout(adaptivePanel4Layout);
        adaptivePanel4Layout.setHorizontalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        adaptivePanel4Layout.setVerticalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        adaptivePanel5.add(adaptivePanel4);

        adaptiveLabel2.setText("Κουτσόπουλος Νικόλαος");
        adaptivePanel5.add(adaptiveLabel2);

        adaptivePanel2.add(adaptivePanel5);

        adaptivePanel1.setLocation(new java.awt.Point(400, 80));
        adaptivePanel1.setMaximumSize(new java.awt.Dimension(400, 80));
        adaptivePanel1.setPreferredSize(new java.awt.Dimension(400, 80));

        adaptiveButton1.setText("Αναζήτηση Νέας Επαφής");
        adaptiveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adaptivePanel1Layout = new javax.swing.GroupLayout(adaptivePanel1);
        adaptivePanel1.setLayout(adaptivePanel1Layout);
        adaptivePanel1Layout.setHorizontalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adaptivePanel1Layout.createSequentialGroup()
                    .addGap(0, 95, Short.MAX_VALUE)
                    .addComponent(adaptiveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 96, Short.MAX_VALUE)))
        );
        adaptivePanel1Layout.setVerticalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adaptivePanel1Layout.createSequentialGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
                    .addComponent(adaptiveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );

        adaptivePanel2.add(adaptivePanel1);

        contentPanel.add(adaptivePanel2, java.awt.BorderLayout.CENTER);

        add(contentPanel);
    }// </editor-fold>//GEN-END:initComponents

private void adaptiveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton1ActionPerformed
 // Instantiate the new screen
   AddContact r = new AddContact(myParent);
   r.setVisible(true);

  // Chat a = new Chat();
   // Remove the contents of the content panel & add the new screen
   myParent.removeAll();
   myParent.add(r);
   myParent.repaint();
   myParent.validate();
}//GEN-LAST:event_adaptiveButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel contentPanel;
    // End of variables declaration//GEN-END:variables
}
