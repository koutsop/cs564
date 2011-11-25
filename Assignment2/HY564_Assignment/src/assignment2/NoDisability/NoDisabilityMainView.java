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
import javax.swing.JButton;
import javax.swing.JPanel;
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
		int statusImgHeight = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("StatusImgHeight"));
		int statusImgWidth = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("StatusImgWidth"));
		
		assert	contactHeight		!= -1 &&
				contactWidth		!= -1 &&
				contactImgHeight	!= -1 && 
				contactImgWidth		!= -1 && 
				statusImgHeight		!= -1 && 
				statusImgWidth		!= -1;
		
		for (Component contact: contactsPanel.getComponents()) {
			//((Contact)contact).SetContactSize(contactWidth, contactHeight);
			((Contact)contact).SetAvatarDimensionPanel(contactImgWidth, contactImgHeight);
            ((Contact)contact).SetStatusDimensionPanel(statusImgWidth, statusImgHeight);
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
        mainPanel = new widgets.panel.AdaptivePanel();
        tabPanel = new widgets.panel.AdaptivePanel();
        koutsopChatButton = new widgets.button.MainMenuButton();
        tmp1 = new widgets.button.MainMenuButton();
        tmp2 = new widgets.button.MainMenuButton();
        contentPanel = new widgets.panel.AdaptivePanel();

        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));
        setLayout(new java.awt.BorderLayout(10, 10));

        leftPanel.setLayout(new javax.swing.BoxLayout(leftPanel, javax.swing.BoxLayout.PAGE_AXIS));

        contactsPanel.setLayout(new javax.swing.BoxLayout(contactsPanel, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(contactsPanel);

        leftPanel.add(jScrollPane1);

        add(leftPanel, java.awt.BorderLayout.LINE_START);

        mainPanel.setLayout(new java.awt.BorderLayout());

        tabPanel.setLayout(new java.awt.GridLayout(1, 3, 0, 30));

        koutsopChatButton.setText("koutsop chat");
        koutsopChatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koutsopChatButtonActionPerformed(evt);
            }
        });
        tabPanel.add(koutsopChatButton);

        tmp1.setText("mainMenuButton2");
        tabPanel.add(tmp1);

        tmp2.setText("mainMenuButton3");
        tabPanel.add(tmp2);

        mainPanel.add(tabPanel, java.awt.BorderLayout.PAGE_START);
        mainPanel.add(contentPanel, java.awt.BorderLayout.CENTER);

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void koutsopChatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koutsopChatButtonActionPerformed
        selectButton(koutsopChatButton);
        showPanel(new Chat());
    }//GEN-LAST:event_koutsopChatButtonActionPerformed

    private void showPanel (JPanel p) {
        contentPanel.removeAll();
        p.setVisible(true);
        contentPanel.add(p);
        contentPanel.repaint();
        contentPanel.validate();       
    }
    
    private void selectButton (JButton button) {
        koutsopChatButton.setSelected(false);
        tmp1.setSelected(false);
        tmp2.setSelected(false);
        button.setSelected(true);
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.panel.AdaptivePanel contactsPanel;
    private widgets.panel.AdaptivePanel contentPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private widgets.button.MainMenuButton koutsopChatButton;
    private widgets.panel.AdaptivePanel leftPanel;
    private widgets.panel.AdaptivePanel mainPanel;
    private widgets.panel.AdaptivePanel tabPanel;
    private widgets.button.MainMenuButton tmp1;
    private widgets.button.MainMenuButton tmp2;
    // End of variables declaration//GEN-END:variables
}
