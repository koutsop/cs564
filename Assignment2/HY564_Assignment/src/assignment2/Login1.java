/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login1.java
 *
 * Created on 25 Νοε 2011, 11:15:36 πμ
 */
package assignment2;

//import assignment2.NoDisability.AddContact;
import assignment2.NoDisability.ProfileCreation1;
import java.awt.Dimension;
import pc.MainWindowPC;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class Login1 extends javax.swing.JPanel {

    /** Creates new form Login1 */
    public Login1() {
        initComponents();
		Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);		
    }
    
    private void initAdaptation(String profile){
        DMSLConnector.getInstance().getClient(false).SetAttribute("user.profile", profile);
        //DMSLConnector.getInstance().getClient(false).SetAttribute("Dummy.attr", "1");
        Adaptation.initLookAndFeel(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upPanel = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        modlePanel = new widgets.panel.AdaptivePanel();
        noDisabilityPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        boDisabilityButton = new widgets.button.AdaptiveButton();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        colorBlindPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        colorBlindButton = new widgets.button.AdaptiveButton();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        instabilityPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel6 = new widgets.panel.AdaptivePanel();
        instabilityButton = new widgets.button.AdaptiveButton();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptiveLabel4 = new widgets.label.AdaptiveLabel();
        lowVisionPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        lowVisionButton = new widgets.button.AdaptiveButton();
        adaptivePanel8 = new widgets.panel.AdaptivePanel();
        adaptiveLabel5 = new widgets.label.AdaptiveLabel();
        downPanel = new widgets.panel.AdaptivePanel();
        registerButton = new widgets.button.AdaptiveButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(40, 0, 40, 0));
        setPreferredSize(new java.awt.Dimension(1000, 688));
        setLayout(new java.awt.BorderLayout(0, 30));

        adaptiveLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        adaptiveLabel1.setText("Καλώς Ορίσατε");
        upPanel.add(adaptiveLabel1);

        add(upPanel, java.awt.BorderLayout.PAGE_START);

        modlePanel.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        adaptivePanel1.setLayout(new java.awt.BorderLayout());

        boDisabilityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/defaultProfile.png"))); // NOI18N
        boDisabilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boDisabilityButtonActionPerformed(evt);
            }
        });
        adaptivePanel1.add(boDisabilityButton, java.awt.BorderLayout.CENTER);

        adaptiveLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        adaptiveLabel2.setText("No Disability");
        adaptivePanel2.add(adaptiveLabel2);

        adaptivePanel1.add(adaptivePanel2, java.awt.BorderLayout.SOUTH);

        noDisabilityPanel.add(adaptivePanel1);

        modlePanel.add(noDisabilityPanel);

        adaptivePanel3.setLayout(new java.awt.BorderLayout());

        colorBlindButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/defaultProfile.png"))); // NOI18N
        colorBlindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlindButtonActionPerformed(evt);
            }
        });
        adaptivePanel3.add(colorBlindButton, java.awt.BorderLayout.CENTER);

        adaptiveLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        adaptiveLabel3.setText("Color Blind");
        adaptivePanel4.add(adaptiveLabel3);

        adaptivePanel3.add(adaptivePanel4, java.awt.BorderLayout.SOUTH);

        colorBlindPanel.add(adaptivePanel3);

        modlePanel.add(colorBlindPanel);

        adaptivePanel6.setLayout(new java.awt.BorderLayout());

        instabilityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/defaultProfile.png"))); // NOI18N
        instabilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instabilityButtonActionPerformed(evt);
            }
        });
        adaptivePanel6.add(instabilityButton, java.awt.BorderLayout.CENTER);

        adaptiveLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        adaptiveLabel4.setText("Instability");
        adaptivePanel5.add(adaptiveLabel4);

        adaptivePanel6.add(adaptivePanel5, java.awt.BorderLayout.SOUTH);

        instabilityPanel.add(adaptivePanel6);

        modlePanel.add(instabilityPanel);

        adaptivePanel7.setLayout(new java.awt.BorderLayout());

        lowVisionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/defaultProfile.png"))); // NOI18N
        lowVisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowVisionButtonActionPerformed(evt);
            }
        });
        adaptivePanel7.add(lowVisionButton, java.awt.BorderLayout.CENTER);

        adaptiveLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        adaptiveLabel5.setText("Low Vision");
        adaptivePanel8.add(adaptiveLabel5);

        adaptivePanel7.add(adaptivePanel8, java.awt.BorderLayout.SOUTH);

        lowVisionPanel.add(adaptivePanel7);

        modlePanel.add(lowVisionPanel);

        add(modlePanel, java.awt.BorderLayout.CENTER);

        registerButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registerButton.setFunction("LoginButton");
        registerButton.setText("Δεν έχετε λογαριασμό;");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        downPanel.add(registerButton);

        add(downPanel, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents
    private void colorBlindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlindButtonActionPerformed
        initAdaptation("no_disability");
        MainWindowPC.showPanel(new AccessibleIM());
    }//GEN-LAST:event_colorBlindButtonActionPerformed

    private void instabilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instabilityButtonActionPerformed
        initAdaptation("no_disability");
        MainWindowPC.showPanel(new AccessibleIM());
    }//GEN-LAST:event_instabilityButtonActionPerformed

    private void lowVisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowVisionButtonActionPerformed
        initAdaptation("no_disability");
        MainWindowPC.showPanel(new AccessibleIM());
       
    }//GEN-LAST:event_lowVisionButtonActionPerformed

private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
     MainWindowPC.showPanel(new ProfileCreation1(new Dimension(980, 680)));
}//GEN-LAST:event_registerButtonActionPerformed

	private void boDisabilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boDisabilityButtonActionPerformed
		initAdaptation("no_disability");
        MainWindowPC.showPanel(new AccessibleIM());
	}//GEN-LAST:event_boDisabilityButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.label.AdaptiveLabel adaptiveLabel4;
    private widgets.label.AdaptiveLabel adaptiveLabel5;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel6;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel adaptivePanel8;
    private widgets.button.AdaptiveButton boDisabilityButton;
    private widgets.button.AdaptiveButton colorBlindButton;
    private widgets.panel.AdaptivePanel colorBlindPanel;
    private widgets.panel.AdaptivePanel downPanel;
    private widgets.button.AdaptiveButton instabilityButton;
    private widgets.panel.AdaptivePanel instabilityPanel;
    private widgets.button.AdaptiveButton lowVisionButton;
    private widgets.panel.AdaptivePanel lowVisionPanel;
    private widgets.panel.AdaptivePanel modlePanel;
    private widgets.panel.AdaptivePanel noDisabilityPanel;
    private widgets.button.AdaptiveButton registerButton;
    private widgets.panel.AdaptivePanel upPanel;
    // End of variables declaration//GEN-END:variables
}
