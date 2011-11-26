/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Contact.java
 *
 * Created on 24 Νοε 2011, 10:06:01 πμ
 */
package assignment2;

import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author koutsop
 */
public class Contact extends javax.swing.JPanel {
    private String statusType;
	/** Creates new form Contact */
	public Contact(
		String avatarFunction,
		String statusFunction,
		String contactName,
		String contactSatus,
        String statusType
	) {
		initComponents();
        this.statusType = statusType;
		avatarPanel.setFunction(avatarFunction);
		statusAvailablePanel.setFunction(statusFunction);
		nameLabel.setText(contactName);
		statusLabel.setText(contactSatus);
        separatorPanel.setMinimumSize(new Dimension(5, 1));
        separatorPanel.setMaximumSize(new Dimension(5, 1));
        separatorPanel.setPreferredSize(new Dimension(5, 1));
	}
    
    public void SetContactSize (int width, int height){
        Utility.SetJComponentSize(this, new Dimension(width, height));
    }
	
    public void SetAvatarDimensionPanel (int width, int height) {
        Utility.SetJComponentSize(avatarPanel, new Dimension(width, height));
    }
    
    public void SetStatusDimensionPanel (int width, int height) {
        widgets.panel.AdaptivePanel p;
        
        if ("available".equals(statusType))
            p = statusAvailablePanel;
        else
        if ("busy".equals(statusType))
            p = statusBusyPanel;
        else
            p = statusIdlePanel;
        
        p.setMinimumSize(new Dimension(width, height));
        p.setMaximumSize(new Dimension(width, height));
        p.setPreferredSize(new Dimension(width, height));
    }  
    
	public widgets.panel.AdaptivePanel GetAvatarPanel () 
		{ return avatarPanel; }
	
	public widgets.panel.AdaptivePanel GetStatusPanel () 
		{ return statusAvailablePanel; }	

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatarPanel = new widgets.panel.AdaptivePanel();
        separatorPanel = new widgets.panel.AdaptivePanel();
        statusAvailablePanel = new widgets.panel.AdaptivePanel();
        statusBusyPanel = new widgets.panel.AdaptivePanel();
        statusIdlePanel = new widgets.panel.AdaptivePanel();
        namePanel = new widgets.panel.AdaptivePanel();
        nameLabel = new widgets.label.AdaptiveLabel();
        statusLabel = new widgets.label.AdaptiveLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChatWithContact(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        avatarPanel.setMaximumSize(new java.awt.Dimension(0, 0));
        avatarPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        avatarPanel.setName("ContactPanel.AvatarPanel"); // NOI18N
        avatarPanel.setPreferredSize(new java.awt.Dimension(0, 0));
        avatarPanel.setLayout(new javax.swing.BoxLayout(avatarPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(avatarPanel);

        separatorPanel.setAlignmentY(0.0F);
        add(separatorPanel);

        statusAvailablePanel.setName("ContactPanel.StatusAvailablePanel"); // NOI18N
        statusAvailablePanel.setLayout(new javax.swing.BoxLayout(statusAvailablePanel, javax.swing.BoxLayout.LINE_AXIS));
        add(statusAvailablePanel);

        statusBusyPanel.setName("ContactPanel.StatusBusyPanel"); // NOI18N
        statusBusyPanel.setLayout(new javax.swing.BoxLayout(statusBusyPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(statusBusyPanel);

        statusIdlePanel.setName("ContactPanel.StatusIdlePanel"); // NOI18N
        statusIdlePanel.setLayout(new javax.swing.BoxLayout(statusIdlePanel, javax.swing.BoxLayout.LINE_AXIS));
        add(statusIdlePanel);

        namePanel.setAlignmentY(0.0F);
        namePanel.setLayout(new javax.swing.BoxLayout(namePanel, javax.swing.BoxLayout.PAGE_AXIS));
        namePanel.add(nameLabel);
        namePanel.add(statusLabel);

        add(namePanel);
    }// </editor-fold>//GEN-END:initComponents

	private void ChatWithContact(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChatWithContact
		JOptionPane pane = new JOptionPane();
		JDialog d = pane.createDialog(null, "title");
		d.setVisible(true);
	}//GEN-LAST:event_ChatWithContact

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.panel.AdaptivePanel avatarPanel;
    private widgets.label.AdaptiveLabel nameLabel;
    private widgets.panel.AdaptivePanel namePanel;
    private widgets.panel.AdaptivePanel separatorPanel;
    private widgets.panel.AdaptivePanel statusAvailablePanel;
    private widgets.panel.AdaptivePanel statusBusyPanel;
    private widgets.panel.AdaptivePanel statusIdlePanel;
    private widgets.label.AdaptiveLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
