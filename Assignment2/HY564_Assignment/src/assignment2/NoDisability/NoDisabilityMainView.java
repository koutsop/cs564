/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NoDisabilityMainView.java
 *
 * Created on 23 Νοε 2011, 3:56:11 μμ
 */
package assignment2.NoDisability;

import assignment2.AdaptableSettingsView;
import assignment2.Chat;
import assignment2.Contact;
import assignment2.Login1;
import java.awt.Component;
import pc.MainWindowPC;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class NoDisabilityMainView extends javax.swing.JPanel {

    /** Creates new form NoDisabilityMainView */
    public NoDisabilityMainView() {
        initComponents();
		AddContacts();
		
		/*Update specific components so as to impose specific rules (both methods take as argument
        the  main container/placeholder the holds all the widgets placed into the UI. This concept
        is similar to the HTML <body> element) */
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		SetConactSizeImages();
		this.updateUI();
    }
	
	private void SetConactSizeImages () {
		int contactHeight = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("ContactHeight"));
		int contactWidth = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("ContactWidth"));
		int contactImgHeight = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("ContactImgHeight"));
		int contactImgWidth = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("ContactImgWidth"));
		int StatusImgHeight = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("StatusImgHeight"));
		int StatusImgWidth = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("StatusImgWidth"));
		
		assert	contactHeight		!= -1 &&
				contactWidth		!= -1 &&
				contactImgHeight	!= -1 && 
				contactImgWidth		!= -1 && 
				StatusImgHeight		!= -1 && 
				StatusImgWidth		!= -1;
		
		for (Component contact: contactsPanel.getComponents()) {
			((Contact)contact).SetContactSize(contactWidth, contactHeight);
			((Contact)contact).SetAvatarDimensionPanel(contactImgWidth, contactImgHeight);
            ((Contact)contact).SetStatusDimensionPanel(StatusImgWidth, StatusImgHeight);
		}		
	}
	
	private void AddContacts () {
		contactsPanel.add(new Contact("ContactImg", "StatusIdleImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "idle"));
		contactsPanel.add(new Contact("ContactImg", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "busy"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		
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
        jScrollPane1 = new javax.swing.JScrollPane();
        contactsPanel = new widgets.panel.AdaptivePanel();
        menuPanel = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();
        adaptiveButton2 = new widgets.button.AdaptiveButton();
        settingsButton = new widgets.button.AdaptiveButton();
        adaptiveButton4 = new widgets.button.AdaptiveButton();
        adaptiveButton5 = new widgets.button.AdaptiveButton();
        adaptiveButton6 = new widgets.button.AdaptiveButton();
        adaptiveButton7 = new widgets.button.AdaptiveButton();
        mainPanel = new widgets.panel.AdaptivePanel();
        tabPanel = new widgets.panel.AdaptivePanel();
        koutsopButton = new widgets.button.AdaptiveButton();
        tmp1 = new widgets.button.AdaptiveButton();
        tmp2 = new widgets.button.AdaptiveButton();
        contentPanel = new widgets.panel.AdaptivePanel();

        setMaximumSize(new java.awt.Dimension(1000, 688));
        setMinimumSize(new java.awt.Dimension(1000, 688));
        setPreferredSize(new java.awt.Dimension(1000, 688));
        setLayout(new java.awt.BorderLayout(10, 10));

        leftPanel.setLayout(new javax.swing.BoxLayout(leftPanel, javax.swing.BoxLayout.PAGE_AXIS));

        contactsPanel.setLayout(new javax.swing.BoxLayout(contactsPanel, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(contactsPanel);

        leftPanel.add(jScrollPane1);

        add(leftPanel, java.awt.BorderLayout.LINE_START);

        adaptiveButton1.setFunction("MenuButton");
        adaptiveButton1.setText("Accessible IM");
        menuPanel.add(adaptiveButton1);

        adaptiveButton2.setFunction("MenuButton");
        adaptiveButton2.setText("Επιλογές");
        menuPanel.add(adaptiveButton2);

        settingsButton.setFunction("MenuButton");
        settingsButton.setText("Ρυθμίισεις");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        menuPanel.add(settingsButton);

        adaptiveButton4.setFunction("MenuButton");
        adaptiveButton4.setText("Αρχική");
        adaptiveButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton4ActionPerformed(evt);
            }
        });
        menuPanel.add(adaptiveButton4);

        adaptiveButton5.setText("Έξοδος");
        menuPanel.add(adaptiveButton5);

        adaptiveButton6.setText("adaptiveButton6");
        menuPanel.add(adaptiveButton6);

        adaptiveButton7.setText("adaptiveButton7");
        menuPanel.add(adaptiveButton7);

        add(menuPanel, java.awt.BorderLayout.PAGE_START);

        mainPanel.setLayout(new java.awt.BorderLayout());

        tabPanel.setLayout(new javax.swing.BoxLayout(tabPanel, javax.swing.BoxLayout.LINE_AXIS));

        koutsopButton.setText("koutsop");
        koutsopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koutsopButtonActionPerformed(evt);
            }
        });
        tabPanel.add(koutsopButton);

        tmp1.setText("adaptiveButton9");
        tmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmp1ActionPerformed(evt);
            }
        });
        tabPanel.add(tmp1);

        tmp2.setText("adaptiveButton10");
        tmp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmp2ActionPerformed(evt);
            }
        });
        tabPanel.add(tmp2);

        mainPanel.add(tabPanel, java.awt.BorderLayout.PAGE_START);
        mainPanel.add(contentPanel, java.awt.BorderLayout.CENTER);

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

	private void tmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmp1ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_tmp1ActionPerformed

	private void koutsopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koutsopButtonActionPerformed
		koutsopButton.setSelected(true);
        tmp1.setSelected(false);
        tmp2.setSelected(false);
        
        Chat chat = new Chat();
        chat.setVisible(true);
        
        contentPanel.removeAll();
        contentPanel.add(chat);
        contentPanel.repaint();
        contentPanel.validate();
	}//GEN-LAST:event_koutsopButtonActionPerformed

	private void tmp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmp2ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_tmp2ActionPerformed

	private void adaptiveButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton4ActionPerformed
		Login1 login = new Login1();       
        MainWindowPC.showPanel(login);
	}//GEN-LAST:event_adaptiveButton4ActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        AdaptableSettingsView settings = new AdaptableSettingsView();       
        MainWindowPC.showPanel(settings);
    }//GEN-LAST:event_settingsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.button.AdaptiveButton adaptiveButton2;
    private widgets.button.AdaptiveButton adaptiveButton4;
    private widgets.button.AdaptiveButton adaptiveButton5;
    private widgets.button.AdaptiveButton adaptiveButton6;
    private widgets.button.AdaptiveButton adaptiveButton7;
    private widgets.panel.AdaptivePanel contactsPanel;
    private widgets.panel.AdaptivePanel contentPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private widgets.button.AdaptiveButton koutsopButton;
    private widgets.panel.AdaptivePanel leftPanel;
    private widgets.panel.AdaptivePanel mainPanel;
    private widgets.panel.AdaptivePanel menuPanel;
    private widgets.button.AdaptiveButton settingsButton;
    private widgets.panel.AdaptivePanel tabPanel;
    private widgets.button.AdaptiveButton tmp1;
    private widgets.button.AdaptiveButton tmp2;
    // End of variables declaration//GEN-END:variables
}
