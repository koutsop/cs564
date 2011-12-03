/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NoDisabilityMainView.java
 *
 * Created on 23 Νοε 2011, 3:56:11 μμ
 */
package assignment2.LowVision;

import assignment2.NoDisability.*;
import assignment2.AdaptableViews.AdaptableCall;
import assignment2.AdaptableViews.AdaptableChat;
import assignment2.AdaptableViews.AdaptableMyProfile;
import assignment2.AdaptableViews.AdaptableVideoCall;
import assignment2.Contact;
import assignment2.Utility.Utility;
import assignment2.AccessibleIMInterface;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class ChatMainView extends javax.swing.JPanel {
   
    /** Creates new form NoDisabilityMainView */
    public ChatMainView() {
        initComponents();

		
		/*Update specific components so as to impose specific rules (both methods take as argument
        the  main container/placeholder the holds all the widgets placed into the UI. This concept
        is similar to the HTML <body> element) */
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		
        selectMenuButton(contactsButton);
        showInContentPanel(new ContactsListPanel());		
    }
	
    private void showInContentPanel (JPanel p) {
        contentPanel.removeAll();
        p.setVisible(true);
        contentPanel.add(p);
        contentPanel.repaint();
        contentPanel.validate();       
    }
    
    private void selectMenuButton (JButton button) {
        chatButton.setSelected(false);
        videoCallButton.setSelected(false);
        callButton.setSelected(false);
        myProfileButton.setSelected(false);
		contactsButton.setSelected(false);
        button.setSelected(true);
    }    

	/** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new widgets.panel.AdaptivePanel();
        tabPanel = new widgets.panel.AdaptivePanel();
        contactsButton = new widgets.button.MainMenuButton();
        myProfileButton = new widgets.button.MainMenuButton();
        chatButton = new widgets.button.MainMenuButton();
        videoCallButton = new widgets.button.MainMenuButton();
        callButton = new widgets.button.MainMenuButton();
        contentPanel = new widgets.panel.AdaptivePanel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        setLayout(new java.awt.BorderLayout(10, 10));

        mainPanel.setLayout(new java.awt.BorderLayout());

        tabPanel.setLayout(new java.awt.GridLayout(1, 3, 0, 30));

        contactsButton.setText("Επαφές");
        contactsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactsButtonActionPerformed(evt);
            }
        });
        tabPanel.add(contactsButton);

        myProfileButton.setText("To προφίλ μου");
        myProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileButtonActionPerformed(evt);
            }
        });
        tabPanel.add(myProfileButton);

        chatButton.setText("Επικοινωνία: Koutsop");
        chatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatButtonActionPerformed(evt);
            }
        });
        tabPanel.add(chatButton);

        videoCallButton.setText("Κλήση Βίντεο: koutsop");
        videoCallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videoCallButtonActionPerformed(evt);
            }
        });
        tabPanel.add(videoCallButton);

        callButton.setText("Κλήση: koutsop");
        callButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callButtonActionPerformed(evt);
            }
        });
        tabPanel.add(callButton);

        mainPanel.add(tabPanel, java.awt.BorderLayout.PAGE_START);

        contentPanel.setLayout(new javax.swing.BoxLayout(contentPanel, javax.swing.BoxLayout.LINE_AXIS));
        mainPanel.add(contentPanel, java.awt.BorderLayout.CENTER);

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void chatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatButtonActionPerformed
        selectMenuButton(chatButton);
        showInContentPanel(new AdaptableChat());
    }//GEN-LAST:event_chatButtonActionPerformed

    private void videoCallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videoCallButtonActionPerformed
        selectMenuButton(videoCallButton);
        showInContentPanel(new AdaptableVideoCall());
    }//GEN-LAST:event_videoCallButtonActionPerformed

    private void callButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callButtonActionPerformed
        selectMenuButton(callButton);
        showInContentPanel(new AdaptableCall());
    }//GEN-LAST:event_callButtonActionPerformed

    private void myProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileButtonActionPerformed
        selectMenuButton(myProfileButton);
        showInContentPanel(new AdaptableMyProfile());
    }//GEN-LAST:event_myProfileButtonActionPerformed

	private void contactsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactsButtonActionPerformed
		selectMenuButton(contactsButton);
		showInContentPanel(new ContactsListPanel());
	}//GEN-LAST:event_contactsButtonActionPerformed
    
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.MainMenuButton callButton;
    private widgets.button.MainMenuButton chatButton;
    private widgets.button.MainMenuButton contactsButton;
    private widgets.panel.AdaptivePanel contentPanel;
    private widgets.panel.AdaptivePanel mainPanel;
    private widgets.button.MainMenuButton myProfileButton;
    private widgets.panel.AdaptivePanel tabPanel;
    private widgets.button.MainMenuButton videoCallButton;
    // End of variables declaration//GEN-END:variables
}
