/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Chat.java
 *
 * Created on 25 Νοε 2011, 11:44:48 πμ
 */
package assignment2;

/**
 *
 * @author koutsop
 */
public class Chat extends javax.swing.JPanel {

    /** Creates new form Chat */
    public Chat() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upPanel = new widgets.panel.AdaptivePanel();
        videoCallButton = new widgets.button.AdaptiveButton();
        callButton = new widgets.button.AdaptiveButton();
        exitButton = new widgets.button.AdaptiveButton();
        chatPanel = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();
        adaptiveButton2 = new widgets.button.AdaptiveButton();

        setMaximumSize(new java.awt.Dimension(757, 622));
        setMinimumSize(new java.awt.Dimension(757, 622));
        setPreferredSize(new java.awt.Dimension(757, 622));
        setLayout(new java.awt.BorderLayout());

        videoCallButton.setText("Video Call");
        upPanel.add(videoCallButton);

        callButton.setText("Call");
        upPanel.add(callButton);

        exitButton.setText("Exit");
        upPanel.add(exitButton);

        add(upPanel, java.awt.BorderLayout.PAGE_START);

        chatPanel.setLayout(new java.awt.BorderLayout());

        adaptiveButton1.setText("adaptiveButton1");
        chatPanel.add(adaptiveButton1, java.awt.BorderLayout.CENTER);

        adaptiveButton2.setText("adaptiveButton2");
        chatPanel.add(adaptiveButton2, java.awt.BorderLayout.PAGE_END);

        add(chatPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.button.AdaptiveButton adaptiveButton2;
    private widgets.button.AdaptiveButton callButton;
    private widgets.panel.AdaptivePanel chatPanel;
    private widgets.button.AdaptiveButton exitButton;
    private widgets.panel.AdaptivePanel upPanel;
    private widgets.button.AdaptiveButton videoCallButton;
    // End of variables declaration//GEN-END:variables
}
