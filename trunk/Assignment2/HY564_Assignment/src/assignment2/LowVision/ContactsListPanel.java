/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ContactsListPanel.java
 *
 * Created on 3 Δεκ 2011, 1:46:29 μμ
 */
package assignment2.LowVision;

import assignment2.AccessibleIMInterface;
import assignment2.Contact;
import assignment2.NoDisability.Groups;
import assignment2.NoDisability.SearchForNewContact;
import java.awt.Component;
import java.awt.Container;
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
public class ContactsListPanel extends javax.swing.JPanel {

	/** Creates new form ContactsListPanel */
	public ContactsListPanel() {
		initComponents();
		Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		
		AddContacts();
		SetContactSizeImages();
		
        String path = DMSLConnector.getInstance().getClient(false).Evaluate("AddButton");
        addContactButton.setIcon(new ImageIcon(getClass().getResource(path)));  
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("GroupButton");
        groupContactsButton.setIcon(new ImageIcon(getClass().getResource(path)));  
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("SearchButton");
        searchButton.setIcon(new ImageIcon(getClass().getResource(path))); 
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("RemoveButton");
        removeContactButton.setIcon(new ImageIcon(getClass().getResource(path)));
		
		collpaseAddImgPath = DMSLConnector.getInstance().getClient(false).Evaluate("CollapseAddButton");
		collapseSubImgPath = DMSLConnector.getInstance().getClient(false).Evaluate("CollapseSubButton");
        groupButton0.setIcon(new ImageIcon(getClass().getResource(collpaseAddImgPath)));
		groupButton1.setIcon(new ImageIcon(getClass().getResource(collpaseAddImgPath)));
		groupButton2.setIcon(new ImageIcon(getClass().getResource(collpaseAddImgPath)));				
	}
	
