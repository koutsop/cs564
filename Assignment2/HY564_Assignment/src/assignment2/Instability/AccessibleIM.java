/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AccessibleIM.java
 *
 * Created on 25 Νοε 2011, 12:23:30 μμ
 */
package assignment2.Instability;

//import assignment2.NoDisability.AddContact;
import assignment2.AccessibleIMInterface;
import assignment2.AdaptableViews.AdaptableChatMainView;
import assignment2.Exit;
import assignment2.NoDisability.ChatMainView;
import assignment2.NoDisability.SettingsMainView;
import java.awt.Dimension;
import javax.swing.JPanel;
import utilities.Adaptation;

/**
 *
 * @author koutsop
 */
public class AccessibleIM extends javax.swing.JPanel implements AccessibleIMInterface {

    /** Creates new form AccessibleIM */
    public AccessibleIM() {
        initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        imButton.setVisible(false);
		int width  = menuPanel.getPreferredSize().width + virtualKeyboardPanel.getPreferredSize().width;
		int height = menuPanel.getPreferredSize().height + virtualKeyboardPanel.getPreferredSize().height;
		showPanel(new AdaptableChatMainView(new Dimension(width, height)));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new widgets.panel.AdaptivePanel();
        imButton = new widgets.button.MainMenuButton();
        settingsButton = new widgets.button.MainMenuButton();
        exitButton = new widgets.button.MainMenuButton();
        contentsPanel = new widgets.panel.AdaptivePanel();
        virtualKeyboardPanel = new widgets.panel.AdaptivePanel();
        gapKeyboardNorthPanel = new widgets.panel.AdaptivePanel();
        keyboardPanel = new widgets.panel.AdaptivePanel();
        adaptiveButton2 = new widgets.button.AdaptiveButton();
        adaptiveButton3 = new widgets.button.AdaptiveButton();
        adaptiveButton4 = new widgets.button.AdaptiveButton();
        adaptiveButton5 = new widgets.button.AdaptiveButton();
        adaptiveButton6 = new widgets.button.AdaptiveButton();
        adaptiveButton7 = new widgets.button.AdaptiveButton();
        adaptiveButton8 = new widgets.button.AdaptiveButton();
        adaptiveButton9 = new widgets.button.AdaptiveButton();
        adaptiveButton10 = new widgets.button.AdaptiveButton();
        adaptiveButton11 = new widgets.button.AdaptiveButton();
        adaptiveButton12 = new widgets.button.AdaptiveButton();
        adaptiveButton13 = new widgets.button.AdaptiveButton();
        adaptiveButton14 = new widgets.button.AdaptiveButton();
        adaptiveButton15 = new widgets.button.AdaptiveButton();
        adaptiveButton16 = new widgets.button.AdaptiveButton();
        adaptiveButton17 = new widgets.button.AdaptiveButton();
        adaptiveButton18 = new widgets.button.AdaptiveButton();
        adaptiveButton19 = new widgets.button.AdaptiveButton();
        adaptiveButton20 = new widgets.button.AdaptiveButton();
        adaptiveButton21 = new widgets.button.AdaptiveButton();
        adaptiveButton22 = new widgets.button.AdaptiveButton();
        adaptiveButton23 = new widgets.button.AdaptiveButton();
        adaptiveButton24 = new widgets.button.AdaptiveButton();
        adaptiveButton25 = new widgets.button.AdaptiveButton();
        adaptiveButton26 = new widgets.button.AdaptiveButton();
        adaptiveButton27 = new widgets.button.AdaptiveButton();
        adaptiveButton28 = new widgets.button.AdaptiveButton();
        adaptiveButton29 = new widgets.button.AdaptiveButton();
        adaptiveButton30 = new widgets.button.AdaptiveButton();
        adaptiveButton31 = new widgets.button.AdaptiveButton();
        adaptiveButton32 = new widgets.button.AdaptiveButton();
        adaptiveButton33 = new widgets.button.AdaptiveButton();
        adaptiveButton34 = new widgets.button.AdaptiveButton();
        adaptiveButton35 = new widgets.button.AdaptiveButton();
        adaptiveButton36 = new widgets.button.AdaptiveButton();
        adaptiveButton37 = new widgets.button.AdaptiveButton();
        adaptiveButton38 = new widgets.button.AdaptiveButton();
        adaptiveButton39 = new widgets.button.AdaptiveButton();
        adaptiveButton40 = new widgets.button.AdaptiveButton();
        adaptiveButton41 = new widgets.button.AdaptiveButton();

        setMaximumSize(new java.awt.Dimension(1000, 688));
        setMinimumSize(new java.awt.Dimension(1000, 688));
        setPreferredSize(new java.awt.Dimension(1000, 688));
        setLayout(new java.awt.BorderLayout());

        menuPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        imButton.setText("Πίσω σε ...");
        imButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imButtonActionPerformed(evt);
            }
        });
        menuPanel.add(imButton);

        settingsButton.setText("Ρυθμίσεις");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        menuPanel.add(settingsButton);

        exitButton.setText("Έξοδος");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        menuPanel.add(exitButton);

        add(menuPanel, java.awt.BorderLayout.NORTH);

        contentsPanel.setLayout(new javax.swing.BoxLayout(contentsPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(contentsPanel, java.awt.BorderLayout.CENTER);

        virtualKeyboardPanel.setLayout(new java.awt.BorderLayout());

        gapKeyboardNorthPanel.setMinimumSize(new java.awt.Dimension(10, 20));
        gapKeyboardNorthPanel.setPreferredSize(new java.awt.Dimension(10, 20));
        virtualKeyboardPanel.add(gapKeyboardNorthPanel, java.awt.BorderLayout.NORTH);

        keyboardPanel.setLayout(new java.awt.GridLayout(4, 10, 10, 10));

        adaptiveButton2.setFunction("VirtualKeyboardButton");
        adaptiveButton2.setText("1");
        keyboardPanel.add(adaptiveButton2);

        adaptiveButton3.setFunction("VirtualKeyboardButton");
        adaptiveButton3.setText("2");
        keyboardPanel.add(adaptiveButton3);

        adaptiveButton4.setFunction("VirtualKeyboardButton");
        adaptiveButton4.setText("3");
        keyboardPanel.add(adaptiveButton4);

        adaptiveButton5.setFunction("VirtualKeyboardButton");
        adaptiveButton5.setText("4");
        keyboardPanel.add(adaptiveButton5);

        adaptiveButton6.setFunction("VirtualKeyboardButton");
        adaptiveButton6.setText("5");
        keyboardPanel.add(adaptiveButton6);

        adaptiveButton7.setFunction("VirtualKeyboardButton");
        adaptiveButton7.setText("6");
        keyboardPanel.add(adaptiveButton7);

        adaptiveButton8.setFunction("VirtualKeyboardButton");
        adaptiveButton8.setText("7");
        keyboardPanel.add(adaptiveButton8);

        adaptiveButton9.setFunction("VirtualKeyboardButton");
        adaptiveButton9.setText("8");
        keyboardPanel.add(adaptiveButton9);

        adaptiveButton10.setFunction("VirtualKeyboardButton");
        adaptiveButton10.setText("9");
        keyboardPanel.add(adaptiveButton10);

        adaptiveButton11.setFunction("VirtualKeyboardButton");
        adaptiveButton11.setText("0");
        keyboardPanel.add(adaptiveButton11);

        adaptiveButton12.setFunction("VirtualKeyboardButton");
        adaptiveButton12.setText("Q");
        keyboardPanel.add(adaptiveButton12);

        adaptiveButton13.setFunction("VirtualKeyboardButton");
        adaptiveButton13.setText("W");
        keyboardPanel.add(adaptiveButton13);

        adaptiveButton14.setFunction("VirtualKeyboardButton");
        adaptiveButton14.setText("E");
        keyboardPanel.add(adaptiveButton14);

        adaptiveButton15.setFunction("VirtualKeyboardButton");
        adaptiveButton15.setText("R");
        keyboardPanel.add(adaptiveButton15);

        adaptiveButton16.setFunction("VirtualKeyboardButton");
        adaptiveButton16.setText("T");
        keyboardPanel.add(adaptiveButton16);

        adaptiveButton17.setFunction("VirtualKeyboardButton");
        adaptiveButton17.setText("Y");
        keyboardPanel.add(adaptiveButton17);

        adaptiveButton18.setFunction("VirtualKeyboardButton");
        adaptiveButton18.setText("U");
        keyboardPanel.add(adaptiveButton18);

        adaptiveButton19.setFunction("VirtualKeyboardButton");
        adaptiveButton19.setText("I");
        keyboardPanel.add(adaptiveButton19);

        adaptiveButton20.setFunction("VirtualKeyboardButton");
        adaptiveButton20.setText("O");
        keyboardPanel.add(adaptiveButton20);

        adaptiveButton21.setFunction("VirtualKeyboardButton");
        adaptiveButton21.setText("P");
        keyboardPanel.add(adaptiveButton21);

        adaptiveButton22.setFunction("VirtualKeyboardButton");
        adaptiveButton22.setText("A");
        keyboardPanel.add(adaptiveButton22);

        adaptiveButton23.setFunction("VirtualKeyboardButton");
        adaptiveButton23.setText("S");
        keyboardPanel.add(adaptiveButton23);

        adaptiveButton24.setFunction("VirtualKeyboardButton");
        adaptiveButton24.setText("D");
        keyboardPanel.add(adaptiveButton24);

        adaptiveButton25.setFunction("VirtualKeyboardButton");
        adaptiveButton25.setText("F");
        keyboardPanel.add(adaptiveButton25);

        adaptiveButton26.setFunction("VirtualKeyboardButton");
        adaptiveButton26.setText("G");
        keyboardPanel.add(adaptiveButton26);

        adaptiveButton27.setFunction("VirtualKeyboardButton");
        adaptiveButton27.setText("H");
        keyboardPanel.add(adaptiveButton27);

        adaptiveButton28.setFunction("VirtualKeyboardButton");
        adaptiveButton28.setText("J");
        keyboardPanel.add(adaptiveButton28);

        adaptiveButton29.setFunction("VirtualKeyboardButton");
        adaptiveButton29.setText("K");
        keyboardPanel.add(adaptiveButton29);

        adaptiveButton30.setFunction("VirtualKeyboardButton");
        adaptiveButton30.setText("L");
        keyboardPanel.add(adaptiveButton30);

        adaptiveButton31.setFunction("VirtualKeyboardButton");
        adaptiveButton31.setText("ENTER");
        keyboardPanel.add(adaptiveButton31);

        adaptiveButton32.setFunction("VirtualKeyboardButton");
        adaptiveButton32.setText("Z");
        keyboardPanel.add(adaptiveButton32);

        adaptiveButton33.setFunction("VirtualKeyboardButton");
        adaptiveButton33.setText("X");
        keyboardPanel.add(adaptiveButton33);

        adaptiveButton34.setFunction("VirtualKeyboardButton");
        adaptiveButton34.setText("C");
        keyboardPanel.add(adaptiveButton34);

        adaptiveButton35.setFunction("VirtualKeyboardButton");
        adaptiveButton35.setText("V");
        keyboardPanel.add(adaptiveButton35);

        adaptiveButton36.setFunction("VirtualKeyboardButton");
        adaptiveButton36.setText("B");
        keyboardPanel.add(adaptiveButton36);

        adaptiveButton37.setFunction("VirtualKeyboardButton");
        adaptiveButton37.setText("N");
        keyboardPanel.add(adaptiveButton37);

        adaptiveButton38.setFunction("VirtualKeyboardButton");
        adaptiveButton38.setText("M");
        keyboardPanel.add(adaptiveButton38);

        adaptiveButton39.setFunction("VirtualKeyboardButton");
        adaptiveButton39.setText("Left");
        keyboardPanel.add(adaptiveButton39);

        adaptiveButton40.setFunction("VirtualKeyboardButton");
        adaptiveButton40.setText("Right");
        keyboardPanel.add(adaptiveButton40);

        adaptiveButton41.setFunction("VirtualKeyboardButton");
        adaptiveButton41.setText("space");
        keyboardPanel.add(adaptiveButton41);

        virtualKeyboardPanel.add(keyboardPanel, java.awt.BorderLayout.CENTER);

        add(virtualKeyboardPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(JPanel p) {
        contentsPanel.removeAll();
        p.setVisible(true);
        contentsPanel.add(p);
        contentsPanel.repaint();
        contentsPanel.validate();  
    }
    
    private void imButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imButtonActionPerformed
        ShowIMButton(false);
		int width  = menuPanel.getPreferredSize().width + virtualKeyboardPanel.getPreferredSize().width;
		int height = menuPanel.getPreferredSize().height + virtualKeyboardPanel.getPreferredSize().height;
        showPanel(new AdaptableChatMainView(new Dimension(width, height)));
    }//GEN-LAST:event_imButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        ShowIMButton(true);
        showPanel(new SettingsMainView());	//TODO Edw 8elei mipos ton patera?
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        ShowIMButton(true);
        showPanel(new Exit());        
    }//GEN-LAST:event_exitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton10;
    private widgets.button.AdaptiveButton adaptiveButton11;
    private widgets.button.AdaptiveButton adaptiveButton12;
    private widgets.button.AdaptiveButton adaptiveButton13;
    private widgets.button.AdaptiveButton adaptiveButton14;
    private widgets.button.AdaptiveButton adaptiveButton15;
    private widgets.button.AdaptiveButton adaptiveButton16;
    private widgets.button.AdaptiveButton adaptiveButton17;
    private widgets.button.AdaptiveButton adaptiveButton18;
    private widgets.button.AdaptiveButton adaptiveButton19;
    private widgets.button.AdaptiveButton adaptiveButton2;
    private widgets.button.AdaptiveButton adaptiveButton20;
    private widgets.button.AdaptiveButton adaptiveButton21;
    private widgets.button.AdaptiveButton adaptiveButton22;
    private widgets.button.AdaptiveButton adaptiveButton23;
    private widgets.button.AdaptiveButton adaptiveButton24;
    private widgets.button.AdaptiveButton adaptiveButton25;
    private widgets.button.AdaptiveButton adaptiveButton26;
    private widgets.button.AdaptiveButton adaptiveButton27;
    private widgets.button.AdaptiveButton adaptiveButton28;
    private widgets.button.AdaptiveButton adaptiveButton29;
    private widgets.button.AdaptiveButton adaptiveButton3;
    private widgets.button.AdaptiveButton adaptiveButton30;
    private widgets.button.AdaptiveButton adaptiveButton31;
    private widgets.button.AdaptiveButton adaptiveButton32;
    private widgets.button.AdaptiveButton adaptiveButton33;
    private widgets.button.AdaptiveButton adaptiveButton34;
    private widgets.button.AdaptiveButton adaptiveButton35;
    private widgets.button.AdaptiveButton adaptiveButton36;
    private widgets.button.AdaptiveButton adaptiveButton37;
    private widgets.button.AdaptiveButton adaptiveButton38;
    private widgets.button.AdaptiveButton adaptiveButton39;
    private widgets.button.AdaptiveButton adaptiveButton4;
    private widgets.button.AdaptiveButton adaptiveButton40;
    private widgets.button.AdaptiveButton adaptiveButton41;
    private widgets.button.AdaptiveButton adaptiveButton5;
    private widgets.button.AdaptiveButton adaptiveButton6;
    private widgets.button.AdaptiveButton adaptiveButton7;
    private widgets.button.AdaptiveButton adaptiveButton8;
    private widgets.button.AdaptiveButton adaptiveButton9;
    private widgets.panel.AdaptivePanel contentsPanel;
    private widgets.button.MainMenuButton exitButton;
    private widgets.panel.AdaptivePanel gapKeyboardNorthPanel;
    private widgets.button.MainMenuButton imButton;
    private widgets.panel.AdaptivePanel keyboardPanel;
    private widgets.panel.AdaptivePanel menuPanel;
    private widgets.button.MainMenuButton settingsButton;
    private widgets.panel.AdaptivePanel virtualKeyboardPanel;
    // End of variables declaration//GEN-END:variables

	public void ShowIMButton(boolean show) {
		imButton.setVisible(show);
	}
}
