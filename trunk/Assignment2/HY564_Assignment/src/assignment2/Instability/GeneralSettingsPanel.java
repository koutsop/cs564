/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GeneralSettingsPanel.java
 *
 * Created on 30 Νοε 2011, 8:38:11 μμ
 */
package assignment2.Instability;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class GeneralSettingsPanel extends javax.swing.JPanel {
	private boolean showStartAutomaticllyButtonIcon = true;
	private boolean showStartAutomaticllyButtonIcon1 = true;
	private String	iconPath;

	/** Creates new form GeneralSettingsPanel */
	public GeneralSettingsPanel() {
		initComponents();
		Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		
		iconPath = DMSLConnector.getInstance().getClient(false).Evaluate("AcceptanceButton");
		adaptiveButton1.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		//adaptiveButton13.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		showFontButtonIcon(adaptiveButton3);
		showStyleButtonIcon(adaptiveButton9);
	}

	private void showFontButtonIcon (JButton button) {
		adaptiveButton2.setIcon(null);
		adaptiveButton3.setIcon(null);
		adaptiveButton4.setIcon(null);
		adaptiveButton5.setIcon(null);
		adaptiveButton6.setIcon(null);
		adaptiveButton7.setIcon(null);
		adaptiveButton8.setIcon(null);
		button.setIcon(new ImageIcon(getClass().getResource(iconPath)));
	}	
	
	private void showStyleButtonIcon (JButton button) {
		adaptiveButton9.setIcon(null);
		adaptiveButton10.setIcon(null);
		adaptiveButton11.setIcon(null);
		adaptiveButton12.setIcon(null);
		button.setIcon(new ImageIcon(getClass().getResource(iconPath)));
	}	

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        westPanel = new widgets.panel.AdaptivePanel();
        centerPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptivePanel9 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptivePanel10 = new widgets.panel.AdaptivePanel();
        adaptivePanel11 = new widgets.panel.AdaptivePanel();
        adaptiveButton3 = new widgets.button.AdaptiveButton();
        adaptiveButton4 = new widgets.button.AdaptiveButton();
        adaptiveButton5 = new widgets.button.AdaptiveButton();
        adaptiveButton6 = new widgets.button.AdaptiveButton();
        adaptiveButton7 = new widgets.button.AdaptiveButton();
        adaptiveButton8 = new widgets.button.AdaptiveButton();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptivePanel12 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptivePanel13 = new widgets.panel.AdaptivePanel();
        adaptivePanel14 = new widgets.panel.AdaptivePanel();
        adaptiveButton9 = new widgets.button.AdaptiveButton();
        adaptiveButton10 = new widgets.button.AdaptiveButton();
        adaptiveButton11 = new widgets.button.AdaptiveButton();
        adaptiveButton12 = new widgets.button.AdaptiveButton();
        adaptivePanel6 = new widgets.panel.AdaptivePanel();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        adaptivePanel8 = new widgets.panel.AdaptivePanel();
        adaptivePanel16 = new widgets.panel.AdaptivePanel();
        adaptiveTextField1 = new widgets.textfield.AdaptiveTextField();
        adaptiveButton2 = new widgets.button.AdaptiveButton();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        previewLabel = new widgets.label.AdaptiveLabel();
        eastPanel = new widgets.panel.AdaptivePanel();

        setLayout(new java.awt.BorderLayout());

        westPanel.setMaximumSize(new java.awt.Dimension(100, 300));
        westPanel.setMinimumSize(new java.awt.Dimension(100, 300));
        westPanel.setPreferredSize(new java.awt.Dimension(100, 300));

        javax.swing.GroupLayout westPanelLayout = new javax.swing.GroupLayout(westPanel);
        westPanel.setLayout(westPanelLayout);
        westPanelLayout.setHorizontalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        westPanelLayout.setVerticalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        add(westPanel, java.awt.BorderLayout.WEST);

        centerPanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        centerPanel.setPreferredSize(new java.awt.Dimension(943, 300));
        centerPanel.setLayout(new java.awt.BorderLayout(0, 30));

        adaptivePanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveButton1.setFunction("VirtualKeyboardButton");
        adaptiveButton1.setHorizontalAlignment(2);
        adaptiveButton1.setText("Έναρξη εφαρμογής κατά την εκκίνηση του λειτουργικού");
        adaptiveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton1ActionPerformed(evt);
            }
        });
        adaptivePanel1.add(adaptiveButton1);

        centerPanel.add(adaptivePanel1, java.awt.BorderLayout.NORTH);

        adaptivePanel2.setLayout(new javax.swing.BoxLayout(adaptivePanel2, javax.swing.BoxLayout.LINE_AXIS));

        adaptivePanel4.setLayout(new java.awt.BorderLayout());

        adaptivePanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveLabel1.setText("Γραμματοσειρά: ");
        adaptivePanel9.add(adaptiveLabel1);

        adaptivePanel4.add(adaptivePanel9, java.awt.BorderLayout.WEST);

        adaptivePanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel11.setLayout(new java.awt.GridLayout(6, 1, 0, 5));

        adaptiveButton3.setFunction("VirtualKeyboardButton");
        adaptiveButton3.setText("Arial");
        adaptiveButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton3ActionPerformed(evt);
            }
        });
        adaptivePanel11.add(adaptiveButton3);

        adaptiveButton4.setFunction("VirtualKeyboardButton");
        adaptiveButton4.setText("Comic Sans MS");
        adaptiveButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton4ActionPerformed(evt);
            }
        });
        adaptivePanel11.add(adaptiveButton4);

        adaptiveButton5.setFunction("VirtualKeyboardButton");
        adaptiveButton5.setText("Dialog");
        adaptiveButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton5ActionPerformed(evt);
            }
        });
        adaptivePanel11.add(adaptiveButton5);

        adaptiveButton6.setFunction("VirtualKeyboardButton");
        adaptiveButton6.setText("Magneto");
        adaptiveButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton6ActionPerformed(evt);
            }
        });
        adaptivePanel11.add(adaptiveButton6);

        adaptiveButton7.setFunction("VirtualKeyboardButton");
        adaptiveButton7.setText("Papyrus");
        adaptiveButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton7ActionPerformed(evt);
            }
        });
        adaptivePanel11.add(adaptiveButton7);

        adaptiveButton8.setFunction("VirtualKeyboardButton");
        adaptiveButton8.setText("Times New Roman");
        adaptiveButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton8ActionPerformed(evt);
            }
        });
        adaptivePanel11.add(adaptiveButton8);

        adaptivePanel10.add(adaptivePanel11);

        adaptivePanel4.add(adaptivePanel10, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel4);

        adaptivePanel5.setLayout(new java.awt.BorderLayout());

        adaptivePanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveLabel2.setText("Στύλ: ");
        adaptivePanel12.add(adaptiveLabel2);

        adaptivePanel5.add(adaptivePanel12, java.awt.BorderLayout.WEST);

        adaptivePanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel14.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        adaptiveButton9.setFunction("VirtualKeyboardButton");
        adaptiveButton9.setText("Plain");
        adaptiveButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton9ActionPerformed(evt);
            }
        });
        adaptivePanel14.add(adaptiveButton9);

        adaptiveButton10.setFunction("VirtualKeyboardButton");
        adaptiveButton10.setText("Bold");
        adaptiveButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton10ActionPerformed(evt);
            }
        });
        adaptivePanel14.add(adaptiveButton10);

        adaptiveButton11.setFunction("VirtualKeyboardButton");
        adaptiveButton11.setText("Italic");
        adaptiveButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton11ActionPerformed(evt);
            }
        });
        adaptivePanel14.add(adaptiveButton11);

        adaptiveButton12.setFunction("VirtualKeyboardButton");
        adaptiveButton12.setText("Bold Italic");
        adaptiveButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton12ActionPerformed(evt);
            }
        });
        adaptivePanel14.add(adaptiveButton12);

        adaptivePanel13.add(adaptivePanel14);

        adaptivePanel5.add(adaptivePanel13, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel5);

        adaptivePanel6.setLayout(new java.awt.BorderLayout(0, 10));

        adaptivePanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveLabel3.setText("Μέγεθος: ");
        adaptivePanel7.add(adaptiveLabel3);

        adaptivePanel6.add(adaptivePanel7, java.awt.BorderLayout.WEST);

        adaptivePanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel16.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        adaptiveTextField1.setText("1");
        adaptivePanel16.add(adaptiveTextField1);

        adaptiveButton2.setFunction("VirtualKeyboardButton");
        adaptiveButton2.setText("Καταχώτηση");
        adaptivePanel16.add(adaptiveButton2);

        adaptivePanel8.add(adaptivePanel16);

        adaptivePanel6.add(adaptivePanel8, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel6);

        centerPanel.add(adaptivePanel2, java.awt.BorderLayout.CENTER);

        adaptivePanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        previewLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        previewLabel.setText("Έτσι θα φαίνεται το κείμενό σας!");
        adaptivePanel3.add(previewLabel);

        centerPanel.add(adaptivePanel3, java.awt.BorderLayout.SOUTH);

        add(centerPanel, java.awt.BorderLayout.CENTER);

        eastPanel.setMaximumSize(new java.awt.Dimension(100, 300));
        eastPanel.setMinimumSize(new java.awt.Dimension(100, 300));
        eastPanel.setPreferredSize(new java.awt.Dimension(100, 300));

        javax.swing.GroupLayout eastPanelLayout = new javax.swing.GroupLayout(eastPanel);
        eastPanel.setLayout(eastPanelLayout);
        eastPanelLayout.setHorizontalGroup(
            eastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        eastPanelLayout.setVerticalGroup(
            eastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        add(eastPanel, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

	private void adaptiveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton1ActionPerformed
		if (showStartAutomaticllyButtonIcon)
			adaptiveButton1.setIcon(null);
		else
			adaptiveButton1.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		showStartAutomaticllyButtonIcon = !showStartAutomaticllyButtonIcon;
	}//GEN-LAST:event_adaptiveButton1ActionPerformed

	private void adaptiveButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton3ActionPerformed
		showFontButtonIcon(adaptiveButton3);
	}//GEN-LAST:event_adaptiveButton3ActionPerformed

	private void adaptiveButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton4ActionPerformed
		showFontButtonIcon(adaptiveButton4);
	}//GEN-LAST:event_adaptiveButton4ActionPerformed

	private void adaptiveButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton5ActionPerformed
		showFontButtonIcon(adaptiveButton5);
	}//GEN-LAST:event_adaptiveButton5ActionPerformed

	private void adaptiveButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton6ActionPerformed
		showFontButtonIcon(adaptiveButton6);
	}//GEN-LAST:event_adaptiveButton6ActionPerformed

	private void adaptiveButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton7ActionPerformed
		showFontButtonIcon(adaptiveButton7);
	}//GEN-LAST:event_adaptiveButton7ActionPerformed

	private void adaptiveButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton9ActionPerformed
		showStyleButtonIcon(adaptiveButton9);
	}//GEN-LAST:event_adaptiveButton9ActionPerformed

	private void adaptiveButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton10ActionPerformed
		showStyleButtonIcon(adaptiveButton10);
	}//GEN-LAST:event_adaptiveButton10ActionPerformed

	private void adaptiveButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton11ActionPerformed
		showStyleButtonIcon(adaptiveButton11);
	}//GEN-LAST:event_adaptiveButton11ActionPerformed

	private void adaptiveButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton12ActionPerformed
		showStyleButtonIcon(adaptiveButton12);
	}//GEN-LAST:event_adaptiveButton12ActionPerformed

