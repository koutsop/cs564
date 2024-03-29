/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdaptableMyProfile.java
 *
 * Created on 29 Νοε 2011, 8:46:54 πμ
 */
package assignment2.AdaptableViews;

import java.awt.CardLayout;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class AdaptableMyProfile extends javax.swing.JPanel {
	final static String viewCommonProfile		= "CommonProfile";
    final static String viewSpotProfile			= "SpotProfile";	
	final static String viewLowVisionProfile	= "LowVisionProfile";
	JPanel p = new JPanel(new CardLayout());
	
	/** Creates new form AdaptableMyProfile */
	public AdaptableMyProfile() {
        initComponents();
		
        p.add(new assignment2.MyProfile(), viewCommonProfile);
        p.add(new assignment2.Spots.MyProfile(), viewSpotProfile);
		p.add(new assignment2.LowVision.MyProfile(), viewLowVisionProfile);
        this.add(p);

        CardLayout cl = (CardLayout)(p.getLayout());
        String pid = DMSLConnector.getInstance().getClient(false).Evaluate("AdaptableMyProfile");
        System.out.println("Profile View:" + pid);
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
