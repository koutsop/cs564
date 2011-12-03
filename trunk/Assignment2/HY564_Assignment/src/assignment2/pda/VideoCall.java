/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VideoCall.java
 *
 * Created on 2 Δεκ 2011, 6:34:15 μμ
 */
package assignment2.pda;

import javax.swing.ImageIcon;
import pda.MainWindowPDA;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class VideoCall extends javax.swing.JPanel {

	/** Creates new form VideoCall */
	public VideoCall() {
		initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);	
		
		String path = DMSLConnector.getInstance().getClient(false).Evaluate("MuteVideoPDAButton");
		muteButton.setIcon(new ImageIcon(getClass().getResource(path)));		

		path = DMSLConnector.getInstance().getClient(false).Evaluate("CloseVideoPDAButton");
		closeButton.setIcon(new ImageIcon(getClass().getResource(path)));	

		path = DMSLConnector.getInstance().getClient(false).Evaluate("EndCallPDAButton");
		endCallButton.setIcon(new ImageIcon(getClass().getResource(path)));	

		path = DMSLConnector.getInstance().getClient(false).Evaluate("SwapVideoPDAButton");
		swapButon.setIcon(new ImageIcon(getClass().getResource(path)));	
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
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        closeButton = new widgets.button.AdaptiveButton();
        centerPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        adaptivePanel8 = new widgets.panel.AdaptivePanel();
        adaptivePanel9 = new widgets.panel.AdaptivePanel();
        adaptivePanel10 = new widgets.panel.AdaptivePanel();
        adaptivePanel11 = new widgets.panel.AdaptivePanel();
        adaptivePanel12 = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        muteButton = new widgets.button.AdaptiveButton();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        endCallButton = new widgets.button.AdaptiveButton();
        adaptivePanel6 = new widgets.panel.AdaptivePanel();
        swapButon = new widgets.button.AdaptiveButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        adaptivePanel1.setFunction("marigiannaImg");
        adaptivePanel1.setName("Panel.Content.MarigiannaImage"); // NOI18N
        adaptivePanel1.setLayout(new java.awt.BorderLayout(0, 10));

        adaptivePanel2.setFunction("TransparentPanel");
        adaptivePanel2.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        closeButton.setFunction("EmptyButton");
        closeButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        adaptivePanel2.add(closeButton);

        adaptivePanel1.add(adaptivePanel2, java.awt.BorderLayout.NORTH);

        centerPanel.setFunction("TransparentPanel");
        centerPanel.setName("Panel.TransparentPanel"); // NOI18N
        centerPanel.setLayout(new java.awt.GridLayout(3, 1));

        adaptivePanel7.setFunction("TransparentPanel");
        adaptivePanel7.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        centerPanel.add(adaptivePanel7);

        adaptivePanel8.setFunction("TransparentPanel");
        adaptivePanel8.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        centerPanel.add(adaptivePanel8);

        adaptivePanel9.setFunction("TransparentPanel");
        adaptivePanel9.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel9.setLayout(new java.awt.GridLayout(1, 3));

        adaptivePanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        adaptivePanel10.setFunction("KoutsopImg");
        adaptivePanel10.setName("Panel.Content.KoutsopImage"); // NOI18N
        adaptivePanel9.add(adaptivePanel10);

        adaptivePanel11.setFunction("TransparentPanel");
        adaptivePanel11.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel9.add(adaptivePanel11);

        adaptivePanel12.setFunction("TransparentPanel");
        adaptivePanel12.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel9.add(adaptivePanel12);

        centerPanel.add(adaptivePanel9);

        adaptivePanel1.add(centerPanel, java.awt.BorderLayout.CENTER);

        adaptivePanel3.setFunction("TransparentPanel");
        adaptivePanel3.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel3.setLayout(new java.awt.BorderLayout());

        adaptivePanel4.setFunction("TransparentPanel");
        adaptivePanel4.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        muteButton.setFunction("EmptyButton");
        muteButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        adaptivePanel4.add(muteButton);

        adaptivePanel3.add(adaptivePanel4, java.awt.BorderLayout.WEST);

        adaptivePanel5.setFunction("TransparentPanel");
        adaptivePanel5.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        endCallButton.setFunction("EmptyButton");
        endCallButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        endCallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endCallButtonActionPerformed(evt);
            }
        });
        adaptivePanel5.add(endCallButton);

        adaptivePanel3.add(adaptivePanel5, java.awt.BorderLayout.CENTER);

        adaptivePanel6.setFunction("TransparentPanel");
        adaptivePanel6.setName("Panel.TransparentPanel"); // NOI18N
        adaptivePanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        swapButon.setFunction("EmptyButton");
        swapButon.setMargin(new java.awt.Insets(0, 0, 0, 0));
        adaptivePanel6.add(swapButon);

        adaptivePanel3.add(adaptivePanel6, java.awt.BorderLayout.EAST);

        adaptivePanel1.add(adaptivePanel3, java.awt.BorderLayout.SOUTH);

        add(adaptivePanel1);
    }// </editor-fold>//GEN-END:initComponents

	private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
		MainWindowPDA.showPanel(new PDAMainView());
	}//GEN-LAST:event_closeButtonActionPerformed

	private void endCallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endCallButtonActionPerformed
		MainWindowPDA.showPanel(new Chat());
	}//GEN-LAST:event_endCallButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel10;
    private widgets.panel.AdaptivePanel adaptivePanel11;
    private widgets.panel.AdaptivePanel adaptivePanel12;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel6;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel adaptivePanel8;
    private widgets.panel.AdaptivePanel adaptivePanel9;
    private widgets.panel.AdaptivePanel centerPanel;
    private widgets.button.AdaptiveButton closeButton;
    private widgets.button.AdaptiveButton endCallButton;
    private widgets.button.AdaptiveButton muteButton;
    private widgets.button.AdaptiveButton swapButon;
    // End of variables declaration//GEN-END:variables
}