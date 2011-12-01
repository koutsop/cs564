/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdaptableVideoCall.java
 *
 * Created on 29 Νοε 2011, 12:53:38 πμ
 */
package AdaptableWindows;

import java.awt.CardLayout;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class AdaptableVideoCall extends javax.swing.JPanel {
	final static String viewCommonChat	= "Chat";
    final static String viewSpotChat	= "SpotChat";	
	JPanel p = new JPanel(new CardLayout());
	
	/** Creates new form AdaptableVideoCall */
	public AdaptableVideoCall() {
        initComponents();
        
        p.add(new assignment2.VideoCall(), viewCommonChat);
        p.add(new assignment2.Spots.VideoCall(), viewSpotChat);
        this.add(p);

        CardLayout cl = (CardLayout)(p.getLayout());
        String pid = DMSLConnector.getInstance().getClient(false).Evaluate("SpotChat");
        System.out.println("Video Call View:" + pid);
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
