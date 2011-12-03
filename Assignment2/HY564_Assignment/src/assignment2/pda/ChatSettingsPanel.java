/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChatSettingsPanel.java
 *
 * Created on 2 Δεκ 2011, 12:30:16 πμ
 */
package assignment2.pda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author koutsop
 */
public class ChatSettingsPanel extends javax.swing.JPanel {

	/** Creates new form ChatSettingsPanel */
	public ChatSettingsPanel() {
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

        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptiveRadioButton1 = new widgets.radiobutton.AdaptiveRadioButton();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptiveRadioButton2 = new widgets.radiobutton.AdaptiveRadioButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setName("Panel.Border"); // NOI18N
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        adaptivePanel1.setLayout(new java.awt.BorderLayout(0, 10));

        adaptiveLabel1.setText("Ιστορικό");
        adaptivePanel1.add(adaptiveLabel1, java.awt.BorderLayout.NORTH);

        adaptivePanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        adaptivePanel2.setLayout(new javax.swing.BoxLayout(adaptivePanel2, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveRadioButton1.setText("Αποθήκευση ιστορικού συνομιλίας");
        adaptivePanel2.add(adaptiveRadioButton1);

        adaptivePanel3.setMaximumSize(new java.awt.Dimension(1, 20));
        adaptivePanel3.setMinimumSize(new java.awt.Dimension(1, 20));
        adaptivePanel3.setPreferredSize(new java.awt.Dimension(1, 20));

        javax.swing.GroupLayout adaptivePanel3Layout = new javax.swing.GroupLayout(adaptivePanel3);
        adaptivePanel3.setLayout(adaptivePanel3Layout);
        adaptivePanel3Layout.setHorizontalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        adaptivePanel3Layout.setVerticalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        adaptivePanel2.add(adaptivePanel3);

        adaptiveRadioButton2.setText("Όχι αποθήκευση ιστορικού συνομιλίας");
        adaptiveRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveRadioButton2ActionPerformed(evt);
            }
        });
        adaptivePanel2.add(adaptiveRadioButton2);

        adaptivePanel1.add(adaptivePanel2, java.awt.BorderLayout.CENTER);

        add(adaptivePanel1);
    }// </editor-fold>//GEN-END:initComponents

	private void adaptiveRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveRadioButton2ActionPerformed

	}//GEN-LAST:event_adaptiveRadioButton2ActionPerformed


	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.radiobutton.AdaptiveRadioButton adaptiveRadioButton1;
    private widgets.radiobutton.AdaptiveRadioButton adaptiveRadioButton2;
    // End of variables declaration//GEN-END:variables
}