	private void AddContacts () {
        groupContentPanel.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
		groupContentPanel.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusIdleImg", "Marigiana Skouradakh", "H zwh DEN einai skata", "idle"));
		groupContentPanel.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "busy"));		
		groupContentPanel.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel1.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("marigiannaImg", "Panel.Content.MarigiannaImage", "StatusBusyImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
        groupContentPanel2.add(new Contact("koutsopImg", "Panel.Content.KoutsopImage", "StatusAvailableImg", "Koutsopoulos Nikolaos", "H zwh einai skata", "available"));
	}
	
	private void SetContactSizeImages () {
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
		
		for (Component contact: groupContentPanel.getComponents()) {
			((Contact)contact).SetAvatarDimensionPanel(contactImgWidth, contactImgHeight);
            ((Contact)contact).SetStatusDimensionPanel(statusImgWidth, statusImgHeight);
		}
		for (Component contact: groupContentPanel1.getComponents()) {
			((Contact)contact).SetAvatarDimensionPanel(contactImgWidth, contactImgHeight);
            ((Contact)contact).SetStatusDimensionPanel(statusImgWidth, statusImgHeight);
		}
		for (Component contact: groupContentPanel2.getComponents()) {
			((Contact)contact).SetAvatarDimensionPanel(contactImgWidth, contactImgHeight);
            ((Contact)contact).SetStatusDimensionPanel(statusImgWidth, statusImgHeight);
		}	
	}	
	
	private void CollapseGroup (JPanel group, JButton button, int initialHeight) {
		group.setVisible(!group.isVisible());
		
		if (group.isVisible()) {
			button.setIcon(new ImageIcon(getClass().getResource(collpaseAddImgPath)));
			group.setPreferredSize(new Dimension(group.getPreferredSize().width, initialHeight));
		}
		else {
			button.setIcon(new ImageIcon(getClass().getResource(collapseSubImgPath)));
			group.setPreferredSize(new Dimension(group.getPreferredSize().width, 0));				
		}
	}	
	
	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftCenterPanel = new widgets.panel.AdaptivePanel();
        contactActionPanel = new widgets.panel.AdaptivePanel();
        buttonsPanel = new widgets.panel.AdaptivePanel();
        addContactButton = new widgets.button.AdaptiveButton();
        removeContactButton = new widgets.button.AdaptiveButton();
        groupContactsButton = new widgets.button.AdaptiveButton();
        searchPanel = new widgets.panel.AdaptivePanel();
        adaptiveTextField1 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        searchButton = new widgets.button.AdaptiveButton();
        contactsPanel = new widgets.panel.AdaptivePanel();
        contactsListScrollPane = new javax.swing.JScrollPane();
        contactsListPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        groupPanel = new widgets.panel.AdaptivePanel();
        groupNamePanel = new widgets.panel.AdaptivePanel();
        groupButton0 = new widgets.button.AdaptiveButton();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        groupContentPanel = new widgets.panel.AdaptivePanel();
        westPanel = new widgets.panel.AdaptivePanel();
        groupPanel1 = new widgets.panel.AdaptivePanel();
        groupNamePanel1 = new widgets.panel.AdaptivePanel();
        groupButton1 = new widgets.button.AdaptiveButton();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        groupContentPanel1 = new widgets.panel.AdaptivePanel();
        westPanel1 = new widgets.panel.AdaptivePanel();
        groupPanel2 = new widgets.panel.AdaptivePanel();
        groupNamePanel2 = new widgets.panel.AdaptivePanel();
        groupButton2 = new widgets.button.AdaptiveButton();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        groupContentPanel2 = new widgets.panel.AdaptivePanel();
        westPanel2 = new widgets.panel.AdaptivePanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        LeftCenterPanel.setLayout(new java.awt.BorderLayout(0, 10));

        contactActionPanel.setLayout(new java.awt.GridLayout(1, 2));

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
        groupContactsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupContactsButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(groupContactsButton);

        contactActionPanel.add(buttonsPanel);

        searchPanel.setLayout(new javax.swing.BoxLayout(searchPanel, javax.swing.BoxLayout.LINE_AXIS));
        searchPanel.add(adaptiveTextField1);

        adaptivePanel3.setMaximumSize(new java.awt.Dimension(3, 1));
        adaptivePanel3.setMinimumSize(new java.awt.Dimension(3, 1));

        javax.swing.GroupLayout adaptivePanel3Layout = new javax.swing.GroupLayout(adaptivePanel3);
        adaptivePanel3.setLayout(adaptivePanel3Layout);
        adaptivePanel3Layout.setHorizontalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        adaptivePanel3Layout.setVerticalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        searchPanel.add(adaptivePanel3);

        searchButton.setFunction("ContactsActionButton");
        searchPanel.add(searchButton);

        contactActionPanel.add(searchPanel);

        LeftCenterPanel.add(contactActionPanel, java.awt.BorderLayout.NORTH);

        contactsPanel.setLayout(new javax.swing.BoxLayout(contactsPanel, javax.swing.BoxLayout.LINE_AXIS));

        contactsListPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel5.setLayout(new javax.swing.BoxLayout(adaptivePanel5, javax.swing.BoxLayout.PAGE_AXIS));

        groupPanel.setLayout(new java.awt.BorderLayout(15, 0));

        groupNamePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        groupButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupButton0ActionPerformed(evt);
            }
        });
        groupNamePanel.add(groupButton0);

        adaptivePanel1.setMaximumSize(new java.awt.Dimension(3, 1));
        adaptivePanel1.setMinimumSize(new java.awt.Dimension(3, 1));

        javax.swing.GroupLayout adaptivePanel1Layout = new javax.swing.GroupLayout(adaptivePanel1);
        adaptivePanel1.setLayout(adaptivePanel1Layout);
        adaptivePanel1Layout.setHorizontalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        adaptivePanel1Layout.setVerticalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        groupNamePanel.add(adaptivePanel1);

        adaptiveLabel1.setText("CSD");
        groupNamePanel.add(adaptiveLabel1);

        groupPanel.add(groupNamePanel, java.awt.BorderLayout.NORTH);

        groupContentPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        groupContentPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 20));
        groupPanel.add(groupContentPanel, java.awt.BorderLayout.CENTER);

        westPanel.setMaximumSize(new java.awt.Dimension(1, 1));
        westPanel.setMinimumSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout westPanelLayout = new javax.swing.GroupLayout(westPanel);
        westPanel.setLayout(westPanelLayout);
        westPanelLayout.setHorizontalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        westPanelLayout.setVerticalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        groupPanel.add(westPanel, java.awt.BorderLayout.WEST);

        adaptivePanel5.add(groupPanel);

        groupPanel1.setLayout(new java.awt.BorderLayout(15, 0));

        groupNamePanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        groupButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupButton1ActionPerformed(evt);
            }
        });
        groupNamePanel1.add(groupButton1);

        adaptivePanel2.setMaximumSize(new java.awt.Dimension(3, 1));
        adaptivePanel2.setMinimumSize(new java.awt.Dimension(3, 1));

        javax.swing.GroupLayout adaptivePanel2Layout = new javax.swing.GroupLayout(adaptivePanel2);
        adaptivePanel2.setLayout(adaptivePanel2Layout);
        adaptivePanel2Layout.setHorizontalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        adaptivePanel2Layout.setVerticalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        groupNamePanel1.add(adaptivePanel2);

        adaptiveLabel2.setText("CSD 1");
        groupNamePanel1.add(adaptiveLabel2);

        groupPanel1.add(groupNamePanel1, java.awt.BorderLayout.NORTH);

        groupContentPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        groupContentPanel1.setLayout(new java.awt.GridLayout(0, 1, 0, 20));
        groupPanel1.add(groupContentPanel1, java.awt.BorderLayout.CENTER);

        westPanel1.setMaximumSize(new java.awt.Dimension(1, 1));
        westPanel1.setMinimumSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout westPanel1Layout = new javax.swing.GroupLayout(westPanel1);
        westPanel1.setLayout(westPanel1Layout);
        westPanel1Layout.setHorizontalGroup(
            westPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        westPanel1Layout.setVerticalGroup(
            westPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        groupPanel1.add(westPanel1, java.awt.BorderLayout.WEST);

        adaptivePanel5.add(groupPanel1);

        groupPanel2.setLayout(new java.awt.BorderLayout(15, 0));

        groupNamePanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        groupButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupButton2ActionPerformed(evt);
            }
        });
        groupNamePanel2.add(groupButton2);

        adaptivePanel4.setMaximumSize(new java.awt.Dimension(3, 1));
        adaptivePanel4.setMinimumSize(new java.awt.Dimension(3, 1));

        javax.swing.GroupLayout adaptivePanel4Layout = new javax.swing.GroupLayout(adaptivePanel4);
        adaptivePanel4.setLayout(adaptivePanel4Layout);
        adaptivePanel4Layout.setHorizontalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        adaptivePanel4Layout.setVerticalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        groupNamePanel2.add(adaptivePanel4);

        adaptiveLabel3.setText("CSD 2");
        groupNamePanel2.add(adaptiveLabel3);

        groupPanel2.add(groupNamePanel2, java.awt.BorderLayout.NORTH);

        groupContentPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        groupContentPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 20));
        groupPanel2.add(groupContentPanel2, java.awt.BorderLayout.CENTER);

        westPanel2.setMaximumSize(new java.awt.Dimension(1, 1));
        westPanel2.setMinimumSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout westPanel2Layout = new javax.swing.GroupLayout(westPanel2);
        westPanel2.setLayout(westPanel2Layout);
        westPanel2Layout.setHorizontalGroup(
            westPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        westPanel2Layout.setVerticalGroup(
            westPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        groupPanel2.add(westPanel2, java.awt.BorderLayout.WEST);

        adaptivePanel5.add(groupPanel2);

        contactsListPanel.add(adaptivePanel5);

        contactsListScrollPane.setViewportView(contactsListPanel);

        contactsPanel.add(contactsListScrollPane);

        LeftCenterPanel.add(contactsPanel, java.awt.BorderLayout.CENTER);

        add(LeftCenterPanel);
    }// </editor-fold>//GEN-END:initComponents

	private void groupButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupButton0ActionPerformed
		if (groupInitialHeight == -1)	//Do in first call
			groupInitialHeight = groupContentPanel.getPreferredSize().height;
		CollapseGroup(groupContentPanel, groupButton0, groupInitialHeight);
	}//GEN-LAST:event_groupButton0ActionPerformed

	private void groupButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupButton1ActionPerformed
		if (group1InitialHeight == -1)	//Do in first call
			group1InitialHeight = groupContentPanel1.getPreferredSize().height;		
		CollapseGroup(groupContentPanel1, groupButton1, group1InitialHeight);
	}//GEN-LAST:event_groupButton1ActionPerformed

	private void groupButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupButton2ActionPerformed
		if (group2InitialHeight == -1)	//Do in first call
			group2InitialHeight = groupContentPanel2.getPreferredSize().height;			
		CollapseGroup(groupContentPanel2, groupButton2, group2InitialHeight);
	}//GEN-LAST:event_groupButton2ActionPerformed

	private void addContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addContactButtonActionPerformed
		JPanel myParent = (JPanel)getParent();	
		while ( (!(myParent instanceof AccessibleIMInterface)) && myParent != null)
			 myParent = (JPanel)myParent.getParent();
		((AccessibleIMInterface)myParent).ShowIMButton(true);
		
		myParent = (JPanel)getParent().getParent();
		SearchForNewContact c	= new SearchForNewContact();    
        myParent.removeAll();
        c.setVisible(true);
        myParent.add(c);
        myParent.repaint();
        myParent.validate();   
	}//GEN-LAST:event_addContactButtonActionPerformed

	private void groupContactsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupContactsButtonActionPerformed
		JPanel myParent = (JPanel)getParent();	
		while ( (!(myParent instanceof AccessibleIMInterface)) && myParent != null)
			 myParent = (JPanel)myParent.getParent();
		((AccessibleIMInterface)myParent).ShowIMButton(true);
		
		myParent = (JPanel)getParent().getParent();
		Groups c = new Groups();    
        myParent.removeAll();
        c.setVisible(true);
        myParent.add(c);
        myParent.repaint();
        myParent.validate(); 
	}//GEN-LAST:event_groupContactsButtonActionPerformed
	
	/*********************************************/
	//Collapse control variables
	private int groupInitialHeight	= -1;
	private int group1InitialHeight	= -1;
	private int group2InitialHeight	= -1;
	
	private String collpaseAddImgPath;
	private String collapseSubImgPath;	
	/*********************************************/
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.panel.AdaptivePanel LeftCenterPanel;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.textfield.AdaptiveTextField adaptiveTextField1;
    private widgets.button.AdaptiveButton addContactButton;
    private widgets.panel.AdaptivePanel buttonsPanel;
    private widgets.panel.AdaptivePanel contactActionPanel;
    private widgets.panel.AdaptivePanel contactsListPanel;
    private javax.swing.JScrollPane contactsListScrollPane;
    private widgets.panel.AdaptivePanel contactsPanel;
    private widgets.button.AdaptiveButton groupButton0;
    private widgets.button.AdaptiveButton groupButton1;
    private widgets.button.AdaptiveButton groupButton2;
    private widgets.button.AdaptiveButton groupContactsButton;
    private widgets.panel.AdaptivePanel groupContentPanel;
    private widgets.panel.AdaptivePanel groupContentPanel1;
    private widgets.panel.AdaptivePanel groupContentPanel2;
    private widgets.panel.AdaptivePanel groupNamePanel;
    private widgets.panel.AdaptivePanel groupNamePanel1;
    private widgets.panel.AdaptivePanel groupNamePanel2;
    private widgets.panel.AdaptivePanel groupPanel;
    private widgets.panel.AdaptivePanel groupPanel1;
    private widgets.panel.AdaptivePanel groupPanel2;
    private widgets.button.AdaptiveButton removeContactButton;
    private widgets.button.AdaptiveButton searchButton;
    private widgets.panel.AdaptivePanel searchPanel;
    private widgets.panel.AdaptivePanel westPanel;
    private widgets.panel.AdaptivePanel westPanel1;
    private widgets.panel.AdaptivePanel westPanel2;
    // End of variables declaration//GEN-END:variables
}
