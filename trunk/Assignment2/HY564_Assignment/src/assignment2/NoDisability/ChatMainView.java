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

import assignment2.Call;
import assignment2.Chat;
import assignment2.Contact;
import assignment2.MyProfile;
import assignment2.Utility;
import assignment2.VideoCall;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class ChatMainView extends javax.swing.JPanel {
          
    /** Creates new form NoDisabilityMainView */
    public ChatMainView(Dimension menuSize) {
        this.menuSize = menuSize;
        initComponents();
		AddContacts();
		
		/*Update specific components so as to impose specific rules (both methods take as argument
        the  main container/placeholder the holds all the widgets placed into the UI. This concept
        is similar to the HTML <body> element) */
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		SetConactSizeImages();
        SetPanelsSize ();
		this.updateUI();
    }
    
    private void SetPanelsSize() {
        final int windowWidth   = 1000;
        final int windowHeight  = 680; // window's max height: 720, - 40 for the title bar
        int height              = windowHeight - menuSize.height;
        int contactListWidth    = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("ContactListWidth"));
        
        Utility.SetJComponentSize(this, windowWidth, height);
        Utility.SetJComponentSize(contactsListScrollPane, contactListWidth, height);
        Utility.SetJComponentSize(mainPanel, windowWidth - contactListWidth, height);
        Utility.SetJComponentSize(
            contentPanel, 
            windowWidth - contactListWidth - 40,                //20 is left and right window's border, 20 border gap
            height - tabPanel.getPreferredSize().height - 10    //10 bottom window's border
        );
        
        String path = DMSLConnector.getInstance().getClient(false).Evaluate("AddButton");
        addContactButton.setIcon(new ImageIcon(getClass().getResource(path)));  
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("GroupButton");
        groupContactsButton.setIcon(new ImageIcon(getClass().getResource(path)));  
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("SearchButton");
        searchButton.setIcon(new ImageIcon(getClass().getResource(path))); 
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("RemoveButton");
        removeContactButton.setIcon(new ImageIcon(getClass().getResource(path))); 
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
		
		for (Component contact: contactsListPanel.getComponents()) {
			//((Contact)contact).SetContactSize(contactWidth, contactHeight);
			((Contact)contact).SetAvatarDimensionPanel(contactImgWidth, contactImgHeight);
            ((Contact)contact).SetStatusDimensionPanel(statusImgWidth, statusImgHeight);
		}		
	}
	
	private void AddContacts () {
		contactsListPanel.add(new Contact("ContactImg", "StatusIdleImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "idle"));
		contactsListPanel.add(new Contact("ContactImg", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "busy"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		contactsListPanel.add(new Contact("ContactImg", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
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
        gapPanel1 = new widgets.panel.AdaptivePanel();
        LeftCenterPanel = new widgets.panel.AdaptivePanel();
        contactsPanel = new widgets.panel.AdaptivePanel();
        contactsListScrollPane = new javax.swing.JScrollPane();
        contactsListPanel = new widgets.panel.AdaptivePanel();
        contactActionPanel = new widgets.panel.AdaptivePanel();
        buttonsPanel = new widgets.panel.AdaptivePanel();
        addContactButton = new widgets.button.AdaptiveButton();
        removeContactButton = new widgets.button.AdaptiveButton();
        groupContactsButton = new widgets.button.AdaptiveButton();
        searchButton = new widgets.button.AdaptiveButton();
        searchPanel = new widgets.panel.AdaptivePanel();
        adaptiveTextField1 = new widgets.textfield.AdaptiveTextField();
        mainPanel = new widgets.panel.AdaptivePanel();
        tabPanel = new widgets.panel.AdaptivePanel();
        myProfileButton = new widgets.button.MainMenuButton();
        chatButton = new widgets.button.MainMenuButton();
        videoCallButton = new widgets.button.MainMenuButton();
        callButton = new widgets.button.MainMenuButton();
        contentPanel = new widgets.panel.AdaptivePanel();
        rightPanel = new widgets.panel.AdaptivePanel();

        setLayout(new java.awt.BorderLayout(10, 10));

        leftPanel.setLayout(new java.awt.BorderLayout(0, 10));
        leftPanel.add(gapPanel1, java.awt.BorderLayout.WEST);

        LeftCenterPanel.setLayout(new java.awt.BorderLayout(0, 10));

        contactsPanel.setLayout(new javax.swing.BoxLayout(contactsPanel, javax.swing.BoxLayout.LINE_AXIS));

        contactsListPanel.setLayout(new javax.swing.BoxLayout(contactsListPanel, javax.swing.BoxLayout.PAGE_AXIS));
        contactsListScrollPane.setViewportView(contactsListPanel);

        contactsPanel.add(contactsListScrollPane);

        LeftCenterPanel.add(contactsPanel, java.awt.BorderLayout.CENTER);

        contactActionPanel.setLayout(new java.awt.BorderLayout(0, 10));

        buttonsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        addContactButton.setFunction("ContactsActionButton");
        addContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addContactButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(addContactButton);

        removeContactButton.setFunction("ContactsActionButton");
        buttonsPanel.add(removeContactButton);

        groupContactsButton.setFunction("ContactsActionButton");
        buttonsPanel.add(groupContactsButton);

        searchButton.setFunction("ContactsActionButton");
        buttonsPanel.add(searchButton);

        contactActionPanel.add(buttonsPanel, java.awt.BorderLayout.NORTH);

        searchPanel.setLayout(new javax.swing.BoxLayout(searchPanel, javax.swing.BoxLayout.LINE_AXIS));
        searchPanel.add(adaptiveTextField1);

        contactActionPanel.add(searchPanel, java.awt.BorderLayout.CENTER);

        LeftCenterPanel.add(contactActionPanel, java.awt.BorderLayout.NORTH);

        leftPanel.add(LeftCenterPanel, java.awt.BorderLayout.EAST);

        add(leftPanel, java.awt.BorderLayout.LINE_START);

        mainPanel.setLayout(new java.awt.BorderLayout());

        tabPanel.setLayout(new java.awt.GridLayout(1, 3, 0, 30));

        myProfileButton.setText("My Profile");
        myProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileButtonActionPerformed(evt);
            }
        });
        tabPanel.add(myProfileButton);

        chatButton.setText("koutsop chat");
        chatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatButtonActionPerformed(evt);
            }
        });
        tabPanel.add(chatButton);

        videoCallButton.setText("koutsop Video Call");
        videoCallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videoCallButtonActionPerformed(evt);
            }
        });
        tabPanel.add(videoCallButton);

        callButton.setText("koutsop Call");
        callButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callButtonActionPerformed(evt);
            }
        });
        tabPanel.add(callButton);

        mainPanel.add(tabPanel, java.awt.BorderLayout.PAGE_START);
        mainPanel.add(contentPanel, java.awt.BorderLayout.CENTER);

        add(mainPanel, java.awt.BorderLayout.CENTER);
        add(rightPanel, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void chatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatButtonActionPerformed
        selectMenuButton(chatButton);
        showPanel(new Chat(contentPanel.getPreferredSize()));
    }//GEN-LAST:event_chatButtonActionPerformed

    private void videoCallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videoCallButtonActionPerformed
        selectMenuButton(videoCallButton);
        showPanel(new VideoCall(contentPanel.getPreferredSize()));
    }//GEN-LAST:event_videoCallButtonActionPerformed

    private void addContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addContactButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addContactButtonActionPerformed

    private void callButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callButtonActionPerformed
        selectMenuButton(callButton);
        showPanel(new Call(contentPanel.getPreferredSize()));
    }//GEN-LAST:event_callButtonActionPerformed

    private void myProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileButtonActionPerformed
        selectMenuButton(myProfileButton);
        showPanel(new MyProfile(contentPanel.getPreferredSize()));
    }//GEN-LAST:event_myProfileButtonActionPerformed

    private void showPanel (JPanel p) {
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
        button.setSelected(true);
    }
    
    private Dimension menuSize;
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.panel.AdaptivePanel LeftCenterPanel;
    private widgets.textfield.AdaptiveTextField adaptiveTextField1;
    private widgets.button.AdaptiveButton addContactButton;
    private widgets.panel.AdaptivePanel buttonsPanel;
    private widgets.button.MainMenuButton callButton;
    private widgets.button.MainMenuButton chatButton;
    private widgets.panel.AdaptivePanel contactActionPanel;
    private widgets.panel.AdaptivePanel contactsListPanel;
    private javax.swing.JScrollPane contactsListScrollPane;
    private widgets.panel.AdaptivePanel contactsPanel;
    private widgets.panel.AdaptivePanel contentPanel;
    private widgets.panel.AdaptivePanel gapPanel1;
    private widgets.button.AdaptiveButton groupContactsButton;
    private widgets.panel.AdaptivePanel leftPanel;
    private widgets.panel.AdaptivePanel mainPanel;
    private widgets.button.MainMenuButton myProfileButton;
    private widgets.button.AdaptiveButton removeContactButton;
    private widgets.panel.AdaptivePanel rightPanel;
    private widgets.button.AdaptiveButton searchButton;
    private widgets.panel.AdaptivePanel searchPanel;
    private widgets.panel.AdaptivePanel tabPanel;
    private widgets.button.MainMenuButton videoCallButton;
    // End of variables declaration//GEN-END:variables
}