private void adaptiveButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton8ActionPerformed
		showFontButtonIcon(adaptiveButton8);
}//GEN-LAST:event_adaptiveButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.button.AdaptiveButton adaptiveButton10;
    private widgets.button.AdaptiveButton adaptiveButton11;
    private widgets.button.AdaptiveButton adaptiveButton12;
    private widgets.button.AdaptiveButton adaptiveButton2;
    private widgets.button.AdaptiveButton adaptiveButton3;
    private widgets.button.AdaptiveButton adaptiveButton4;
    private widgets.button.AdaptiveButton adaptiveButton5;
    private widgets.button.AdaptiveButton adaptiveButton6;
    private widgets.button.AdaptiveButton adaptiveButton7;
    private widgets.button.AdaptiveButton adaptiveButton8;
    private widgets.button.AdaptiveButton adaptiveButton9;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel10;
    private widgets.panel.AdaptivePanel adaptivePanel11;
    private widgets.panel.AdaptivePanel adaptivePanel12;
    private widgets.panel.AdaptivePanel adaptivePanel13;
    private widgets.panel.AdaptivePanel adaptivePanel14;
    private widgets.panel.AdaptivePanel adaptivePanel16;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel6;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel adaptivePanel8;
    private widgets.panel.AdaptivePanel adaptivePanel9;
    private widgets.textfield.AdaptiveTextField adaptiveTextField1;
    private widgets.panel.AdaptivePanel centerPanel;
    private widgets.panel.AdaptivePanel eastPanel;
    private widgets.label.AdaptiveLabel previewLabel;
    private widgets.panel.AdaptivePanel westPanel;
    // End of variables declaration//GEN-END:variables
}
