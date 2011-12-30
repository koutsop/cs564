/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdaptableChatMainView.java
 *
 * Created on 3 Δεκ 2011, 3:08:30 μμ
 */
package assignment2.AdaptableViews;

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class AdaptableChatMainView extends javax.swing.JPanel {

	final static String viewA = "CommonChatMainView";
    final static String viewB = "LowVisionChatMainView";

    JPanel p = new JPanel(new CardLayout());	
	
	/** Creates new form AdaptableChatMainView */
	public AdaptableChatMainView(Dimension menuSize) {
        initComponents();
		
		p.add(new assignment2.NoDisability.ChatMainView(menuSize), viewA);
        p.add(new assignment2.LowVision.ChatMainView(menuSize), viewB);
		
        this.add(p);

        CardLayout cl = (CardLayout)(p.getLayout());
        String pid = DMSLConnector.getInstance().getClient(false).Evaluate("MainIMChatView");
        System.out.println("Main Chat View:" + pid);
        cl.show(p, pid);
        p.revalidate();
        
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        this.updateUI();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}