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

import assignment2.Contact;
import java.awt.Component;
import java.awt.Dimension;
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
		int contactImgHeight = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("ContactImgHeight"));
		int contactImgWidth = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("ContactImgWidth"));
		int StatusImgHeight = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("StatusImgHeight"));
		int StatusImgWidth = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("StatusImgWidth"));
		
		assert	contactImgHeight	!= -1 && 
				contactImgWidth		!= -1 && 
				StatusImgHeight		!= -1 && 
				StatusImgWidth		!= -1;
		
		for (Component contact: contactsPanel.getComponents()) {
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
        adaptiveButton3 = new widgets.button.AdaptiveButton();
        adaptiveButton4 = new widgets.button.AdaptiveButton();
        contentPanel = new widgets.panel.AdaptivePanel();
        adaptiveButton11 = new widgets.button.AdaptiveButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1000, 688));
        setMinimumSize(new java.awt.Dimension(1000, 688));
        setPreferredSize(new java.awt.Dimension(1000, 688));
        setLayout(new java.awt.BorderLayout());

        leftPanel.setLayout(new javax.swing.BoxLayout(leftPanel, javax.swing.BoxLayout.PAGE_AXIS));

        contactsPanel.setLayout(new javax.swing.BoxLayout(contactsPanel, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(contactsPanel);

        leftPanel.add(jScrollPane1);

        add(leftPanel, java.awt.BorderLayout.LINE_START);

        menuPanel.setLayout(new javax.swing.BoxLayout(menuPanel, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveButton1.setText("1");
        menuPanel.add(adaptiveButton1);

        adaptiveButton2.setText("2");
        menuPanel.add(adaptiveButton2);

        adaptiveButton3.setText("3");
        menuPanel.add(adaptiveButton3);

        adaptiveButton4.setText("4");
        menuPanel.add(adaptiveButton4);

        add(menuPanel, java.awt.BorderLayout.PAGE_START);

        contentPanel.setLayout(new javax.swing.BoxLayout(contentPanel, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveButton11.setText("adaptiveButton11");
        contentPanel.add(adaptiveButton11);

        add(contentPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.button.AdaptiveButton adaptiveButton11;
    private widgets.button.AdaptiveButton adaptiveButton2;
    private widgets.button.AdaptiveButton adaptiveButton3;
    private widgets.button.AdaptiveButton adaptiveButton4;
    private widgets.panel.AdaptivePanel contactsPanel;
    private widgets.panel.AdaptivePanel contentPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private widgets.panel.AdaptivePanel leftPanel;
    private widgets.panel.AdaptivePanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
