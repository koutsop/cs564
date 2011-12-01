/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Chat.java
 *
 * Created on 29 Νοε 2011, 9:47:38 πμ
 */
package assignment2.Spots;

import Utility.Utility;
import javax.swing.ImageIcon;
import utilities.Adaptation;
import utilities.DMSLConnector;


/**
 *
 * @author koutsop
 */
public class Chat extends javax.swing.JPanel {

	/** Creates new form Chat */
	public Chat() {
		initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        int contactImgHeight = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("ContactImgHeight"));
		int contactImgWidth = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("ContactImgWidth"));
		int statusImgHeight = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("StatusImgHeight"));
		int statusImgWidth = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("StatusImgWidth"));
		
		assert	contactImgHeight	!= -1 && 
				contactImgWidth		!= -1 && 
				statusImgHeight		!= -1 && 
				statusImgWidth		!= -1;
        
        Utility.SetJComponentSize(avatarPanel, contactImgWidth, contactImgHeight);
        Utility.SetJComponentSize(statusAvatarPanel, statusImgWidth, statusImgHeight);
        
        String path = DMSLConnector.getInstance().getClient(false).Evaluate("VideoCallButton");
        videoCallButton.setIcon(new ImageIcon(getClass().getResource(path)));
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("CallButton");
        callButton.setIcon(new ImageIcon(getClass().getResource(path)));
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("SendFileButton");
        sendFileButton.setIcon(new ImageIcon(getClass().getResource(path)));
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("AddButton");
        addButton.setIcon(new ImageIcon(getClass().getResource(path)));  
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("CloseButton");
        closeButton.setIcon(new ImageIcon(getClass().getResource(path)));	
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        avatarPanel = new widgets.panel.AdaptivePanel();
        statusPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        nameLabel = new widgets.label.AdaptiveLabel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        statusAvatarPanel = new widgets.panel.AdaptivePanel();
        statusLabel = new widgets.label.AdaptiveLabel();
        centerPanel = new widgets.panel.AdaptivePanel();
        northGapPanel = new widgets.panel.AdaptivePanel();
        centerPanel1 = new widgets.panel.AdaptivePanel();
        receivePanel = new widgets.panel.AdaptivePanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        scroolContentPanel = new widgets.panel.AdaptivePanel();
        conversationKoutsopPanel = new widgets.panel.AdaptivePanel();
        senderPanel2 = new widgets.panel.AdaptivePanel();
        northPanel1 = new widgets.panel.AdaptivePanel();
        senderInfoPanel2 = new widgets.panel.AdaptivePanel();
        senderImagePanel1 = new widgets.panel.AdaptivePanel();
        senderInfoPanel3 = new widgets.panel.AdaptivePanel();
        senderNameLabel1 = new widgets.label.AdaptiveLabel();
        timeLabel1 = new widgets.label.AdaptiveLabel();
        senderTextPanel1 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        conversationMarigiannaPanel = new widgets.panel.AdaptivePanel();
        senderPanel1 = new widgets.panel.AdaptivePanel();
        northPanel = new widgets.panel.AdaptivePanel();
        senderInfoPanel1 = new widgets.panel.AdaptivePanel();
        senderImagePanel = new widgets.panel.AdaptivePanel();
        senderInfoPanel = new widgets.panel.AdaptivePanel();
        senderNameLabel = new widgets.label.AdaptiveLabel();
        timeLabel = new widgets.label.AdaptiveLabel();
        senderTextPanel = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        conversationKoutsopPanel1 = new widgets.panel.AdaptivePanel();
        senderPanel3 = new widgets.panel.AdaptivePanel();
        northPanel2 = new widgets.panel.AdaptivePanel();
        senderInfoPanel4 = new widgets.panel.AdaptivePanel();
        senderImagePanel2 = new widgets.panel.AdaptivePanel();
        senderInfoPanel5 = new widgets.panel.AdaptivePanel();
        senderNameLabel2 = new widgets.label.AdaptiveLabel();
        timeLabel2 = new widgets.label.AdaptiveLabel();
        senderTextPanel2 = new widgets.panel.AdaptivePanel();
        adaptiveLabel4 = new widgets.label.AdaptiveLabel();
        conversationMarigiannaPanel1 = new widgets.panel.AdaptivePanel();
        senderPanel4 = new widgets.panel.AdaptivePanel();
        northPanel3 = new widgets.panel.AdaptivePanel();
        senderInfoPanel6 = new widgets.panel.AdaptivePanel();
        senderImagePanel3 = new widgets.panel.AdaptivePanel();
        senderInfoPanel7 = new widgets.panel.AdaptivePanel();
        senderNameLabel3 = new widgets.label.AdaptiveLabel();
        timeLabel3 = new widgets.label.AdaptiveLabel();
        senderTextPanel3 = new widgets.panel.AdaptivePanel();
        adaptiveLabel5 = new widgets.label.AdaptiveLabel();
        adaptiveLabel6 = new widgets.label.AdaptiveLabel();
        conversationMarigiannaPanel2 = new widgets.panel.AdaptivePanel();
        senderPanel5 = new widgets.panel.AdaptivePanel();
        northPanel4 = new widgets.panel.AdaptivePanel();
        senderInfoPanel8 = new widgets.panel.AdaptivePanel();
        senderImagePanel4 = new widgets.panel.AdaptivePanel();
        senderInfoPanel9 = new widgets.panel.AdaptivePanel();
        senderNameLabel4 = new widgets.label.AdaptiveLabel();
        timeLabel4 = new widgets.label.AdaptiveLabel();
        senderTextPanel4 = new widgets.panel.AdaptivePanel();
        adaptiveLabel7 = new widgets.label.AdaptiveLabel();
        adaptiveLabel8 = new widgets.label.AdaptiveLabel();
        sendPanel = new widgets.panel.AdaptivePanel();
        chatButtonsPanel = new widgets.panel.AdaptivePanel();
        videoCallButton = new widgets.button.AdaptiveButton();
        callButton = new widgets.button.AdaptiveButton();
        sendFileButton = new widgets.button.AdaptiveButton();
        addButton = new widgets.button.AdaptiveButton();
        closeButton = new widgets.button.AdaptiveButton();
        chatPanel = new widgets.panel.AdaptivePanel();
        sendButonPanel = new widgets.panel.AdaptivePanel();
        sendButton = new widgets.button.AdaptiveButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        adaptiveTextBox2 = new widgets.textbox.AdaptiveTextBox();

        setLayout(new java.awt.BorderLayout());

        contactPanel.setMaximumSize(new java.awt.Dimension(32767, 100));
        contactPanel.setMinimumSize(new java.awt.Dimension(125, 100));
        contactPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));

        adaptivePanel2.setLayout(new javax.swing.BoxLayout(adaptivePanel2, javax.swing.BoxLayout.PAGE_AXIS));

        avatarPanel.setFunction("marigiannaImg");
        avatarPanel.setName("Panel.Content.MarigiannaImage"); // NOI18N
        avatarPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        adaptivePanel2.add(avatarPanel);

        statusPanel.setLayout(new java.awt.BorderLayout(0, 4));

        adaptivePanel1.setMinimumSize(new java.awt.Dimension(1, 1));
        adaptivePanel1.setPreferredSize(new java.awt.Dimension(1, 1));
        adaptivePanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        statusPanel.add(adaptivePanel1, java.awt.BorderLayout.PAGE_START);

        adaptivePanel3.setLayout(new javax.swing.BoxLayout(adaptivePanel3, javax.swing.BoxLayout.PAGE_AXIS));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        nameLabel.setText("Marigianna Skouradakh:");
        adaptivePanel3.add(nameLabel);

        adaptivePanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        statusAvatarPanel.setFunction("StatusAvailableImg");
        statusAvatarPanel.setName("ContactPanel.StatusAvailablePanel"); // NOI18N
        statusAvatarPanel.setLayout(new javax.swing.BoxLayout(statusAvatarPanel, javax.swing.BoxLayout.LINE_AXIS));
        adaptivePanel4.add(statusAvatarPanel);

        statusLabel.setText("Pame xoro?");
        adaptivePanel4.add(statusLabel);

        adaptivePanel3.add(adaptivePanel4);

        statusPanel.add(adaptivePanel3, java.awt.BorderLayout.LINE_END);

        adaptivePanel2.add(statusPanel);

        contactPanel.add(adaptivePanel2);

        add(contactPanel, java.awt.BorderLayout.NORTH);

        centerPanel.setLayout(new java.awt.BorderLayout());

        northGapPanel.setMinimumSize(new java.awt.Dimension(0, 200));
        northGapPanel.setPreferredSize(new java.awt.Dimension(400, 200));

        javax.swing.GroupLayout northGapPanelLayout = new javax.swing.GroupLayout(northGapPanel);
        northGapPanel.setLayout(northGapPanelLayout);
        northGapPanelLayout.setHorizontalGroup(
            northGapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        northGapPanelLayout.setVerticalGroup(
            northGapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        centerPanel.add(northGapPanel, java.awt.BorderLayout.NORTH);

        centerPanel1.setLayout(new javax.swing.BoxLayout(centerPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        receivePanel.setLayout(new javax.swing.BoxLayout(receivePanel, javax.swing.BoxLayout.LINE_AXIS));

        scroolContentPanel.setLayout(new java.awt.GridLayout(5, 1, 0, 20));

        conversationKoutsopPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        conversationKoutsopPanel.setLayout(new javax.swing.BoxLayout(conversationKoutsopPanel, javax.swing.BoxLayout.LINE_AXIS));

        senderPanel2.setName("Panel.ChatBox"); // NOI18N
        senderPanel2.setLayout(new java.awt.BorderLayout());

        northPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 10));

        senderInfoPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        senderImagePanel1.setFunction("koutsopImg");
        senderImagePanel1.setMaximumSize(new java.awt.Dimension(50, 50));
        senderImagePanel1.setMinimumSize(new java.awt.Dimension(50, 50));
        senderImagePanel1.setName("Panel.Content.KoutsopImage"); // NOI18N
        senderImagePanel1.setPreferredSize(new java.awt.Dimension(50, 50));
        senderImagePanel1.setLayout(new javax.swing.BoxLayout(senderImagePanel1, javax.swing.BoxLayout.LINE_AXIS));
        senderInfoPanel2.add(senderImagePanel1);

        senderInfoPanel3.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        senderNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        senderNameLabel1.setText("Koutsop:");
        senderInfoPanel3.add(senderNameLabel1);

        timeLabel1.setText("Sent at 12:03 PM on Sunday");
        senderInfoPanel3.add(timeLabel1);

        senderInfoPanel2.add(senderInfoPanel3);

        northPanel1.add(senderInfoPanel2);

        senderPanel2.add(northPanel1, java.awt.BorderLayout.NORTH);

        senderTextPanel1.setLayout(new javax.swing.BoxLayout(senderTextPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel3.setText("Pws paei eisai kala? Elpizw na eisai kala. Ta leme");
        senderTextPanel1.add(adaptiveLabel3);

        senderPanel2.add(senderTextPanel1, java.awt.BorderLayout.CENTER);

        conversationKoutsopPanel.add(senderPanel2);

        scroolContentPanel.add(conversationKoutsopPanel);

        conversationMarigiannaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        conversationMarigiannaPanel.setLayout(new javax.swing.BoxLayout(conversationMarigiannaPanel, javax.swing.BoxLayout.LINE_AXIS));

        senderPanel1.setName("Panel.ChatBox"); // NOI18N
        senderPanel1.setLayout(new java.awt.BorderLayout());

        northPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 10));

        senderInfoPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        senderImagePanel.setFunction("marigiannaImg");
        senderImagePanel.setMaximumSize(new java.awt.Dimension(50, 50));
        senderImagePanel.setMinimumSize(new java.awt.Dimension(50, 50));
        senderImagePanel.setName("Panel.Content.MarigiannaImage"); // NOI18N
        senderImagePanel.setPreferredSize(new java.awt.Dimension(50, 50));
        senderImagePanel.setLayout(new javax.swing.BoxLayout(senderImagePanel, javax.swing.BoxLayout.LINE_AXIS));
        senderInfoPanel1.add(senderImagePanel);

        senderInfoPanel.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        senderNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        senderNameLabel.setText("Marigianna:");
        senderInfoPanel.add(senderNameLabel);

        timeLabel.setText("Sent at 12:03 PM on Sunday");
        senderInfoPanel.add(timeLabel);

        senderInfoPanel1.add(senderInfoPanel);

        northPanel.add(senderInfoPanel1);

        senderPanel1.add(northPanel, java.awt.BorderLayout.NORTH);

        senderTextPanel.setLayout(new javax.swing.BoxLayout(senderTextPanel, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel2.setText("Bariemai thn zwh mou n to 3reis auto lalalalalalalalalalaalalalal");
        senderTextPanel.add(adaptiveLabel2);

        adaptiveLabel1.setText("Bariemai thn zwh mou n to 3reis auto");
        senderTextPanel.add(adaptiveLabel1);

        senderPanel1.add(senderTextPanel, java.awt.BorderLayout.CENTER);

        conversationMarigiannaPanel.add(senderPanel1);

        scroolContentPanel.add(conversationMarigiannaPanel);

        conversationKoutsopPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        conversationKoutsopPanel1.setLayout(new javax.swing.BoxLayout(conversationKoutsopPanel1, javax.swing.BoxLayout.LINE_AXIS));

        senderPanel3.setName("Panel.ChatBox"); // NOI18N
        senderPanel3.setLayout(new java.awt.BorderLayout());

        northPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 10));

        senderInfoPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        senderImagePanel2.setFunction("koutsopImg");
        senderImagePanel2.setMaximumSize(new java.awt.Dimension(50, 50));
        senderImagePanel2.setMinimumSize(new java.awt.Dimension(50, 50));
        senderImagePanel2.setName("Panel.Content.KoutsopImage"); // NOI18N
        senderImagePanel2.setPreferredSize(new java.awt.Dimension(50, 50));
        senderImagePanel2.setLayout(new javax.swing.BoxLayout(senderImagePanel2, javax.swing.BoxLayout.LINE_AXIS));
        senderInfoPanel4.add(senderImagePanel2);

        senderInfoPanel5.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        senderNameLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        senderNameLabel2.setText("Koutsop:");
        senderInfoPanel5.add(senderNameLabel2);

        timeLabel2.setText("Sent at 12:03 PM on Sunday");
        senderInfoPanel5.add(timeLabel2);

        senderInfoPanel4.add(senderInfoPanel5);

        northPanel2.add(senderInfoPanel4);

        senderPanel3.add(northPanel2, java.awt.BorderLayout.NORTH);

        senderTextPanel2.setLayout(new javax.swing.BoxLayout(senderTextPanel2, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel4.setText("Pws paei eisai kala? Elpizw na eisai kala. Ta leme");
        senderTextPanel2.add(adaptiveLabel4);

        senderPanel3.add(senderTextPanel2, java.awt.BorderLayout.CENTER);

        conversationKoutsopPanel1.add(senderPanel3);

        scroolContentPanel.add(conversationKoutsopPanel1);

        conversationMarigiannaPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        conversationMarigiannaPanel1.setLayout(new javax.swing.BoxLayout(conversationMarigiannaPanel1, javax.swing.BoxLayout.LINE_AXIS));

        senderPanel4.setName("Panel.ChatBox"); // NOI18N
        senderPanel4.setLayout(new java.awt.BorderLayout());

        northPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 10));

        senderInfoPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        senderImagePanel3.setFunction("marigiannaImg");
        senderImagePanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        senderImagePanel3.setMinimumSize(new java.awt.Dimension(50, 50));
        senderImagePanel3.setName("Panel.Content.MarigiannaImage"); // NOI18N
        senderImagePanel3.setPreferredSize(new java.awt.Dimension(50, 50));
        senderImagePanel3.setLayout(new javax.swing.BoxLayout(senderImagePanel3, javax.swing.BoxLayout.LINE_AXIS));
        senderInfoPanel6.add(senderImagePanel3);

        senderInfoPanel7.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        senderNameLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        senderNameLabel3.setText("Marigianna:");
        senderInfoPanel7.add(senderNameLabel3);

        timeLabel3.setText("Sent at 12:03 PM on Sunday");
        senderInfoPanel7.add(timeLabel3);

        senderInfoPanel6.add(senderInfoPanel7);

        northPanel3.add(senderInfoPanel6);

        senderPanel4.add(northPanel3, java.awt.BorderLayout.NORTH);

        senderTextPanel3.setLayout(new javax.swing.BoxLayout(senderTextPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel5.setText("Bariemai thn zwh mou n to 3reis auto lalalalalalalalalalaalalalal");
        senderTextPanel3.add(adaptiveLabel5);

        adaptiveLabel6.setText("Bariemai thn zwh mou n to 3reis auto");
        senderTextPanel3.add(adaptiveLabel6);

        senderPanel4.add(senderTextPanel3, java.awt.BorderLayout.CENTER);

        conversationMarigiannaPanel1.add(senderPanel4);

        scroolContentPanel.add(conversationMarigiannaPanel1);

        conversationMarigiannaPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        conversationMarigiannaPanel2.setLayout(new javax.swing.BoxLayout(conversationMarigiannaPanel2, javax.swing.BoxLayout.LINE_AXIS));

        senderPanel5.setName("Panel.ChatBox"); // NOI18N
        senderPanel5.setLayout(new java.awt.BorderLayout());

        northPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 10));

        senderInfoPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        senderImagePanel4.setFunction("marigiannaImg");
        senderImagePanel4.setMaximumSize(new java.awt.Dimension(50, 50));
        senderImagePanel4.setMinimumSize(new java.awt.Dimension(50, 50));
        senderImagePanel4.setName("Panel.Content.MarigiannaImage"); // NOI18N
        senderImagePanel4.setPreferredSize(new java.awt.Dimension(50, 50));
        senderImagePanel4.setLayout(new javax.swing.BoxLayout(senderImagePanel4, javax.swing.BoxLayout.LINE_AXIS));
        senderInfoPanel8.add(senderImagePanel4);

        senderInfoPanel9.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        senderNameLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        senderNameLabel4.setText("Marigianna:");
        senderInfoPanel9.add(senderNameLabel4);

        timeLabel4.setText("Sent at 12:03 PM on Sunday");
        senderInfoPanel9.add(timeLabel4);

        senderInfoPanel8.add(senderInfoPanel9);

        northPanel4.add(senderInfoPanel8);

        senderPanel5.add(northPanel4, java.awt.BorderLayout.NORTH);

        senderTextPanel4.setLayout(new javax.swing.BoxLayout(senderTextPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel7.setText("Bariemai thn zwh mou n to 3reis auto lalalalalalalalalalaalalalal");
        senderTextPanel4.add(adaptiveLabel7);

        adaptiveLabel8.setText("Bariemai thn zwh mou n to 3reis auto");
        senderTextPanel4.add(adaptiveLabel8);

        senderPanel5.add(senderTextPanel4, java.awt.BorderLayout.CENTER);

        conversationMarigiannaPanel2.add(senderPanel5);

        scroolContentPanel.add(conversationMarigiannaPanel2);

        jScrollPane2.setViewportView(scroolContentPanel);

        receivePanel.add(jScrollPane2);

        centerPanel1.add(receivePanel);

        sendPanel.setLayout(new java.awt.BorderLayout(0, 5));

        chatButtonsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        videoCallButton.setFunction("ChatButton");
        chatButtonsPanel.add(videoCallButton);

        callButton.setFunction("ChatButton");
        chatButtonsPanel.add(callButton);

        sendFileButton.setFunction("ChatButton");
        chatButtonsPanel.add(sendFileButton);

        addButton.setFunction("ChatButton");
        chatButtonsPanel.add(addButton);

        closeButton.setFunction("ChatButton");
        chatButtonsPanel.add(closeButton);

        sendPanel.add(chatButtonsPanel, java.awt.BorderLayout.NORTH);

        chatPanel.setLayout(new java.awt.BorderLayout(15, 15));

        sendButonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        sendButton.setFunction("ChatButton");
        sendButton.setText("Send");
        sendButonPanel.add(sendButton);

        chatPanel.add(sendButonPanel, java.awt.BorderLayout.EAST);

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        adaptiveTextBox2.setColumns(20);
        adaptiveTextBox2.setRows(5);
        jScrollPane1.setViewportView(adaptiveTextBox2);

        chatPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        sendPanel.add(chatPanel, java.awt.BorderLayout.CENTER);

        centerPanel1.add(sendPanel);

        centerPanel.add(centerPanel1, java.awt.BorderLayout.CENTER);

        add(centerPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.label.AdaptiveLabel adaptiveLabel4;
    private widgets.label.AdaptiveLabel adaptiveLabel5;
    private widgets.label.AdaptiveLabel adaptiveLabel6;
    private widgets.label.AdaptiveLabel adaptiveLabel7;
    private widgets.label.AdaptiveLabel adaptiveLabel8;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.textbox.AdaptiveTextBox adaptiveTextBox2;
    private widgets.button.AdaptiveButton addButton;
    private widgets.panel.AdaptivePanel avatarPanel;
    private widgets.button.AdaptiveButton callButton;
    private widgets.panel.AdaptivePanel centerPanel;
    private widgets.panel.AdaptivePanel centerPanel1;
    private widgets.panel.AdaptivePanel chatButtonsPanel;
    private widgets.panel.AdaptivePanel chatPanel;
    private widgets.button.AdaptiveButton closeButton;
    private widgets.panel.AdaptivePanel contactPanel;
    private widgets.panel.AdaptivePanel conversationKoutsopPanel;
    private widgets.panel.AdaptivePanel conversationKoutsopPanel1;
    private widgets.panel.AdaptivePanel conversationMarigiannaPanel;
    private widgets.panel.AdaptivePanel conversationMarigiannaPanel1;
    private widgets.panel.AdaptivePanel conversationMarigiannaPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private widgets.label.AdaptiveLabel nameLabel;
    private widgets.panel.AdaptivePanel northGapPanel;
    private widgets.panel.AdaptivePanel northPanel;
    private widgets.panel.AdaptivePanel northPanel1;
    private widgets.panel.AdaptivePanel northPanel2;
    private widgets.panel.AdaptivePanel northPanel3;
    private widgets.panel.AdaptivePanel northPanel4;
    private widgets.panel.AdaptivePanel receivePanel;
    private widgets.panel.AdaptivePanel scroolContentPanel;
    private widgets.panel.AdaptivePanel sendButonPanel;
    private widgets.button.AdaptiveButton sendButton;
    private widgets.button.AdaptiveButton sendFileButton;
    private widgets.panel.AdaptivePanel sendPanel;
    private widgets.panel.AdaptivePanel senderImagePanel;
    private widgets.panel.AdaptivePanel senderImagePanel1;
    private widgets.panel.AdaptivePanel senderImagePanel2;
    private widgets.panel.AdaptivePanel senderImagePanel3;
    private widgets.panel.AdaptivePanel senderImagePanel4;
    private widgets.panel.AdaptivePanel senderInfoPanel;
    private widgets.panel.AdaptivePanel senderInfoPanel1;
    private widgets.panel.AdaptivePanel senderInfoPanel2;
    private widgets.panel.AdaptivePanel senderInfoPanel3;
    private widgets.panel.AdaptivePanel senderInfoPanel4;
    private widgets.panel.AdaptivePanel senderInfoPanel5;
    private widgets.panel.AdaptivePanel senderInfoPanel6;
    private widgets.panel.AdaptivePanel senderInfoPanel7;
    private widgets.panel.AdaptivePanel senderInfoPanel8;
    private widgets.panel.AdaptivePanel senderInfoPanel9;
    private widgets.label.AdaptiveLabel senderNameLabel;
    private widgets.label.AdaptiveLabel senderNameLabel1;
    private widgets.label.AdaptiveLabel senderNameLabel2;
    private widgets.label.AdaptiveLabel senderNameLabel3;
    private widgets.label.AdaptiveLabel senderNameLabel4;
    private widgets.panel.AdaptivePanel senderPanel1;
    private widgets.panel.AdaptivePanel senderPanel2;
    private widgets.panel.AdaptivePanel senderPanel3;
    private widgets.panel.AdaptivePanel senderPanel4;
    private widgets.panel.AdaptivePanel senderPanel5;
    private widgets.panel.AdaptivePanel senderTextPanel;
    private widgets.panel.AdaptivePanel senderTextPanel1;
    private widgets.panel.AdaptivePanel senderTextPanel2;
    private widgets.panel.AdaptivePanel senderTextPanel3;
    private widgets.panel.AdaptivePanel senderTextPanel4;
    private widgets.panel.AdaptivePanel statusAvatarPanel;
    private widgets.label.AdaptiveLabel statusLabel;
    private widgets.panel.AdaptivePanel statusPanel;
    private widgets.label.AdaptiveLabel timeLabel;
    private widgets.label.AdaptiveLabel timeLabel1;
    private widgets.label.AdaptiveLabel timeLabel2;
    private widgets.label.AdaptiveLabel timeLabel3;
    private widgets.label.AdaptiveLabel timeLabel4;
    private widgets.button.AdaptiveButton videoCallButton;
    // End of variables declaration//GEN-END:variables
}
