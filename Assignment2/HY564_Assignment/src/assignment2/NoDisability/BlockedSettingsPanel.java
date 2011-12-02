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
public class BlockedSettingsPanel extends javax.swing.JPanel {

    /** Creates new form GeneralSettingsPanel */
    public BlockedSettingsPanel() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        adaptiveList1 = new widgets.list.AdaptiveList();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        rightPanel = new widgets.panel.AdaptivePanel();

        setLayout(new java.awt.BorderLayout());

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
            .addGap(0, 364, Short.MAX_VALUE)
        );

        add(leftPanel, java.awt.BorderLayout.WEST);

        centerPanel.setLayout(new java.awt.BorderLayout(50, 0));

        adaptiveList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "maraki@hotmail.com", "koutsop@gmail.com", "testmail@hotmail.com", "gavros666@hotmail.com", "giveTeam3A10@hotmail.com" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(adaptiveList1);

        centerPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        adaptivePanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        adaptiveButton1.setText("Άρση Αποκλεισμού");
        adaptivePanel1.add(adaptiveButton1);

        centerPanel.add(adaptivePanel1, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout adaptivePanel2Layout = new javax.swing.GroupLayout(adaptivePanel2);
        adaptivePanel2.setLayout(adaptivePanel2Layout);
        adaptivePanel2Layout.setHorizontalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        adaptivePanel2Layout.setVerticalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        centerPanel.add(adaptivePanel2, java.awt.BorderLayout.SOUTH);

        add(centerPanel, java.awt.BorderLayout.CENTER);

        rightPanel.setPreferredSize(new java.awt.Dimension(100, 300));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        add(rightPanel, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.list.AdaptiveList adaptiveList1;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel centerPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private widgets.panel.AdaptivePanel leftPanel;
    private widgets.panel.AdaptivePanel rightPanel;
    // End of variables declaration//GEN-END:variables
}