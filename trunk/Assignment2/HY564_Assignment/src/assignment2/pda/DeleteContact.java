/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DeleteContact.java
 *
 * Created on 1 Δεκ 2011, 5:48:32 μμ
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
public class DeleteContact extends javax.swing.JPanel {

	/** Creates new form DeleteContact */
	public DeleteContact() {
        initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        
        String path = DMSLConnector.getInstance().getClient(false).Evaluate("CancelButton");
        noButton.setIcon(new ImageIcon(getClass().getResource(path)));

        path = DMSLConnector.getInstance().getClient(false).Evaluate("AcceptanceButton");
        yesButton.setIcon(new ImageIcon(getClass().getResource(path)));		
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messagePanel = new widgets.panel.AdaptivePanel();
        confirmationMessagePanel = new widgets.label.AdaptiveLabel();
        buttonsPabel = new widgets.panel.AdaptivePanel();
        yesButton = new widgets.button.AdaptiveButton();
        noButton = new widgets.button.AdaptiveButton();

        setLayout(new java.awt.BorderLayout());

        messagePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        confirmationMessagePanel.setText("Είστε βέβαιος ότι θέλετε να διαγράψετε αυτή την επαφή;");
        messagePanel.add(confirmationMessagePanel);

        add(messagePanel, java.awt.BorderLayout.NORTH);

        buttonsPabel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 50));

        yesButton.setText("Ναι");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });
        buttonsPabel.add(yesButton);

        noButton.setText("Οχι");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        buttonsPabel.add(noButton);

        add(buttonsPabel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

	private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
		MainWindowPDA.showPanel(new PDAMainView());
	}//GEN-LAST:event_noButtonActionPerformed

	private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
		MainWindowPDA.showPanel(new SuccessfulContactDeletion());
	}//GEN-LAST:event_yesButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.panel.AdaptivePanel buttonsPabel;
    private widgets.label.AdaptiveLabel confirmationMessagePanel;
    private widgets.panel.AdaptivePanel messagePanel;
    private widgets.button.AdaptiveButton noButton;
    private widgets.button.AdaptiveButton yesButton;
    // End of variables declaration//GEN-END:variables
}