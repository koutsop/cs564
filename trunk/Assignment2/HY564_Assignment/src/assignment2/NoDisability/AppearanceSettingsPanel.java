/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AppearanceSettingsPanel.java
 *
 * Created on Nov 25, 2011, 1:25:47 PM
 */
package assignment2.NoDisability;

/**
 *
 * @author Marigianna
 */
public class AppearanceSettingsPanel extends javax.swing.JPanel {

    /** Creates new form AppearanceSettingsPanel */
    public AppearanceSettingsPanel() {
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
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptiveComboBox1 = new widgets.combobox.AdaptiveComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        adaptiveTextBox1 = new widgets.textbox.AdaptiveTextBox();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        rightPanel = new widgets.panel.AdaptivePanel();

        setMaximumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 300));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        leftPanel.setPreferredSize(new java.awt.Dimension(100, 300));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        add(leftPanel);

        centerPanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        centerPanel.setPreferredSize(new java.awt.Dimension(800, 300));
        centerPanel.setLayout(new java.awt.BorderLayout());

        adaptivePanel1.setMaximumSize(new java.awt.Dimension(199, 100));
        adaptivePanel1.setPreferredSize(new java.awt.Dimension(199, 100));
        adaptivePanel1.setLayout(new javax.swing.BoxLayout(adaptivePanel1, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveLabel1.setText("Επιλέξτε το θέμα: ");
        adaptivePanel1.add(adaptiveLabel1);

        adaptiveComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Classic", "Classic Picture", "Bubble", "Bubble Picture", "Ping Pong", "Ping Pong Picture" }));
        adaptiveComboBox1.setMaximumSize(new java.awt.Dimension(112, 20));
        adaptiveComboBox1.setMinimumSize(new java.awt.Dimension(112, 20));
        adaptiveComboBox1.setPreferredSize(new java.awt.Dimension(112, 20));
        adaptivePanel1.add(adaptiveComboBox1);

        centerPanel.add(adaptivePanel1, java.awt.BorderLayout.NORTH);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(106, 200));

        adaptiveTextBox1.setColumns(20);
        adaptiveTextBox1.setEditable(false);
        adaptiveTextBox1.setRows(5);
        adaptiveTextBox1.setText("koutsop:    Hey! This is a text message!\nmarigianna: Hey ! Yeah I get it!\nkoutsop:    Are you getting it without any problems?\nmarigianna: Oh yes. I can read it perfectly.\nkoutsop:    ok! Nice to speak to you!");
        jScrollPane1.setViewportView(adaptiveTextBox1);

        centerPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        adaptivePanel2.setPreferredSize(new java.awt.Dimension(800, 20));

        javax.swing.GroupLayout adaptivePanel2Layout = new javax.swing.GroupLayout(adaptivePanel2);
        adaptivePanel2.setLayout(adaptivePanel2Layout);
        adaptivePanel2Layout.setHorizontalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        adaptivePanel2Layout.setVerticalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        centerPanel.add(adaptivePanel2, java.awt.BorderLayout.PAGE_END);

        add(centerPanel);

        rightPanel.setPreferredSize(new java.awt.Dimension(100, 300));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        add(rightPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.combobox.AdaptiveComboBox adaptiveComboBox1;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.textbox.AdaptiveTextBox adaptiveTextBox1;
    private widgets.panel.AdaptivePanel centerPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private widgets.panel.AdaptivePanel leftPanel;
    private widgets.panel.AdaptivePanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
